package com.example.baithuchanh1;

public class User {
    private int id,image;
    private  String name,dateofbirth;

    public User() {
    }

    public User(int id, int image, String name, String dateofbirth) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.dateofbirth = dateofbirth;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public User(int id, String name, String dateofbirth) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
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

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
