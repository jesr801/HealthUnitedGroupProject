import java.util.Date;

class Patient{

    private String patientName, socialSecurity, address, eContact;
    private Date dateOfBirth, careDate;
    private Boolean admitted;

    private int numberOfTreatments = 0;

    private Boolean abnormalRedBlood = false, abnormalWhiteBlood = false, abnormalLiver = false,
            abnormalRenalFunc = false, abnormalElectrolyte = false, abnormalXRay = false,
            abnormalCT = false, abnormalMRI = false;

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

    public void setAbnormalRedBlood(boolean abnormal)
    {
        this.abnormalRedBlood = abnormal;
    }

    public Boolean getAbnormalRedBlood() {
        return abnormalRedBlood;
    }

    public void setAbnormalWhiteBlood(boolean abnormal)
    {
        this.abnormalWhiteBlood = abnormal;
    }

    public Boolean getAbnormalWhiteBlood() {
        return abnormalWhiteBlood;
    }

    public void setAbnormalLiver(boolean abnormal)
    {
        this.abnormalLiver = abnormal;
    }

    public Boolean getAbnormalLiver() {
        return abnormalLiver;
    }

    public void setAbnormalRenalFunc(boolean abnormal)
    {
        this.abnormalRenalFunc = abnormal;
    }

    public Boolean getAbnormalRenalFunc() {
        return abnormalRenalFunc;
    }

    public void setAbnormalElectrolyte(boolean abnormal)
    {
        this.abnormalElectrolyte = abnormal;
    }

    public Boolean getAbnormalElectrolyte() {
        return abnormalElectrolyte;
    }

    public void setAbnormalXRay(boolean abnormal)
    {
        this.abnormalXRay = abnormal;
    }

    public Boolean getAbnormalXRay() {
        return abnormalXRay;
    }

    public void setAbnormalCT(boolean abnormal)
    {
        this.abnormalCT = abnormal;
    }

    public Boolean getAbnormalCT() {
        return abnormalCT;
    }

    public void setAbnormalMRI(boolean abnormal)
    {
        this.abnormalMRI = abnormal;
    }

    public Boolean getAbnormalMRI() {
        return abnormalMRI;
    }

    public void setAdmitted() {
        this.admitted = !this.admitted;
    }

    public Boolean getAdmitted() {
        return admitted;
    }

    public void setCareDate(Date careDate) {
        this.careDate = careDate;
    }

    public Date getCareDate() {
        return careDate;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setEContact(String eContact) {
        this.eContact = eContact;
    }

    public String geteContact() {
        return eContact;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setNumberOfTreatments(int numberOfTreatments) {
        this.numberOfTreatments = numberOfTreatments;
    }

    public int getNumberOfTreatments() {
        return numberOfTreatments;
    }

    @Override
    public String toString() {
        String string = "Name: " + getPatientName() + "\nSocial security: " + getSocialSecurity()
                + "\nDate of birth: " + getDateOfBirth() + "\nAddress: " + getAddress()
                + "\nEmergency contact: " + geteContact() + "\nCare date: " + getCareDate() + "\nAdmitted?: " + getAdmitted();
        return string;
    }
}
