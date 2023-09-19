package com.example.my_teacher;

public class Get_Image_Data {

    String image, category;

    public Get_Image_Data() {
    }

    public Get_Image_Data(String image, String category) {
        this.image = image;
        this.category = category;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
