package com.example.arunr.playstoreapp.model;

/**
 * Created by arun.r on 02-05-2018.
 */

public class SingleItemModel {

    private String name;
    private String url;
    private String description;

    public SingleItemModel() {

    }

    public SingleItemModel(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
