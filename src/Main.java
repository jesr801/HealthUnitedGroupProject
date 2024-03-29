import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Nurse nurse = new Nurse("John Doe", "password");

        Doctor doctor = new Doctor("Jane Doe", "password");

        ERStaff er = new ERStaff("Bill Joel", "password");

        Patient patient = new Patient("Hurtz", "1234", new Date(Date.parse("01/23/2000")),
                "123 Main St", "123-456-7890", new Date(Date.parse("03/29/2020")), true);

        System.out.println(patient);
//        System.out.println(nurse);
//        System.out.println(doctor);
    }
}