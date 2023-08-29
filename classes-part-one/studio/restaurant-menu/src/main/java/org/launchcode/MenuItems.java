package org.launchcode;

import java.util.Date;

public class MenuItems {

    private Date updatedAt = new Date();

    private String name;

    private Double price;

    private String description;

    private String category;

    private Boolean isNew;

    public MenuItems(String name, double price, String description, String category, Boolean isNew) {   // , Date updatedAt
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
//        this.updatedAt = updatedAt;
    }

    // Getters
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

    public Boolean isNew() {
        return isNew;
    }

//    public Date getUpdatedAt() {
//        return updatedAt;
//    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }
}
