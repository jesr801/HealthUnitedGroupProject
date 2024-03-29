class BStaff extends User{

    public BStaff(String username, String password)
    {
        super(username, password);
    }

    public String prepareBill()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return ("BStaff String");
    }
}
