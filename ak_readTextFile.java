package com.company;

public class ak_readTextFile {
	public static void main(String[] args) throws Exception
    {
 
        
        File file = new File(
            "C:\\Users\\arjun\\Desktop\\arjun.txt");
 
        
 
        // Creating an object of BuffferedReader class
        BufferedReader br= new BufferedReader(new FileReader(file));
 
        
        String st;
        
        while ((st = br.readLine()) != null)
 
            
            System.out.println(st);
    }
}
