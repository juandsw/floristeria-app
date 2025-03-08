package com.floristeria.floristeria_app.application.primaryports.dto;


import com.floristeria.floristeria_app.crosscutting.helpers.NumericHelper;
import com.floristeria.floristeria_app.crosscutting.helpers.TextHelper;
import com.floristeria.floristeria_app.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class ProductDTO {

    private UUID id;
    private String name;
    private String description;
    private Double price;
    private String category;

    public ProductDTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setDescription(TextHelper.EMPTY);
        setPrice(NumericHelper.DEFAULT_DOUBLE);
        setCategory(TextHelper.EMPTY);
    }

    public ProductDTO(UUID id, String name, String description, Double price, String category) {
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
    }

    //Getters

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    //Setters

    public void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public void setName(String name) {
        this.name = TextHelper.applyTrim(name);
    }

    public void setDescription(String description) {
        this.description = TextHelper.applyTrim(description);
    }


    public void setPrice(Double price) {
        this.price = NumericHelper.getDefaultValue(price);
    }

    public void setCategory(String category) {
        this.category = TextHelper.applyTrim(category);
    }


}
