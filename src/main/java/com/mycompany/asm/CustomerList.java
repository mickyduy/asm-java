/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm;

import View.admin.movie.Movie;
import View.admin.customer.Customer;
import java.io.FileInputStream;
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
public class CustomerList {
    private ArrayList<Customer> cus = new ArrayList<>();
    private ArrayList<Movie> purchasedMovies = new ArrayList<>();
    public MovieList mvl;
    public Customer customer;
    public Movie movie;
    public CustomerList(MovieList mvl, Customer customer, Movie movie){
        this.mvl = mvl;
        this.customer = customer;
        this.movie = movie;
    }
    
    public ArrayList<Customer> getCus() {
        return cus;
    }

    public void setCus(ArrayList<Customer> cus) {
        this.cus = cus;
    }
    public void newAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("tên của bạn:");
        String name = sc.nextLine();
        System.out.println("tuổi của bạn:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("tên tài khoản");
        String account = sc.nextLine();
        System.out.println("Your password:");
        String pass = sc.nextLine();
//        Customer cs = new Customer(name,age,account,pass);
//        this.cus.add(cs);
    }
    public void inputCustomerToFile(){
        try{
            OutputStream os = new FileOutputStream("C:\\asm-main\\b.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(Customer cs : cus){
                oos.writeObject(cus);
            }
            oos.flush();
            os.close();
            System.out.println("nhap thanh cong");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void printCustomertoFile(){
        try{
            ArrayList<Customer> cus = new ArrayList<>();
            InputStream is = new FileInputStream("D:\\run\\htdocs\\asm\\b.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
             cus = (ArrayList<Customer>) ois.readObject();   
             for (Customer cs : cus) {
                    System.out.println(cs);
                    System.out.println();
                }
				ois.close(); 
                                is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void printCustomer(){
        for(Customer customer : cus){
            System.out.println(customer);
        }
    }
    public void chooseMovie(){
        ArrayList<Movie> movies = mvl.getMv();
        Scanner sc = new Scanner(System.in);
        System.out.println("List of movies:");
        for(Movie movie : movies){
            System.out.println(movie);
        }
        System.out.println("enter your name movie you want watch:");
        String nm = sc.nextLine();
        for(Movie movie : movies){
            if(movie.getName().equalsIgnoreCase(nm)){
                if(customer.getAge()<movie.getAge()){
                    System.out.println("bạn không thể mua phim này");
                }
                else{
                    System.out.println("bạn có thể mua phim này:"+movie.getName());
                    addPurchasedMovie(movie);
                    System.out.println("phim " + movie+ " đã được lưu vào danh sách phim của bạn");
                }
            }
        }
    }
         public void addPurchasedMovie(Movie movie) {
        purchasedMovies.add(movie);
    }
     public void printMovieCus(){
         System.out.println(customer.getName() + " đã mua các phim sau:");
         for(Movie movie : purchasedMovies)
         {
             System.out.println(movie.getName());
         }
     }
}
