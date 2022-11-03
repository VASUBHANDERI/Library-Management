package com.LibraryManagement.Functions;

import com.LibraryManagement.Assets.Assets;
import com.LibraryManagement.Structures.Book;
import com.LibraryManagement.Structures.issueBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Functions {
    static Assets assets = new Assets();
    static File bookRegister = new File("BookRegister.txt");

    public static void CreateBookRegister(){
        try {
            bookRegister.createNewFile();
        } catch (IOException e){
            System.out.println("Unable to create BookRegister.txt");
            throw new RuntimeException(e);
        }
    }

    public static void clearFiles(){
        bookRegister.delete();
        issuedBookRegister.delete();
    }


    public static void showBooks(){
        try {

            Scanner sc = new Scanner(bookRegister);
            int count = 1;
            while (sc.hasNextLine()){
                assets.line();
                System.out.println("Sr No. : " + count);
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                count++;
            }
            assets.line();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
    }

    public static void add(){
        Scanner sc = new Scanner(System.in);
        String name;
        String id;
        String author;
        System.out.print("Enter the Book_Id : ");
        id = sc.nextLine();
        System.out.print("Enter the name of the Book : ");
        name = sc.nextLine();
        System.out.print("Enter the name of the Author : ");
        author = sc.next();
        Book book = new Book(id,name,author);

        try {
            FileWriter fileWriter = new FileWriter("BookRegister.txt ",true);
            fileWriter.write("Id : " + book.id + "\n" );
            fileWriter.write("Name : " +book.name + "\n" );
            fileWriter.write("Author : " +book.author + "\n" );
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write in this file");
            throw new RuntimeException(e);
        }

    }

    static File issuedBookRegister = new File("IssuedBookRegister.txt");

    public static void CreateIssuedBookRegister(){
        try {
            issuedBookRegister.createNewFile();
        } catch (IOException e){
            System.out.println("Unable to create BookRegister.txt");
            throw new RuntimeException(e);
        }
    }



    public static void issue(){
        Scanner sc = new Scanner(System.in);
        String name;
        String id;
        String author;
        String studentName;
        String rollNo;
        System.out.print("Enter the name of the Student : ");
        studentName=sc.nextLine();
        System.out.print("Enter the roll No. : ");
        rollNo=sc.nextLine();
        System.out.print("Enter the Book_Id : ");
        id = sc.nextLine();
        System.out.print("Enter the name of the Book : ");
        name = sc.nextLine();
        System.out.print("Enter the name of the Author : ");
        author = sc.nextLine();
        issueBook issuebook = new issueBook(id,name,author,studentName,rollNo);

        try {
            FileWriter fileWriter = new FileWriter("IssuedBookRegister.txt",true);
            fileWriter.write("Roll No. : "+issuebook.rollNo+"\n");
            fileWriter.write("Student : "+issuebook.studentName+"\n");
            fileWriter.write("Id : " + issuebook.id + "\n" );
            fileWriter.write("Name : " +issuebook.name + "\n" );
            fileWriter.write("Author : " +issuebook.author + "\n" );
            fileWriter.write("Issue Date : " +issuebook.issueDate + "\n" );
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write in this file");
            throw new RuntimeException(e);
        }

    }

    public static void showIssuedBooks(){
        try {
            Scanner sc = new Scanner(issuedBookRegister);
            int count = 1;
            while (sc.hasNextLine()){
                assets.line();
                System.out.println("Sr No. : " + count);
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                count++;
            }
            assets.line();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
    }


}
