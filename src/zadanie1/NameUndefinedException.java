package zadanie1;

public class NameUndefinedException extends Exception {

    public NameUndefinedException(String message) {
        super("jeśli ktoś przy próbie utworzenia obiektu " +
                "Person przekaże do konstruktora imię lub" +
                " nazwisko będące nullem lub mające mniej niż 2 znaki");
    }
}
