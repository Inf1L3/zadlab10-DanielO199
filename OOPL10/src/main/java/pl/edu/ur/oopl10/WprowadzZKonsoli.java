package pl.edu.ur.oopl10;
import java.util.Scanner;

public class WprowadzZKonsoli {
    
    Scanner input = new Scanner(System.in);
  //ZAD 1
    
    public void WprowadzInt(){
        
    try{
        System.out.println("Wprowadz liczbe calkowita:");
       int b=input.nextInt();
        System.out.println(b);
    } catch(RuntimeException e){
    
        System.out.println("Niepoprawny typ zmiennej");
    }
    
    }
    
    public void WprowadzString(){
    
    try{
        System.out.println("Wprowadz String:");
        String c=input.next();
    }
    catch(RuntimeException e){
    System.out.println("Niepoprawny typ zmiennej");
    }
    }
    
    
    public void WprowadzFloat(){
    
    try{
        System.out.println("Wprowadz liczbe rzeczywista:");
        float c=input.nextFloat();
    }
    catch(RuntimeException e){
    System.out.println("Niepoprawny typ zmiennej");
    }
    }
    
    //ZAD 2
    public void tablica(){
    
        try{
            int tab[]=new int[10];
            for(int i=0;i<100;i++){
                tab[i]=input.nextInt();
            
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e){
        
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        
}
    
    
}
