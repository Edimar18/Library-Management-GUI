import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Borrower_main {
  public static void run() {
    
     JFrame frame = new JFrame("BOOKBYTES");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JButton element1 = new JButton("return");
     element1.setBounds(19, 18, 106, 29);
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

     JLabel element2 = new JLabel("Manage Borrower");
     element2.setBounds(260, 29, 294, 39);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 22));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     JButton element3 = new JButton("ADD");
     element3.setBounds(236, 77, 106, 29);
     element3.setBackground(Color.decode("#bca8e4"));
     element3.setForeground(Color.decode("#000"));
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element3.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element3, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE ADD  BUTTON");
        frame.dispose();
        Borrower_add.run();
        
      }
     });
     panel.add(element3);

     JButton element4 = new JButton("EDIT");
     element4.setBounds(369, 80, 106, 29);
     element4.setBackground(Color.decode("#bca8e4"));
     element4.setForeground(Color.decode("#000"));
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element4.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element4, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE ADD EDIT BUTTON");
        frame.dispose();
        Borrower_edit.run();
        
      }
     });
     panel.add(element4);

     JLabel element6 = new JLabel("");
     element6.setBounds(50, 120, 674, 224);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element6.setForeground(Color.decode("#000"));
     panel.add(element6);

     frame.add(panel);
     frame.setVisible(true);

  }
}