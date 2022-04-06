/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogs;

/**
 *
 * @author s546295
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog dog=new Dog();
        Dog dog1=new Dog("bubmblebee","retriever",2);
        Dog dog2=new Dog("tuttu","pug",5);
        Dog dog3=new Dog("bitsy","husky",6);
        
        dog1.setAge(11);
        
        
        
        System.out.println("Dog1 Details:[name/breed/age]  = "+dog1.getName()+","+dog1.getBreed()+","+dog1.getAge()+".");
        System.out.println("Dog2 Details:[name/breed/age]  = "+dog2.getName()+","+dog2.getBreed()+","+dog2.getAge()+".");
        System.out.println("Dog3 Details:[name/breed/age]  = "+dog3.getName()+","+dog3.getBreed()+","+dog3.getAge()+".");
         //System.out.println(dog1.getName());
        // System.out.println(dog1.getAge()+"\n\n");
     
        System.out.println(dog1.toString());
        
        int x,y=2;
        
        x=y++;
        System.out.println(x+" ,"+y);
    }
    
}
