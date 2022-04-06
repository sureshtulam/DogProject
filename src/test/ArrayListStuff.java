package test;

import java.util.*;
import java.io.*;

public class ArrayListStuff
{
	public static void main(String[] args) throws Exception
	{
		double[] numbers=new double[5];
		Scanner myScanner = new Scanner(new File("test.txt"));
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		int numIn;
		while((numIn = myScanner.nextInt()) != -1)
		{
			myNums.add(numIn);
			System.out.print(numIn + " ");
		}
		System.out.println();
		ArrayList<Dog> myDogs = new ArrayList<Dog>();
		
		while(myScanner.hasNext())
		{
			myDogs.add(new Dog(myScanner.next(), myScanner.nextInt()));
			System.out.println("size of myDogs = " + myDogs.size());
		}
		for(Dog myDog : myDogs)
		{
			System.out.println(myDog);
		}
		System.out.println(myDogs.get(2));
		
		myNums.set(2, 47);
		System.out.println(myNums);
		myDogs.add(new Dog("Page",1));
		for(Dog myDog : myDogs)
		{
			System.out.println(myDog);
		}
		System.out.println(myDogs.get(3));
		
		System.out.println(myDogs.size()+" "+myNums.size());
		myNums.add(5, 250);
		System.out.println(myDogs.remove(1));
		System.out.println(myNums);
		for(Dog myDog : myDogs)
		{
			System.out.println(myDog);
		}
		System.out.println(myNums.toString());

	}
}
