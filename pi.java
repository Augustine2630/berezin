

import java.util.Scanner;
import java.util.Scanner.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.LocalDate;
import java.time.LocalDateTime;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.lang.String;


class HappyNumber {
    //jaba
}


class CardValidation {
    void Validation() {
        System.out.println("Validation. ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String value = scan.next();
        int sum1 = 0; int sum2=0;
        final  int nDigits = value.length();
        for (int i = nDigits; i> 0; i--){
            int digit = Character.getNumericValue(value.charAt(i-1));
            int z=digit;int y=digit;
            if (i % 2 == 0){
                z *= 2;
                if (z > 9) {
                    z -= 9;
                }
                sum1 += z;
            }
            else  sum2 += y;           
        }
        int sum=sum1+sum2;
        if (value.length()!=16) sum=1;
        System.out.println(sum);
        if (sum%10 == 0){
            System.out.println ("Card Valid"); 
            return;
            
        } else {
            System.out.println("Card not Valid");
            
        }

        

    }
}

class MathOperations {
   
    void Collatz() {
        System.out.println("Collatz theory. ");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first number");

        long Clong = scan.nextLong();

        while (Clong != 1) {
            if (Clong % 2 == 0) {
                Clong = Clong / 2;
            } else {
                Clong = (3 * Clong) + 1;
            }

            System.out.print(Clong + " ");
        }


    }

   
    int factorial(int n) {
        
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
             

        
      
    
   
   
    void PI() {
        System.out.println("PI solve.");

        float numpi, diameter;

        float Pi = 3.14F;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter cycle length: ");
        float cyclenght = scan.nextFloat();

        diameter = cyclenght/Pi;

        System.out.println("diameter is: " + diameter);
        
        numpi = cyclenght/diameter;

        System.out.println("pi number is: " + numpi);
    }

    void Fibbonaci() {

        //добавить функционал предела для чисел

        System.out.println("Fibbonaci numbers. ");

        int n2;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("enter first number: ");
        int n0 = scan.nextInt();

        System.out.print("enter second number: ");
        int n1 = scan.nextInt();

        //System.out.print("enter limit number: ");
        //int n2 = scan.nextInt();


        System.out.print(n0 + " " + n1 + " ");

        for(int i = 3; i <= 11; i++){
			n2=n0+n1;
			System.out.print(n2+" ");
			n0=n1;
			n1=n2;
		}
    }

    void Factorization() {
        System.out.println("Factorization. ");

        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("enter the number");
        int number = scan.nextInt();

        int count;

        for(int i = 2; i<=(number); i++) {
            count = 0;
            while(number % i == 0) {
                number /= i;
                count++;
                if (count == 0) {
                    continue;
                }
            }
            System.out.println(i + "^" + count);
        }
    }
    
}

public class pi {
    public static void main(String args[]) {
        System.out.println(" 1. Pi solve\n 2. Fibonacci\n 3. Factorization\n 4. Card Validation\n 5. Recursion\n 6. Collatz theory");

        Scanner scan2 = new Scanner(System.in);
        String operation = scan2.next();
        String eo = "you have selected: ";
        System.out.println(eo);
        switch(operation) {
            case "1": 
                MathOperations ob = new MathOperations();
                ob.PI();
                System.out.println();
                break;
            case "2":
                MathOperations on = new MathOperations();
                on.Fibbonaci();
                System.out.println();
                break;
            case "3":
                MathOperations om = new MathOperations();
                om.Factorization();
                System.out.println();
                break;
            case "4":
                CardValidation cv = new CardValidation();
                cv.Validation();
                System.out.println();
                break;
            case "5":
                System.out.println("Recursion ");
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                MathOperations rc = new MathOperations();
                System.out.println(rc.factorial(n));
                break;
            case "6":
                //System.out.println("Collatz theory ");
                MathOperations im = new MathOperations();
                im.Collatz();
                System.out.println();
                break;
        }

        
    }    
}
