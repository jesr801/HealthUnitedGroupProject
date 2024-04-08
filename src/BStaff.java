class BStaff extends User{

    public BStaff(String username, String password)
    {
        super(username, password);
    }

    private int calculateBill(Patient patient)
    {
        int total = 0;

        total += patient.getNumberOfTreatments();

        if (patient.getAdmitted())
            total += 5;

        return total;
    }

    public String generateBill(Patient patient){
        return "Cost of care for " + patient.getPatientName() + ": " + calculateBill(patient) + "$";
    }

    @Override
    public String toString()
    {
        return "\nUsername: " + this.getUsername()
            + "\nPassword: " + this.getPassword();
    }
}
