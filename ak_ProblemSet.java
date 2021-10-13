package com.company;

public class ak_ProblemSet {
    
	   public static void main(String[] args)
	    {
	        String str1 = "Are you going out.";
	        String str2 = "it is my passion.";

	        
	        String startWord = "Are";

	       
	        boolean starts1 = str1.startsWith(startWord);
	        boolean starts2 = str2.startsWith(startWord);

	       
	        
	        if(starts1 == starts2) {
	        	System.out.println("Yes! it is");
	        }
	        else {
	        	System.out.println("No! its not");
	        }
	    }
	}
