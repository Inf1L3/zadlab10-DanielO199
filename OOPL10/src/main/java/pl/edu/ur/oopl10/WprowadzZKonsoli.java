package pl.edu.ur.oopl10;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
    
    
    public void ToFileText() throws IOException {
        String nazwa;
        System.out.println("Podaj nazwę pliku: ");
        nazwa = input.nextLine();

        try {
            FileWriter fwo = new FileWriter(nazwa);
           BufferedWriter bwo = new BufferedWriter(fwo);
           String text;
           System.out.println("Wpisz tekst do pliku: ");
            text = input.nextLine();
            bwo.write(text);
           bwo.newLine();
           bwo.close();

        } catch (IOException e) {
            System.out.println("Zle zapisane wartosci");
         }

     }
    
    
    public void FromFileText() throws FileNotFoundException, IOException {
        String nazwa;
        System.out.println("Podaj nazwe pliku z ktorego chcesz odczytac tekst");
        nazwa = input.nextLine();
        try {
            FileReader fr = new FileReader(nazwa);
            BufferedReader br = new BufferedReader(fr);

            String text = br.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }

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
