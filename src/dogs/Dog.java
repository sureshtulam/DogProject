/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dogs;

/**
 *
 * @author s546295
 */
public class Dog {
    private String name,breed;
	
    private int age;
    
    
    
    
        public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	///constructor
	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
        public Dog() {
		
	}
        
        public String toString(){
return "Dog name:"+this.name+"\ndog breed:"+this.breed+"\ndog age:"+this.age;
}
        
	
    
}
