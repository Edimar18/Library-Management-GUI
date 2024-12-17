import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import helper_classes.*;

public class SigninPage {
  public void run() {
    SigninPage signin = new SigninPage();
    String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=LIBRARY;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    Database database = new Database(dbUrl);
     JFrame frame = new JFrame("BOOKBYTE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element1 = new JLabel("SIGN IN");
     element1.setBounds(318, 31, 120, 30);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 23));
     element1.setForeground(Color.decode("#000"));
     panel.add(element1);

     JTextField element2 = new JTextField("");
     element2.setBounds(278, 108, 200, 23);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element2.setBackground(Color.decode("#ffe7bf"));
     element2.setForeground(Color.decode("#73664e"));
     element2.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element2, "USERNAME", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element2);

     JPasswordField element4 = new JPasswordField("");
     element4.setBounds(277, 156, 198, 23);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setBackground(Color.decode("#ffe7bf"));
     element4.setForeground(Color.decode("#73664e"));
     element4.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element4, "PASSWORD", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element4);

     JButton element5 = new JButton("SignIn");
     element5.setBounds(320, 215, 106, 29);
     element5.setBackground(Color.decode("#bca8e4"));
     element5.setForeground(Color.decode("#000"));
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element5.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element5, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element5);
     frame.add(panel);
    frame.setVisible(true);
     element5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        String UserName = element2.getText();
        String UserPassword = element4.getText();
        int ifExist = database.checkUser(UserName, UserPassword);
        System.out.println("exist: "+ifExist);
        if (ifExist == 1) {
          HomePage.run(UserName);
          frame.dispose();
        } else {
          JOptionPane.showMessageDialog(frame, "USER DOES'NT EXIST", "NOTIFICATION", JOptionPane.INFORMATION_MESSAGE);
        }
     }});
    

  }
}