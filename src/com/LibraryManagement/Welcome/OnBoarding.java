package com.LibraryManagement.Welcome;

import com.LibraryManagement.Assets.Assets;
import com.LibraryManagement.User.DashBoard;

import java.util.Objects;
import java.util.Scanner;

public class OnBoarding {

    static Assets assets = new Assets();

    static Scanner sc = new Scanner(System.in);
    public static void login(String name,String password){
        assets.line();
        assets.Login();
        assets.line();
        System.out.print("Enter Your Name : ");
        String username = sc.nextLine();
        System.out.print("Enter the password : ");
        String mypassword = sc.nextLine();

        if(Objects.equals(username, name) && Objects.equals(password, mypassword)){
            System.out.println("Congratulations "+ name + " ! You are Logged In Succesfully.");
            DashBoard.dashboard();
        }else {
            System.out.println("Invalid Username or password !");
            login(name,password);

        }

    }

    public static void register(){
        assets.line();
        assets.Register();
        assets.line();

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the password : ");
        String password = sc.nextLine();
        System.out.print("Confirm the password : ");
        String confirmpassword = sc.nextLine();

        if(Objects.equals(password, confirmpassword)){
            System.out.println("Congratulations! You are Registerd Succesfully.");
            login(name,password);
        }
        else {
            System.out.println("Password dosen't match!");
            register();
        }
    }
    public static void main(String[] args){
        assets.line();
        assets.MainHeading();
        register();
    }
}
