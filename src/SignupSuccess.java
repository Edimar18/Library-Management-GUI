import javax.swing.*;
import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SignupSuccess {
  public static void run() {
    SigninPage signin = new SigninPage();
     JFrame frame = new JFrame("BOOKBYTE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(752, 405);
     frame.setLocationRelativeTo(null);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element1 = new JLabel("ACCOUNT CREATION SUCCESSFUL");
     element1.setBounds(122, 114, 564, 113);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 31));
     element1.setForeground(Color.decode("#000"));
     panel.add(element1);

     
     JButton element3 = new JButton("DONE");
     element3.setBounds(351, 220, 106, 29);
     element3.setBackground(Color.decode("#bca8e4"));
     element3.setForeground(Color.decode("#000"));
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element3.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element3, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element3);
     element3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          frame.dispose();
          signin.run();
        }
        
        
      }
     );
     frame.add(panel);
     frame.setVisible(true);

  }
}