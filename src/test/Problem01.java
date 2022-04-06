/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author S541906
 */
public class Problem01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{0,7}$");
        String string1 = "Unpuzzle";
        String string2 = "unpuzzle";
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
    }
    
}
