import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Manage_edit {
  public static void run() {
    String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=LIBRARY;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    Database database = new Database(dbUrl);
     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element1 = new JLabel("EDIT BOOKS");
     element1.setBounds(294, 49, 150, 22);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 20));
     element1.setForeground(Color.decode("#000"));
     
     panel.add(element1);

     JButton element2 = new JButton("return");
     element2.setBounds(30, 28, 106, 29);
     element2.setBackground(Color.decode("#bca8e4"));
     element2.setForeground(Color.decode("#000"));
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element2.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element2.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element2, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE RETURN BUTTON");
        frame.dispose();
        Manage_main.run();
      }
     });
     panel.add(element2);

     JButton element5 = new JButton("EDIT");
     element5.setBounds(310, 279, 106, 29);
     element5.setBackground(Color.decode("#bca8e4"));
     element5.setForeground(Color.decode("#000"));
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element5.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element5, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element5);

     JLabel element6 = new JLabel("BOOK ID");
     element6.setBounds(163, 108, 106, 17);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element6.setForeground(Color.decode("#000"));
     panel.add(element6);

     JLabel element7 = new JLabel("BOOK NAME");
     element7.setBounds(142, 140, 106, 17);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element7.setForeground(Color.decode("#000"));
     panel.add(element7);

     JLabel element8 = new JLabel("AUTHOR NAME");
     element8.setBounds(129, 172, 106, 17);
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element8.setForeground(Color.decode("#000"));
     panel.add(element8);

     JLabel element9 = new JLabel("PUBLISHED YEAR");
     element9.setBounds(133, 203, 106, 17);
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element9.setForeground(Color.decode("#000"));
     panel.add(element9);

     JTextField element10 = new JTextField("");
     element10.setBounds(285, 107, 242, 23);
     element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element10.setBackground(Color.decode("#ffe7bf"));
     element10.setForeground(Color.decode("#73664e"));
     element10.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element10, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element10);

     JTextField element11 = new JTextField("");
     element11.setBounds(284, 144, 242, 23);
     element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element11.setBackground(Color.decode("#ffe7bf"));
     element11.setForeground(Color.decode("#73664e"));
     element11.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element11, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element11);

     JTextField element12 = new JTextField("");
     element12.setBounds(286, 175, 241, 23);
     element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element12.setBackground(Color.decode("#ffe7bf"));
     element12.setForeground(Color.decode("#73664e"));
     element12.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element12, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element12);

     JTextField element13 = new JTextField("");
     element13.setBounds(285, 210, 241, 23);
     element13.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element13.setBackground(Color.decode("#ffe7bf"));
     element13.setForeground(Color.decode("#73664e"));
     element13.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element13, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element13);

     frame.add(panel);
     frame.setVisible(true);

  }
}