package zadanie1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException,
            IncorrectAgeException {
        exceptionConstruct(firstName,lastName,age,pesel);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void exceptionConstruct(String firstName, String lastName, int age, String pesel)
        throws NameUndefinedException, IncorrectAgeException
    {
        if (firstName.equals(null) || lastName.equals(null) || firstName.length() <=2 || lastName.length() <=2){
            throw new NameUndefinedException("Imię lub nazwisko jest nullem lub ma mniej niż 2 znaki");
        }else if (age < 1){
            throw new IncorrectAgeException("Jeśli wiek jest niższy niz 1");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        this.firstName = firstName;
        if (firstName==null ||firstName.length()<2){
            throw new NameUndefinedException("Imię jest nullem lub jest mniejsze niż 2 znaki");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException{
        this.lastName = lastName;
        if (firstName==null ||firstName.length()<2){
            throw new NameUndefinedException("Nazwisko jest nullem lub jest mniejsze niż 2 znaki");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        this.age = age;
        if (age<1){
            throw new IncorrectAgeException("Wiek nie może być mniejszy niż 1");
        }
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
