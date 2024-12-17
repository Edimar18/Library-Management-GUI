import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Reports {
  public static void run() {
    String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=LIBRARY;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    Database database = new Database(dbUrl);
     JFrame frame = new JFrame("BOOKBYTES");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JButton element1 = new JButton("return");
     element1.setBounds(21, 18, 106, 29);
     element1.setBackground(Color.decode("#bca8e4"));
     element1.setForeground(Color.decode("#000"));
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element1.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element1.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element1, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE SEARCH BOOK BUTTON");
        frame.dispose();
        HomePage.run(null);
      }
     });
     panel.add(element1);

     JLabel element2 = new JLabel("REPORTS");
     element2.setBounds(298, 24, 143, 41);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 23));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     

     JLabel element4 = new JLabel("NO. OF BOOKS: ");
     element4.setBounds(149, 128, 219, 21);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setForeground(Color.decode("#000"));
     element4.setText("NO. OF BOOKS: " + String.valueOf(database.countBooks()));
     panel.add(element4);

     JLabel element5 = new JLabel("NUMBER OF BORROWER:");
     element5.setBounds(82, 160, 219, 21);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setForeground(Color.decode("#000"));
     element5.setText("NUMBER OF BORROWER: " + String.valueOf(database.countBorrowers()));
     panel.add(element5);

     frame.add(panel);
     frame.setVisible(true);

  }
}