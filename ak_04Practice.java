package com.company;


  public class ak_04Practice {
		 
      public static void main(String[] args)
		    {
		        String str = "This is my String.";

		        
		        byte[] byte_str = str.getBytes();

		       
		        String new_str = new String(byte_str);

		      
		        System.out.println("The new String equals " +
		            new_str + "\n");
		    }
		}
	


