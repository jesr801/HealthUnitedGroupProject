class Nurse extends User{

    public Nurse(String username, String password)
    {
        super(username, password);
    }

    public String orderTest(Patient patient)
    {
        return null;
    }

    public String addComment(Patient patient)
    {
        return null;
    }

    @Override
    public String toString()
    {
        return "\nUsername: " + this.getUsername()
                + "\nPassword: " + this.getPassword();
    }
}
