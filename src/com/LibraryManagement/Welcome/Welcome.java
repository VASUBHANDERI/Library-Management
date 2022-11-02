package com.LibraryManagement.Welcome;

import com.LibraryManagement.Assets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Assets assets = new Assets();

        assets.MainHeading();
        assets.line();
        assets.Welcome();
        assets.line();

        System.out.println("# Choose Your Role");
        System.out.println("\n");
        System.out.println("  1. User");
        System.out.println("  2. Admin");
        boolean validRole=false;
        String myRole="";
        while(!validRole) {
            validRole=true;
            int role = sc.nextInt();
                switch (role) {
                    case 1:
                        myRole = "User";
                        break;
                    case 2:
                        myRole = "Admin";
                        break;
                    default:
                        System.out.println("Please enter choose the valid role!");
                        validRole=false;
                }
        }


        File roles = new File("roles.txt");


        try{
            roles.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create roles.txt file");
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter = new FileWriter("roles.txt");
            fileWriter.write(myRole);
            fileWriter.close();

        } catch (IOException e){
            System.out.println("Unable to write in roles.txt file");
            throw new RuntimeException(e);
        }

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
