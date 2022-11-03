package com.LibraryManagement.Structures;

import com.LibraryManagement.Functions.getDate;

public class issueBook {
    public String id;
    public String name;
    public String author;
    public String studentName;
    public String rollNo;
    public String issueDate;

    public issueBook(String id, String name, String author, String studentName,String rollNo) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.studentName = studentName;
        this.issueDate = getDate.GetDate();
    }

    public issueBook() {
    }


}
