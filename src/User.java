abstract class User {
    protected String username;
    protected String password;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String user) {
        username = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        password = pass;
    }

    public String getUsername() {
        return username;
    }

    public String toString() {
        return "\nUsername: " + username
                + "\nPassword: " + password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
