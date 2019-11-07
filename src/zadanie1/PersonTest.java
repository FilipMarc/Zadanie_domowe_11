package zadanie1;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = sc.nextLine();
        System.out.println("Podaj wiek: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj pesel: ");
        String pesel = sc.nextLine();

        Person person = new Person(name,lastName,age,pesel);
        System.out.println(person);
    }
}
