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

    public void EditPatientInfo(Patient patient, String field, String edit){
        switch (field.toLowerCase())
        {
            case "patientname":
                patient.setPatientName(edit);
            case "socialsecurity":
                patient.setSocialSecurity(edit);
            case "dateofbirth":
                Date dob = new Date(Date.parse(edit));
                patient.setDateOfBirth(dob);
            case "address":
                patient.setAddress(edit);
            case "econtact":
                patient.setEContact(edit);
            case "caredate":
                Date cdate = new Date(Date.parse(edit));
                patient.setCareDate(cdate);
            case "admitted":
                patient.setAdmitted();
        }
    }

    @Override
    public String toString()
    {
        return ("ER String");
    }
}
