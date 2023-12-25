/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.admin.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Customer implements Comparable<Customer>,Serializable{
    public String id;
    public String name;
    public int age;
    public String account;
    public String passWord;

    public Customer(){
    }
    public Customer(String id, String name, int age, String account, String passWord) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.account = account;
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", account=" + this.account + ", passWord=" + this.passWord + '}';
    }
    
    @Override
    public int compareTo(Customer o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
    
}
