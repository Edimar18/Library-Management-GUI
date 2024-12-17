import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manage_add{
  public static void run() {
    String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=LIBRARY;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    Database database = new Database(dbUrl);
     JFrame frame = new JFrame("BOOKBYTE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element2 = new JLabel("BOOK MANAGEMENT");
     element2.setBounds(278, 13, 176, 19);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 17));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     JButton element6 = new JButton("back");
     element6.setBounds(15, 13, 106, 29);
     element6.setBackground(Color.decode("#bca8e4"));
     element6.setForeground(Color.decode("#000"));
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element6.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element6.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element6, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE ADD NEW BUTTON");
        frame.dispose();
        Manage_main.run();
        
      }
     });
     panel.add(element6);

     JLabel element9 = new JLabel("ADD BOOK");
     element9.setBounds(312, 38, 106, 17);
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element9.setForeground(Color.decode("#000"));
     panel.add(element9);

     JLabel element10 = new JLabel("TITLE");
     element10.setBounds(170, 102, 106, 17);
     element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element10.setForeground(Color.decode("#000"));
     panel.add(element10);

     JTextField element15 = new JTextField("");
     element15.setBounds(342, 98, 191, 23);
     element15.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element15.setBackground(Color.decode("#ffe7bf"));
     element15.setForeground(Color.decode("#73664e"));
     element15.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element15, "TITLE", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element15);

     JLabel element20 = new JLabel("AUTHOR");
     element20.setBounds(167, 132, 106, 17);
     element20.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element20.setForeground(Color.decode("#000"));
     panel.add(element20);

     JLabel element21 = new JLabel("ISBN");
     element21.setBounds(171, 167, 106, 17);
     element21.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element21.setForeground(Color.decode("#000"));
     panel.add(element21);

     JLabel element22 = new JLabel("PUBLISHED YEAR");
     element22.setBounds(168, 204, 140, 21);
     element22.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element22.setForeground(Color.decode("#000"));
     panel.add(element22);

     JLabel element23 = new JLabel("COPIES");
     element23.setBounds(167, 231, 106, 17);
     element23.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element23.setForeground(Color.decode("#000"));
     panel.add(element23);

     JTextField element24 = new JTextField("");
     element24.setBounds(343, 129, 191, 23);
     element24.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element24.setBackground(Color.decode("#ffe7bf"));
     element24.setForeground(Color.decode("#73664e"));
     element24.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element24, "AUTHOR", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element24);

     JTextField element25 = new JTextField("");
     element25.setBounds(344, 168, 189, 23);
     element25.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element25.setBackground(Color.decode("#ffe7bf"));
     element25.setForeground(Color.decode("#73664e"));
     element25.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element25, "ISBN", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element25);

     

     JTextField element27 = new JTextField("");
     element27.setBounds(343, 234, 191, 23);
     element27.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element27.setBackground(Color.decode("#ffe7bf"));
     element27.setForeground(Color.decode("#73664e"));
     element27.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element27, "COPIES", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element27);

     JTextField element28 = new JTextField("");
     element28.setBounds(342, 201, 191, 23);
     element28.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element28.setBackground(Color.decode("#ffe7bf"));
     element28.setForeground(Color.decode("#73664e"));
     element28.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element28, "P.Y", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element28);

     JButton element29 = new JButton("ADD");
     element29.setBounds(308, 299, 106, 29);
     element29.setBackground(Color.decode("#bca8e4"));
     element29.setForeground(Color.decode("#000"));
     element29.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element29.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element29.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element29, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element29);
     element29.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE ADD BUTTON");
        String title = element15.getText();
        String author = element24.getText();
        String isbn = element25.getText();
        String publishedYear = element28.getText();
        String availableCopies = element27.getText();
        database.addBook(title, author, Integer.parseInt(isbn), Integer.parseInt(publishedYear), Integer.parseInt(availableCopies));
        JOptionPane.showMessageDialog(frame, "ADDED TO DATABASE", "NOTIFICATION", JOptionPane.INFORMATION_MESSAGE);
      }
     });

     frame.add(panel);
     frame.setVisible(true);

  }
}