import javax.swing.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import helper_classes.*;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Manage_main {
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
     element2.setBounds(278, 13, 200, 19);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 17));
     element2.setForeground(Color.decode("#000"));
     panel.add(element2);

     JButton element3 = new JButton("Add New");
     element3.setBounds(142, 55, 124, 69);
     element3.setBackground(Color.decode("#bca8e4"));
     element3.setForeground(Color.decode("#000"));
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element3.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element3, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE ADD NEW BUTTON");
        frame.dispose();
        Manage_add.run();
      }
     });
     panel.add(element3);

     JButton element4 = new JButton("Delete Record");
     element4.setBounds(304, 57, 136, 69);
     element4.setBackground(Color.decode("#bca8e4"));
     element4.setForeground(Color.decode("#000"));
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element4.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element4, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE DELETE RECORD BUTTON");
        frame.dispose();
        Manage_Delete.run();
      }
     });
     panel.add(element4);

     JButton element5 = new JButton("Edit Record");
     element5.setBounds(479, 53, 127, 71);
     element5.setBackground(Color.decode("#bca8e4"));
     element5.setForeground(Color.decode("#000"));
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element5.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element5, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     element5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FileHandler.writeLog("USER CLICKED THE EDIT RECORD BUTTON");
        frame.dispose();
        Manage_edit.run();
      }
     });
     panel.add(element5);

     JButton element6 = new JButton("main menu");
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
        FileHandler.writeLog("USER CLICKED THE MAIN MENU BUTTON");
        frame.dispose();
        HomePage.run(null);
      }
     });
     panel.add(element6);


     DefaultTableModel model = new DefaultTableModel();
     model.addColumn("Book Id");
     model.addColumn("Title");
     model.addColumn("Author");
     model.addColumn("ISBN");
     model.addColumn("Published year");
     model.addColumn("Copies");
     model.addRow(new Object[] {"BOOK ID", "TITLE", "AUTHOR", "ISBN", "PUBLISHED_YEAR", "COPIES"});
    ResultSet records = database.displayAllBooks();
    try {
        while (records.next()) {
          model.addRow(new Object[] {records.getString(1),records.getString(2), records.getString(3), records.getString(4), records.getString(5), records.getString(6)});
        }
    } catch(Exception e) {

    }

     JTable element8 = new JTable(model);
     element8.setBounds(143, 139, 456, 250);
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 12));
     element8.setForeground(Color.decode("#000"));
     panel.add(element8);
     
     
    


     frame.add(panel);
     frame.setVisible(true);

  }
}