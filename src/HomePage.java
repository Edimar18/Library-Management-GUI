import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HomePage {
  public static void run(String Name) {

     JFrame frame = new JFrame("BOOK BYTE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element1 = new JLabel("BOOKBYTE");
     element1.setBounds(230, 44, 106, 17);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element1.setForeground(Color.decode("#000"));
     panel.add(element1);

     JLabel element2 = new JLabel("WELCOME");
     element2.setBounds(597, 97, 106, 17);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     JLabel element3 = new JLabel(Name);
     element3.setBounds(615, 132, 106, 17);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setForeground(Color.decode("#000"));
     panel.add(element3);

     JButton element4 = new JButton("LOGOUT");
     element4.setBounds(587, 185, 106, 29);
     element4.setBackground(Color.decode("#bca8e4"));
     element4.setForeground(Color.decode("#000"));
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element4.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element4, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE SEARCH BOOK BUTTON");
        frame.dispose();
        WelcomePage.run();
      }
     });
     panel.add(element4);

     JButton element5 = new JButton("MANAGE BORROWER");
     element5.setBounds(72, 80, 196, 119);
     element5.setBackground(Color.decode("#bca8e4"));
     element5.setForeground(Color.decode("#000"));
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element5.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element5, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE MANAGE BORROWER BUTTON");
        frame.dispose();
        Borrower_main.run();
      }
     });
     
     panel.add(element5);

     JButton element6 = new JButton("MANAGE BOOK");
     element6.setBounds(282, 79, 184, 121);
     element6.setBackground(Color.decode("#bca8e4"));
     element6.setForeground(Color.decode("#000"));
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element6.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element6.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element6, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element6);

     JButton element7 = new JButton("SEARCH BOOK");
     element7.setBounds(75, 210, 195, 125);
     element7.setBackground(Color.decode("#bca8e4"));
     element7.setForeground(Color.decode("#000"));
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element7.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element7.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element7, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE SEARCH BOOK BUTTON");
        frame.dispose();
        Search_books_main.run();
      }
     });
     panel.add(element7);

     JButton element8 = new JButton("GENERATE REPORT");
     element8.setBounds(282, 210, 188, 123);
     element8.setBackground(Color.decode("#bca8e4"));
     element8.setForeground(Color.decode("#000"));
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element8.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element8.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element8, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE SEARCH BOOK BUTTON");
        frame.dispose();
        Reports.run();
      }
     });
     panel.add(element8);


    


     frame.add(panel);
     frame.setVisible(true);
     element4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        frame.dispose();
          WelcomePage.run();
       }});

    element6.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
      frame.dispose();
        Manage_main.run();
      }});
    
  }
}