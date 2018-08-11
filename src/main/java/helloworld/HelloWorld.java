package helloworld;

import java.util.Scanner;

public class HelloWorld {

    /*
        1. Wykonanie każdego programu zaczyna się od wywołania przez maszynę wirtualną metody main. Aby stworzyć taką metodę,
        napisz poniżej psvm i wybierz strzałkami i enterem opcję:
        psvm        main()  method declaration

        2. Najprostszy sposób, żeby wyświetlić tekst w konsoli to System.out.println(<tutaj tekst>);
        System to klasa, która ułatwia podstawową komunikację z systemem operacyjnym.
        out to pole (właściwość) tej klasy, które reprezentuje standardowe wyjście - w naszym przypadku konsolę.
        println() to metoda, która drukuje coś w konsoli, a na końcu drukuje znak nowej linii.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię.");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }

}
