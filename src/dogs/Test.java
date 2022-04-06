/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dogs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author s546295
 */
public class Test {
    public static void main(String[] args) {
//        Dog dog=new Dog("bubmblebee","retriever",2);
//        
//        System.out.println(dog.getBreed());
//        System.out.println(dog.getName());
//        dog.setAge(5);
//        System.out.println(dog.getAge());
//          System.out.println("length of dog name is:"+dog.getName().length());
//          System.out.println(dog);
//          
//          test2 tn=new test2(123);
//          System.out.println(tn.toString());
    	
    	String readingTransactionLine="DEPOSIT 1000.00 2022-02-02 08:42:02";
		String[] values=readingTransactionLine.split(" ");
		
		
		String[] dateValues=values[2].split("-");
		String[] timeValues=values[3].split(":");
		LocalDateTime datetime=LocalDateTime.of(LocalDate.of(Integer.parseInt(dateValues[0]), Integer.parseInt(dateValues[1]), Integer.parseInt(dateValues[2])),LocalTime.of(Integer.parseInt(timeValues[0]), Integer.parseInt(timeValues[1]), Integer.parseInt(timeValues[2])));
		System.out.println(datetime);
          
        
    }
    
}
