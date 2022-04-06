/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author S541906
 */
public class Problem02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.print("Please enter an matching sentence: ");
         
            Pattern pattern = Pattern.compile("^((The)|(An)|A)\\s.*");     
        Scanner scan=new Scanner(System.in);
        
          String matchString = scan.nextLine();
          
                  Matcher matcher1 = pattern.matcher(matchString);
                  boolean string1 = matcher1.find();
                  if(string1) {
                    System.out.println("The Sentence Entered Is Matching");
                  } else {
                    System.out.println("The Sentence Entered Is Not Matching");
                  }
        System.out.print("Please enter an non-matching sentence: ");  
          String notMatchString =scan.nextLine();    
                  Matcher matcher2 = pattern.matcher(notMatchString);
                  boolean string2 = matcher2.find();
                  if(string2) {
                    System.out.println("The Sentence Entered Is Matching");
                  } else {
                    System.out.println("The Sentence Entered Is Not Matching");
                  }
    }
    
    }
    

