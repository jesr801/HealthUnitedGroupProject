import java.util.Date;

class Patient{
    String patientName, socialSecurity, address, eContact;
    Date dateOfBirth, careDate;
    Boolean admitted;

    public Patient(String patientName, String socialSecurity, Date dateOfBirth, String address, String eContact,
                   Date careDate, Boolean admitted)
    {
        this.patientName = patientName;
        this.socialSecurity = socialSecurity;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.eContact = eContact;
        this.careDate = careDate;
        this.admitted = admitted;

    }

    public void setAdmitted() {
        this.admitted = !this.admitted;
    }

    public void setCareDate(Date careDate) {
        this.careDate = careDate;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEContact(String eContact) {
        this.eContact = eContact;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
}
