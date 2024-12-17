import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import helper_classes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Search_books_byId {
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
        Search_books_main.run();
      }
     });
     panel.add(element1);

     JLabel element2 = new JLabel("SEARCH BOOKS");
     element2.setBounds(288, 30, 213, 29);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 20));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);


     JLabel element10 = new JLabel("SEARCH BY ID");
     element10.setBounds(53, 88, 106, 17);
     element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element10.setForeground(Color.decode("#000"));
     panel.add(element10);

     JTextField element11 = new JTextField("");
     element11.setBounds(176, 89, 190, 23);
     element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element11.setBackground(Color.decode("#ffe7bf"));
     element11.setForeground(Color.decode("#73664e"));
     element11.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element11, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element11);

     JButton element12 = new JButton("SEARCH");
     element12.setBounds(376, 84, 106, 29);
     element12.setBackground(Color.decode("#bca8e4"));
     element12.setForeground(Color.decode("#000"));
     element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element12.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element12.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element12, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element12);

     DefaultTableModel model = new DefaultTableModel();
     model.addColumn("Book Id");
     model.addColumn("Title");
     model.addColumn("Author");
     model.addColumn("ISBN");
     model.addColumn("Published year");
     model.addColumn("Copies");
     model.addRow(new Object[] {"BOOK ID", "TITLE", "AUTHOR", "ISBN", "PUBLISHED_YEAR", "COPIES"});
     element12.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE SEARCH BUTTON");
        String ID = element11.getText();
        ResultSet records = database.displayBookById(Integer.parseInt(ID));
        System.out.println("999990");
        try {
        while (records.next()) {
          System.out.println("0000000");
          model.addRow(new Object[] {records.getString(1),records.getString(2), records.getString(3), records.getString(4), records.getString(5), records.getString(6)});
        }
    } catch(Exception ex) {

    }
      }
     });
     JTable element13 = new JTable(model);
     element13.setBounds(59, 134, 661, 227);
     element13.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element13.setForeground(Color.decode("#000"));
     panel.add(element13);

     frame.add(panel);
     frame.setVisible(true);

  }
}