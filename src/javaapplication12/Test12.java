package javaapplication12;

import java.util.Scanner;

public class Test12 {   // telo klase
                        // metod mora biti unutar tela klase 
                        // ...ali izvan tela drugih metoda
    public static void main(String[] args) {  // telo metoda  
        //  public - znaci da je taj metod dostupan iz spolja sveta 'public class Test12'
        //  static - taj metod je dostupan bez potrebe da napravimo instancu klase, objekat
        //  void - (specijalna rez. rec)znaci da metod 'main' ne da vrati podatke onome ko ga je pozvao,
        //  ...ne vraca nikakvu vrednost kao rezultat svog izvrsavanja  
        //  main - ime
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int firstInt = s.nextInt();
        
        System.out.print("Enter second number: ");
        int secondInt = s.nextInt();
        
        System.out.print("Enter second number: ");
        int thirdInt = s.nextInt();
        
        int smallerThenFirstTwoNum = minimumTwoNumbers(firstInt, secondInt);
        int smallerThenTwoAndThreeNum = minimumTwoNumbers(smallerThenFirstTwoNum, thirdInt);

        System.out.println("The smallest number is: " + smallerThenTwoAndThreeNum);
    }
    
    public static int minimumTwoNumbers( int a, int b ) {    // telo metoda 'minimumTwoNumbers'
        // metod u zagradama '()' uzima argumente koji moraju da imaju tip moze i vise njih
        // tip podataka 'int'
        // lokalno ime 'a','b'...
        // ovaj metod vraca jedan podatak tipa 'int'
        
        if ( a < b ) { // naredbe koje se izvrsavaju unutar metoda
            return a;
        } else {
            return b;
        }
    }
}

