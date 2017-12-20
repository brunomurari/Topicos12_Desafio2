package com.example.bruno.topicos12_desafio2;

/**
 * Created by bruno on 20/12/2017.
 */

public class Foo {
    private int id;
    private String name;
    private String image;
    private String description;
    private String site;


    public Foo (int id, String name, String image, String description, String site) {
        this.setId(id);
        this.setName(name);
        this.setImage(image);
        this.setDescription(description);
        this.setSite(site);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
