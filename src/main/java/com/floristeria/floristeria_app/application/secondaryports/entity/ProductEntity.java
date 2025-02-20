package com.floristeria.floristeria_app.application.secondaryports.entity;

import com.floristeria.floristeria_app.crosscutting.helpers.NumericHelper;
import com.floristeria.floristeria_app.crosscutting.helpers.TextHelper;
import com.floristeria.floristeria_app.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "category")
    private String category;

    public UUID getId() {
        return id;
    }

    public ProductEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setDescription(TextHelper.EMPTY);
        setPrice(NumericHelper.DEFAULT_DOUBLE);
        setCategory(TextHelper.EMPTY);
    }

    public ProductEntity(UUID id, String name, String description, Double price, String category) {
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
    }

    public static ProductEntity create(){
        return new ProductEntity();
    }

    public static ProductEntity create(UUID id, String name, String description, Double price, String category){
        return new ProductEntity(id, name, description, price, category);
    }

    public ProductEntity setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = TextHelper.applyTrim(name);
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductEntity setDescription(String description) {
        this.description = TextHelper.applyTrim(description);
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ProductEntity setPrice(Double price) {
        this.price = NumericHelper.getDefaultValue(price);
        return this;
    }

    public String getCategory() {
        return category;
    }

    public ProductEntity setCategory(String category) {
        this.category = TextHelper.applyTrim(category);
        return this;
    }
}
