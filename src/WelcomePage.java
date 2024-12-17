import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WelcomePage {
  public static void run() {
    FileHandler fh = new FileHandler();
    SigninPage signin = new SigninPage();
    String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=LIBRARY;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    Database database = new Database(dbUrl);
     JFrame frame = new JFrame("BOOK BYTE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element1 = new JLabel("");
     element1.setBounds(296, 42, 106, 17);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element1.setForeground(Color.decode("#000"));
     panel.add(element1);

     JLabel element2 = new JLabel("USTP BOOK MANAGEMENT");
     element2.setBounds(222, 23, 317, 42);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 23));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     JLabel element3 = new JLabel("|");
     element3.setBounds(282, 131, 72, 47);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 70));
     element3.setForeground(Color.decode("#000"));
     panel.add(element3);

     JLabel element4 = new JLabel("WELCOME BACK");
     element4.setBounds(70, 105, 180, 41);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 21));
     element4.setForeground(Color.decode("#000"));
     panel.add(element4);

     JButton element5 = new JButton("SIGN IN");
     element5.setBounds(98, 166, 106, 29);
     element5.setBackground(Color.decode("#bca8e4"));
     element5.setForeground(Color.decode("#000"));
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element5.setFocusPainted(false);
     
     element5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        fh.writeLog("USER CLICKED THE SIGN IN BUTTTON");
        frame.dispose();
        signin.run();
      }
     });
     panel.add(element5);

     JLabel element6 = new JLabel("CREATE ACCOUNT");
     element6.setBounds(441, 86, 277, 35);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 21));
     element6.setForeground(Color.decode("#000"));
     panel.add(element6);

     JTextField element7 = new JTextField("");
     element7.setBounds(452, 137, 158, 23);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element7.setBackground(Color.decode("#ffe7bf"));
     element7.setForeground(Color.decode("#73664e"));
     element7.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element7, "NAME", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element7);

     JTextField element8 = new JTextField("");
     element8.setBounds(452, 171, 159, 23);
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element8.setBackground(Color.decode("#ffe7bf"));
     element8.setForeground(Color.decode("#73664e"));
     element8.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element8, "EMAIL", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element8);

     JPasswordField element9 = new JPasswordField("");
     element9.setBounds(454, 202, 156, 23);
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element9.setBackground(Color.decode("#ffe7bf"));
     element9.setForeground(Color.decode("#73664e"));
     element9.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element9, "PASSWORD", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element9);

     JButton element11 = new JButton("SIGN UP");
     element11.setBounds(472, 274, 106, 29);
     element11.setBackground(Color.decode("#bca8e4"));
     element11.setForeground(Color.decode("#000"));
     element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element11.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element11.setFocusPainted(false);
     element11.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String userPassword = element9.getText();
        String userName = element7.getText();
        String userEmail = element8.getText();
        int ifExists = database.checkUser(userName, userPassword);
        System.out.println(ifExists);
        if (ifExists == 1) {
          System.out.println("exist");
          fh.writeLog("USER SIGNED UP BUT USER ALREADY EXISTS");
          JOptionPane.showMessageDialog(frame, "USER ALREADY EXISTS", "NOTIFICATION", JOptionPane.INFORMATION_MESSAGE);
        } else {
          System.out.println("dosnt");
          fh.writeLog("USER SUCCESSFULY SIGNED UP");
          database.addUser(userName, userPassword, userEmail);
          //JOptionPane.showMessageDialog(frame, "SIGNUP SUCCESS, PROCEED TO LOGIN", "NOTIFICATION", JOptionPane.INFORMATION_MESSAGE);
          frame.dispose();
          SignupSuccess.run();
        }
        
        
      }
     });
     panel.add(element11);

     frame.add(panel);
     frame.setVisible(true);

  }
}