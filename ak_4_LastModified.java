package com.company;
import java.io.File;
import java.util.Date;
public class ak_4_LastModified{
	
   public static void main(String args[]) {
	   
      String filePath = "D://ExampleDirectory//";
      
      //Creating the File object
      File file = new File(filePath);
      
      //Getting the last modified time
      long lastModified = file.lastModified();
      
      Date date = new Date(lastModified);
      
      System.out.println("Given file was last modified at: ");
      System.out.println(date);
   }
}
