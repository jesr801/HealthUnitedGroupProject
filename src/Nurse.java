class Nurse extends User{

    public Nurse(String username, String password)
    {
        super(username, password);
    }

    @Override
    public String toString()
    {
        return ("Nurse String");
    }
}
