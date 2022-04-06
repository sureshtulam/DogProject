/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Muli_Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author S541906
 */
public class Problem05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pattern pattern = Pattern.compile("\\bjava\\b");
        String string1 = "subject is java";
        String string2 = "javasubject";
        Matcher match1 = pattern.matcher(string1);
        Matcher match2 = pattern.matcher(string2);
         if(match1.find())
           System.out.println(string1+ " Is Matching");
        else
            System.out.println(string1 + " Is Not Matching");
         
         if(match2.find())
           System.out.println(string2 + " Is Matching");
        else
            System.out.println(string2 + " Is Not Matching");
    
       
      String str1 = "Aspiring to become a java developer as a java developer";
        int count = 0;
        String str2 = "java";
        Pattern pat = Pattern.compile(str2);
        Matcher mat = pat.matcher(str1);
        while (mat.find()) {
            count++;
        }
        System.out.println("Count of the word java in the given string is: " + count);
    }
}

    

