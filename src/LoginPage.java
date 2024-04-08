import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class LoginPage extends JFrame {
  private JPanel startPage;
  private JLabel usernameLabel;
  private JLabel Password;
  private JButton EnterInformation;
  private JPasswordField passwordEntry;
  private JTextField usernameEntry;
  private JPanel employeeMainMenu;
  private JTabbedPane patientSearch;
  private JTabbedPane tabbedPane1;
  private JPanel mainMenu;





  public LoginPage() {
    EnterInformation.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       dispose();
       String employeeUsername=usernameEntry.getText();
      String employeePassword=String.valueOf(passwordEntry.getPassword());




        JFrame m= new JFrame();
        m.setTitle("Main Menu");
        m.setSize(900,700);
        m.setContentPane(employeeMainMenu);
        m.setVisible(true);
        employeeMainMenu.setVisible(true);
        employeeMainMenu.setSize(500,500);
       patientSearch.setSize(600,600);
      }
    });
  }


    public static void main (String[]args) {

      LoginPage l = new LoginPage();
      l.setContentPane(l.startPage);
      l.setTitle("HealthUnited");
      l.setVisible(true);
      l.setSize(900, 600);


        try {

          Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/HealthUnited", "healthunited_user", "123");
          Statement st = connect.createStatement();
          //this is proof of the valid SQL connection
          String test2="INSERT INTO employee_info VALUES ('test','test2','test3','test4','test5',3)";
          st.execute(test2);
        } catch (Exception e) {
          e.printStackTrace();
        }


    }
}
