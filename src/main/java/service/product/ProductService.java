package service.product;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import repository.product.IProductRepo;

import java.util.List;

public class ProductService implements IProductService {
    @Autowired
    private IProductRepo productRepo;

    @Override
    public List<Product> findAll() {
       return productRepo.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRepo.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void remove(String id) {
        productRepo.remove(id);
    }
}
