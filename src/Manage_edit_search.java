import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class Manage_edit_search {
  public static void main() {

     JFrame frame = new JFrame("BOOKBYTES");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element1 = new JLabel("EDIT BOOKS");
     element1.setBounds(281, 49, 150, 22);
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
     panel.add(element2);

     JTextField element3 = new JTextField("");
     element3.setBounds(239, 135, 224, 23);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setBackground(Color.decode("#ffe7bf"));
     element3.setForeground(Color.decode("#73664e"));
     element3.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element3, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element3);

     JLabel element4 = new JLabel("ENTER THE BOOK ID TO EDIT");
     element4.setBounds(249, 110, 222, 17);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setForeground(Color.decode("#000"));
     panel.add(element4);

     JButton element5 = new JButton("SEARCH");
     element5.setBounds(304, 217, 106, 29);
     element5.setBackground(Color.decode("#bca8e4"));
     element5.setForeground(Color.decode("#000"));
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element5.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element5, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element5);

     frame.add(panel);
     frame.setVisible(true);

     

  }
}