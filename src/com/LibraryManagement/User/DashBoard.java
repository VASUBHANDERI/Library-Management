package com.LibraryManagement.User;

import com.LibraryManagement.Assets.Assets;
import com.LibraryManagement.Functions.Functions;

import java.util.Scanner;

import static java.lang.System.exit;

public class DashBoard {
    static Assets assets = new Assets();
    static Scanner sc = new Scanner(System.in);
    public static void dashboard(){
        assets.line();
        assets.Dashboard();
        assets.line();


        System.out.println("1. Add Book");
        System.out.println("2. Show Books");
        System.out.println("3. Issue Book");
        System.out.println("4. Show Issued Books");
        System.out.println("5. Clear the history");
        System.out.println("6. Exit");

        while(true) {
            assets.line();
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    assets.line();
                    assets.AddBook();
                    assets.line();
                    Functions.add();
                    break;
                case 2:
                    assets.line();
                    assets.BookReg();
                    assets.line();
                    Functions.showBooks();
                    break;
                case 3:
                    assets.line();
                    assets.IssueBook();
                    assets.line();
                    Functions.issue();
                    break;
                case 4:
                    assets.line();
                    assets.IssueBookReg();
                    assets.line();
                    Functions.showIssuedBooks();
                    break;
                case 5:
                    Functions.clearFiles();
                    break;
                case 6:
                    assets.Thanks();
                    exit(0);
                    break;
                default:
                    System.out.println("Enter the valid choice!");
                    break;
            }
        }
    }
}
