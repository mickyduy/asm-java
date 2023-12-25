/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.admin.movie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Movie implements Comparable<Movie>,Serializable{
    private String Id;
    private String name;
    private String title;
    private int Age;
    private double price;

    public Movie(String Id, String name, String title, int Age, double price) {
        this.Id = Id;
        this.name = name;
        this.title = title;
        this.Age = Age;
        this.price = price;
    }
    

    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Movie{" + "Id=" + Id + ", name=" + name + ", title=" + title + ", Age=" + Age + ", price=" + price + '}';
    }
    
    

    @Override
    public int compareTo(Movie o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
