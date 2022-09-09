package com.platzimarket.domain;

public class Category {

    private int categoryTd;
    private String category;
    private boolean active;

    public int getCategoryTd() {
        return categoryTd;
    }

    public void setCategoryTd(int categoryTd) {
        this.categoryTd = categoryTd;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
