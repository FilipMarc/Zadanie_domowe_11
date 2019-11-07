package zadanie1;

public class IncorrectAgeException extends Exception {

    public IncorrectAgeException(String message) {
        super("Jeśli wiek jest niższy niz 1");
    }
}
