import java.util.ArrayList;
import java.util.List;

public class Nurse extends User {

    public Nurse(String username, String password) {
        super(username, password);
    }

    public String orderTest(List<String> tests) {
        
        StringBuilder orderedTests = new StringBuilder("Ordered tests:");
        for (String test : tests) {
            orderedTests.append("\n- ").append(test);
        }
        return orderedTests.toString();
    }

    public String addComment(Patient patient, String comment) {
        
        return "Added comment for patient " + patient.getPatientName() + ": " + comment;
    }

    public static void main(String[] args) {
       
        Nurse nurse = new Nurse("nurse123", "password");

        // Use case: OrderTest
        List<String> orderedTests = new ArrayList<>();
        orderedTests.add("Red blood cell");
        orderedTests.add("White blood cell");
        System.out.println("Order Test:");
        System.out.println(nurse.orderTest(orderedTests));

        
        Patient patient = new Patient("Hurtz", "1234");
        String comment = "Patient reported severe chest pains.";
        System.out.println("Add Comment:");
        System.out.println(nurse.addComment(patient, comment));
    }
}



