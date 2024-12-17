import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Borrower_edit{
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
        FileHandler.writeLog("USER CLICKED THE ADD NEW BUTTON");
        frame.dispose();
        Borrower_main.run();
        
      }
     });
     panel.add(element1);

     JLabel element2 = new JLabel("Manage Borrower");
     element2.setBounds(260, 29, 294, 39);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 22));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     JLabel element7 = new JLabel("Your Text");
     element7.setBounds(278, 87, 106, 17);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element7.setForeground(Color.decode("#000"));
     panel.add(element7);

     JLabel element8 = new JLabel("EDIT BORROWER");
     element8.setBounds(293, 70, 132, 21);
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element8.setForeground(Color.decode("#000"));
     panel.add(element8);

     JLabel element9 = new JLabel("CARD_ID");
     element9.setBounds(161, 108, 106, 17);
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element9.setForeground(Color.decode("#000"));
     panel.add(element9);

     JLabel element10 = new JLabel("NAME");
     element10.setBounds(184, 141, 106, 17);
     element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element10.setForeground(Color.decode("#000"));
     panel.add(element10);

     JLabel element11 = new JLabel("BOOK_ID");
     element11.setBounds(160, 172, 106, 17);
     element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element11.setForeground(Color.decode("#000"));
     panel.add(element11);

     JLabel element12 = new JLabel("DATE_BORROWED");
     element12.setBounds(102, 208, 136, 19);
     element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element12.setForeground(Color.decode("#000"));
     panel.add(element12);

     JLabel element13 = new JLabel("DATE_RETURN");
     element13.setBounds(130, 240, 106, 17);
     element13.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element13.setForeground(Color.decode("#000"));
     panel.add(element13);

     JButton element14 = new JButton("SAVE");
     element14.setBounds(296, 324, 106, 29);
     element14.setBackground(Color.decode("#bca8e4"));
     element14.setForeground(Color.decode("#000"));
     element14.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element14.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element14.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element14, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element14);

     JTextField element15 = new JTextField("");
     element15.setBounds(251, 110, 205, 23);
     element15.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element15.setBackground(Color.decode("#ffe7bf"));
     element15.setForeground(Color.decode("#73664e"));
     element15.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element15, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element15);

     JTextField element16 = new JTextField("");
     element16.setBounds(250, 143, 205, 23);
     element16.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element16.setBackground(Color.decode("#ffe7bf"));
     element16.setForeground(Color.decode("#73664e"));
     element16.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element16, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element16);

     JTextField element17 = new JTextField("");
     element17.setBounds(249, 174, 205, 23);
     element17.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element17.setBackground(Color.decode("#ffe7bf"));
     element17.setForeground(Color.decode("#73664e"));
     element17.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element17, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element17);

     JTextField element19 = new JTextField("");
     element19.setBounds(249, 205, 204, 23);
     element19.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element19.setBackground(Color.decode("#ffe7bf"));
     element19.setForeground(Color.decode("#73664e"));
     element19.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element19, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element19);

     JTextField element20 = new JTextField("");
     element20.setBounds(249, 242, 198, 23);
     element20.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element20.setBackground(Color.decode("#ffe7bf"));
     element20.setForeground(Color.decode("#73664e"));
     element20.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element20, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element20);

     JLabel element21 = new JLabel("STATUS");
     element21.setBounds(180, 270, 106, 17);
     element21.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element21.setForeground(Color.decode("#000"));
     panel.add(element21);

     JTextField element22 = new JTextField("");
     element22.setBounds(249, 274, 198, 23);
     element22.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element22.setBackground(Color.decode("#ffe7bf"));
     element22.setForeground(Color.decode("#73664e"));
     element22.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element22, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element22);

     frame.add(panel);
     frame.setVisible(true);

  }
}