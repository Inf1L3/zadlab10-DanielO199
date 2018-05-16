package pl.edu.ur.oopl10;

import java.lang.Exception;
import java.util.Scanner;

public class Dzielenie extends Exception {

    public void dziel() {
        

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Wprowadz dzielna");
            int dzielna = input.nextInt();
            System.out.println("Wprowadz dzielnik");
            int dzielnik = input.nextInt();
            int wynik = dzielna / dzielnik;

        } catch (ArithmeticException e) // 
        {
            System.out.println("Dzielenie przez 0");

        }
      

    }

}
