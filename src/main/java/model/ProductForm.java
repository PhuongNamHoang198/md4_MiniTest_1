package model;

import org.springframework.web.multipart.MultipartFile;

public class ProductForm {
    private String id;
    private String name;
    private double price;
    private MultipartFile img;

    public ProductForm() {
    }

    public ProductForm(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductForm(String id, String name, double price, MultipartFile img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}
