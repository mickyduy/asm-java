/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm;

import View.admin.movie.Movie;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args){
        MovieList ML = new MovieList();
//        Customer cs = new Customer("a",18,"a","abc");
        Movie movie = new Movie("a","a","a",18,100);
//        CustomerList CSL = new CustomerList(ML,cs,movie);
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do{
            System.out.println("------Movie------");
            System.out.println("1. Nhập tên phim vào file");
            System.out.println("4. in phim");
            System.out.println("2.in ra phim từ file");
            System.out.println("3. Xóa một phim");
            System.out.println("5. tạo tài khoản");
            System.out.println("6. chọn phim mua");
            System.out.println("7. in ra thông tin customer:");
            System.out.println("9. in ra thông tin khách hàng từ file");
            System.out.println("8. in ra phim đã mua");
            System.out.println("nhập số:");
            choose = sc.nextInt();
            sc.nextLine();
            if(choose == 1){
               ML.inputMovie();
               ML.inputMovieToFile();
            }
            else if(choose==2){
                ML.printMovietoFile();
            }
            else if(choose==3){
                System.out.println("Input id movie you want to remove");
                String id = sc.nextLine();
                ML.removeMovieById(id);
            }
            else if(choose == 4){
                ML.printMovie();
            }
//            else if(choose ==5){
//                CSL.newAccount();
//                CSL.inputCustomerToFile();
//            }
//            else if(choose == 6){
//                CSL.chooseMovie();
//            }
//            else if (choose == 7){
//                CSL.printCustomer();
//            }
//            else if( choose ==8){
//                CSL.printMovieCus();
//            }
//            else if(choose == 9){
//                CSL.printCustomertoFile();
//            }
        }while(choose!=0);
    }
}
