import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_books_main {
  public static void run() {

     JFrame frame = new JFrame("BOOKBYTES");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);

     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JButton element1 = new JButton("return");
     element1.setBounds(26, 18, 106, 29);
     element1.setBackground(Color.decode("#bca8e4"));
     element1.setForeground(Color.decode("#000"));
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element1.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element1.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element1, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE RETURN BUTTON");
        frame.dispose();
        HomePage.run(null);
      }
     });
     panel.add(element1);

     JLabel element2 = new JLabel("SEARCH BOOKS");
     element2.setBounds(288, 30, 213, 29);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 20));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

  

     JButton element7 = new JButton("AUTHOR");
     element7.setBounds(274, 112, 199, 38);
     element7.setBackground(Color.decode("#bca8e4"));
     element7.setForeground(Color.decode("#000"));
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element7.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element7.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element7, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE AUTHOR BUTTON");
        frame.dispose();
        Search_books_byAuthor.run();
      }
     });
     panel.add(element7);

     JButton element8 = new JButton("BOOK ID");
     element8.setBounds(276, 172, 198, 35);
     element8.setBackground(Color.decode("#bca8e4"));
     element8.setForeground(Color.decode("#000"));
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element8.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element8.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element8, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE AUTHOR BUTTON");
        frame.dispose();
        Search_books_byId.run();
      }
     });
     panel.add(element8);

     JLabel element9 = new JLabel("CLICK WHICH YOU PREFER TO SEARCH");
     element9.setBounds(243, 252, 290, 30);
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element9.setForeground(Color.decode("#000"));
     panel.add(element9);

     frame.add(panel);
     frame.setVisible(true);

  }
}