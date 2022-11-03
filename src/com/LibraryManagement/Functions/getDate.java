package com.LibraryManagement.Functions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getDate {
    public static String GetDate (){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        String today = formatter.format(date);
        return today;
    }
}
