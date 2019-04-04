package com.cablesapps.whitespider;

public class Note {
    private String title;
    private String description;
    private String image;
    private int priority;


    public Note(){
        // empty constructor needed for firebase
    }

    public Note(String title, String description, int priority, String image){
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getImage(){
        return image;
    }
}
