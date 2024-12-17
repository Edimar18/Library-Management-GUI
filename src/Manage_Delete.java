import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Manage_Delete {
  public static void run() {

     JFrame frame = new JFrame("BOOKBYTE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
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
        Manage_main.run();
      }
     });
     panel.add(element1);

     JLabel element2 = new JLabel("DELETE RECORDS");
     element2.setBounds(288, 30, 213, 29);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 20));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     JButton element3 = new JButton("DELETE");
     element3.setBounds(-166, -90, 106, 29);
     element3.setBackground(Color.decode("#bca8e4"));
     element3.setForeground(Color.decode("#000"));
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element3.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element3, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element3);

     JButton element4 = new JButton("DELETE");
     element4.setBounds(318, 245, 106, 29);
     element4.setBackground(Color.decode("#bca8e4"));
     element4.setForeground(Color.decode("#000"));
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element4.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element4, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element4);

     JTextField element5 = new JTextField("");
     element5.setBounds(251, 164, 251, 23);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setBackground(Color.decode("#ffe7bf"));
     element5.setForeground(Color.decode("#73664e"));
     element5.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element5, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element5);

     JLabel element6 = new JLabel("ENTER THE BOOK ISBN TO DELETE");
     element6.setBounds(255, 136, 256, 17);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element6.setForeground(Color.decode("#000"));
     panel.add(element6);

     frame.add(panel);
     frame.setVisible(true);

  }
}