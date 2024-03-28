import java.util.Date;

class ERStaff extends User{

    public ERStaff(String username, String password)
    {
        super(username, password);
    }

    public void CreatePatient(String patientName, String socialSecurity, Date dateOfBirth, String address,
                              String eContact, Date careDate, Boolean admitted)
    {
        Patient patient = new Patient(patientName, socialSecurity, dateOfBirth, address, eContact, careDate, admitted);
    }

    public void EditPatientInfo(Patient patient, String field, String edit){}

    @Override
    public String toString()
    {
        return ("ER String");
    }
}
