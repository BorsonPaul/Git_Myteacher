package com.example.my_teacher;

public class Get_student_Data {
    String image, title, date, time;


    public Get_student_Data() {
    }


    public Get_student_Data(String image, String title, String date, String time) {
        this.image = image;
        this.title = title;
        this.date = date;
        this.time = time;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
