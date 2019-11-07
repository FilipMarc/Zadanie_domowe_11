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
        }else if (age <1){
            throw new IncorrectAgeException("Jeśli wiek jest niższy niz 1");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
