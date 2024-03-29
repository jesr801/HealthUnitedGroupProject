class BStaff extends User{

    public BStaff(String username, String password)
    {
        super(username, password);
    }

    public int calcuateBill(){
        return 0;
    }
    public String generateBill(){
        return null;
    }
    @Override
    public String toString()
    {
        return ("BStaff String");
    }
}
