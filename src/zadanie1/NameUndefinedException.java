package zadanie1;

public class NameUndefinedException extends Exception {

    public NameUndefinedException(String message) {
        super("Imię lub nazwisko jest nullem lub ma mniej niż 2 znaki");
    }
}
