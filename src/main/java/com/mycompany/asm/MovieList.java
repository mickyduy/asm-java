/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm;

import View.admin.movie.Movie;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MovieList {
    private ArrayList<Movie> mv = new ArrayList<>();
    public MovieList() {
    }

    public ArrayList<Movie> getMv() {
        return mv;
    }

    public void setMv(ArrayList<Movie> mv) {
        this.mv = mv;
    }
    //1.nhập phim
    public void inputMovie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many movies do you want to import?");
        int a = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<a;i++){
            System.out.println("Enter Id movie:");
            String id = sc.nextLine();
             System.out.println("Enter Name Movie:");
        String name = sc.nextLine();
        System.out.println("Enter title Movie:");
        String title = sc.nextLine();
        System.out.println("age limit:");
        int Age = sc.nextInt();
        sc.nextLine();
        System.out.println("Price movie:");
        float price = sc.nextFloat();
        sc.nextLine();
        Movie mv1 = new Movie(id,name,title,Age,price);
        this.mv.add(mv1);
        }
    }
    //2. in phim
    public void printMovie(){
        for(Movie movie : mv){
            System.out.println(movie.toString());
        }
    }
    //3.đưa phim vào file
    public void inputMovieToFile(){
        try{
            OutputStream os = new FileOutputStream("D:\\run\\htdocs\\asm\\a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(Movie movie : mv){
                oos.writeObject(mv);
            }
            oos.flush();
            os.close();
            System.out.println("nhap thanh cong");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    //4. in phim từ file ra
    public void printMovietoFile(){
        try{
            ArrayList<Movie> mv = new ArrayList<>();
            InputStream is = new FileInputStream("D:\\run\\htdocs\\asm\\a.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
             mv = (ArrayList<Movie>) ois.readObject();   
             for (Movie movie : mv) {
                    System.out.println(movie);
                    System.out.println();
                }
				ois.close(); 
                                is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   // 4.Lấy ra số lượng movie trong danh sách.
    public int NumberofMovie(){
        return this.mv.size();
    }
    //5. xóa một movie theo id
   public void removeMovieById(String id) {
    for (Movie movie : mv) {
        if (movie.getId() == id) {
            mv.remove(movie);
            System.out.println("Movie with ID " + id + " has been removed.");
        }
    }
    System.out.println("Movie with ID " + id + " not found.");
}
}