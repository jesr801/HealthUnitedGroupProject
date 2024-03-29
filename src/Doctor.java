class Doctor extends Nurse{

    public Doctor(String username, String password)
    {
        super(username, password);
    }

    @Override
    public String toString()
    {
        return ("Doctor String");
    }
}
