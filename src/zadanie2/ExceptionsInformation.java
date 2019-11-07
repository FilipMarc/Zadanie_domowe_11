package zadanie2;

public class ExceptionsInformation {
    public static void main(String[] args) {

        System.out.println("Wyjątki dzielimy na obsługiwane które trzeba obsłużyć i " +
                "nieobsługiwane które można, ale nie trzeba obsłużyć.");

        System.out.println("Wyjątki nieobsługiwane dziedziczą po klasie RunTimeException");

        System.out.println("Wyjątki rzucamy korzystając z instrukcji throw, " +
                "jeśli rzucamy wyjątek kontrolowany musimy dodatkowo " +
                "w sygnaturze metody/konstruktora zadeklarować wyjątek używając słowa throws");

        System.out.println("Do bloku try-catch możemy dodać dodatkowo blok" +
                " finally, który wykona się zawsze, niezależnie, czy w bloku try wyjątek wystąpił, czy nie");
    }
}
