package com.taskesnoad.outlub.pojo;

public class Catogray {

    private String name,image,key;

    public Catogray(String name, String image, String key) {
        this.name = name;
        this.image = image;
        this.key = key;
    }

    public Catogray() {
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
