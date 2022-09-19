package repository.product;

import model.Product;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ProductRepo implements IProductRepo {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p", Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(String id) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where  p.id=:id", Product.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Product product) {
        if (product.getId() != null) {
            entityManager.merge(product);
        } else {
            entityManager.persist(product);
        }
    }

    @Override
    public void remove(String id) {
        Product product = findById(id);
        if (product != null) {
            entityManager.remove(product);
        }
    }
}
