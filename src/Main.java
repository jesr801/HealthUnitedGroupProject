public class Main {
    public static void main(String[] args) {
        System.out.println("deez");

        Nurse nurse = new Nurse("John Doe", "password");

        Doctor doctor = new Doctor("Jane Doe", "password");

        System.out.println(nurse);
        System.out.println(doctor);
    }
}