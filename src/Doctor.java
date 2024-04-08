class Doctor extends Nurse{

    public Doctor(String username, String password)
    {
        super(username, password);
    }

    public String diagnosePatient(Patient patient, String diagnosis)
    {
        return "Patient info:\n" + patient.toString() + "\n\nDiagnosis:\n" + diagnosis;
    }

    public void treatPatient(Patient patient)
    {
        int treatments = 0;

        if (patient.getAbnormalRedBlood())
            treatments++;

        if (patient.getAbnormalWhiteBlood())
            treatments++;

        if (patient.getAbnormalLiver())
            treatments++;

        if (patient.getAbnormalRenalFunc())
            treatments++;

        if (patient.getAbnormalElectrolyte())
            treatments++;

        if (patient.getAbnormalXRay())
            treatments++;

        if (patient.getAbnormalCT())
            treatments++;

        if (patient.getAbnormalMRI())
            treatments++;

        patient.setNumberOfTreatments(treatments);
    }

}
