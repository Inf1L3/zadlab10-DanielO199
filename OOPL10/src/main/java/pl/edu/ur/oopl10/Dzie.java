package pl.edu.ur.oopl10;

import java.util.Random;


public class Dzie {

  
    
     public void dziel() {
       

        try {
             Random r = new Random();
            
            float dzielna = r.nextInt(20)-10;
            System.out.println("Wylosowano dzielna"+dzielna);
         
            float dzielnik = r.nextInt(20)-10;
               System.out.println("Wylosowano dzielnik"+dzielnik);
            float wynik = dzielna / dzielnik;
            System.out.println("Wynik= "+wynik);

        } catch (ArithmeticException e) // 
        {
            System.out.println("Dzielenie przez 0");
            
             

        }
      

    }
}
