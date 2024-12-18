import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int dayOfMonth) {
        this.name = name;
        this.dob = LocalDate.of(year,month,dayOfMonth);
    }

    public void displayInfo(){
        System.out.println("User Info: Name = " + name + ", Date of Birth = " + dob);
    }
}