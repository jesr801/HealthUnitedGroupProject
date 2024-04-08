import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Nurse nurse = new Nurse("Nurse Doe", "password");

        Doctor doctor = new Doctor("Doc Doe", "password");

        ERStaff er = new ERStaff("E. R. Doe", "password");

        BStaff bStaff = new BStaff("Bill Doe", "password");

        Patient patient = new Patient("Hurtz", "1234", new Date(Date.parse("01/23/2000")),
                "123 Main St", "123-456-7890", new Date(Date.parse("03/29/2020")), true);

        System.out.println(patient + "\n");
        System.out.println(er + "\n");
        System.out.println(nurse + "\n");
        System.out.println(doctor + "\n");
        System.out.println(bStaff + "\n");

        System.out.println(doctor.diagnosePatient(patient, "This patient is not suffering from any abnormal ills"));
        doctor.treatPatient(patient);

        System.out.println("\n" + bStaff.generateBill(patient));

    }
}