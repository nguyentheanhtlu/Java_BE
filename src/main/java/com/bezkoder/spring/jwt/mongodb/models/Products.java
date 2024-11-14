package com.bezkoder.spring.jwt.mongodb.models;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class Products {

    @Id
    private String Id;

    @NotBlank
    @Size(max = 120)
    private String nameProduct;

    @NotBlank
    private Boolean types;

    private String description;

    private String image;

    private String category;

    private Integer price;

    @DBRef User user;

    public Products(String id, String nameProduct, Boolean types, String description, String image, String category, Integer price, User user) {
        Id = id;
        this.nameProduct = nameProduct;
        this.types = types;
        this.description = description;
        this.image = image;
        this.category = category;
        this.price = price;
        this.user = user;
    }

    public Products() {

    }

    public String getId() {
        return Id;
    }

    public @NotBlank @Size(max = 120) String getNameProduct() {
        return nameProduct;
    }

    public @NotBlank Boolean getTypes() {
        return types;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public Integer getPrice() {
        return price;
    }

    public User getUser() {
        return user;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setNameProducts(@NotBlank @Size(max = 120) String name) {
        this.nameProduct = name;
    }

    public void setTypes(@NotBlank Boolean types) {
        this.types = types;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
