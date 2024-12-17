import java.sql.ResultSet;

public class Search {
    ResultSet result;
    String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=LIBRARY;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    Database db = new Database(dbUrl);

    public ResultSet searchByTitle(String title) {
        String query = "SELECT * FROM BOOKS WHERE title LIKE '%" + title + "%'";
        result = db.runQuerry(query);
        return result;
    }
    
    public ResultSet searchByAuthor(String author) {
        String query = "SELECT * FROM BOOKS WHERE author LIKE '%" + author + "%'";
        result = db.runQuerry(query);
        return result;
    }

    public ResultSet searchByIsbn(int isbn) {
        String query = "SELECT * FROM BOOKS WHERE isbn = " + isbn;
        result = db.runQuerry(query);
        return result;
    }

}
