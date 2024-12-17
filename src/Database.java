import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

// Abstract class to define common database operations
abstract class DatabaseOperations {
    protected Connection conn;

    // Abstract method to connect to a database
    protected abstract void connect(String dbURL);

    // Common method to execute queries
    protected ResultSet executeQuery(String query) {
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(query); 
        } catch (SQLException e) {
            System.out.println("Query execution error: " + e.getMessage());
            return null;
        }
    }
    
    // Method to close the connection (Encapsulation of resource cleanup)
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}

// Concrete implementation of database for specific operations
public class Database extends DatabaseOperations {

    // Encapsulation: private member variables with public setters/getters
    private String username = "user";

    // Constructor
    public Database(String dbURL) {
        try {
            // Load the SQL Server JDBC Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading JDBC Driver: " + e.getMessage());
        }
        
        // Connect to the database
        connect(dbURL);
    }

    @Override
    protected void connect(String dbURL) {
        try {
            conn = DriverManager.getConnection(dbURL);
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    // Polymorphism: DatabaseOperations' executeQuery method is reused here
    public ResultSet runQuerry(String query) {
        return executeQuery(query);
    }

    // Method to check user credentials
    public int checkUser(String username, String password) {
        int result = 0;
        String query = "SELECT COUNT(*) FROM Users WHERE UserName = '" + username + "' AND UserPassword = '" + password + "'";
        System.out.println("Query: " + query);
        try {
            ResultSet userCheck = runQuerry(query);
            if (userCheck != null && userCheck.next()) {
                int count = userCheck.getInt(1);
                if (count > 0) {
                    result = 1;
                }
            }
            if (userCheck != null) userCheck.close(); // Close ResultSet explicitly
        } catch (SQLException e) {
            System.out.println("Error checking user: " + e.getMessage());
        }
        
        return result;
    }

    // Method to add a new user
    public void addUser(String userName, String password, String email) {
        String query = "INSERT INTO Users (UserName, Email, UserPassword) VALUES ('" + userName + "', '" + email + "', '" + password + "')";
        System.out.println("Query: " + query);
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error adding user: " + e.getMessage());
        }
    }

    // Method to display all books
    public ResultSet displayAllBooks() {
        String query = "SELECT * FROM BOOKS";
        return runQuerry(query);
    }
    public ResultSet displayBookById(int book_ID) {
        String querry = "SELECT * FROM BOOKS WHERE book_id = '" + book_ID + "'";
        System.out.println(querry);
        return runQuerry(querry);
    }

    public ResultSet displayBookByAuthor(String author) {
        String query = "SELECT * FROM BOOKS WHERE author LIKE '%" + author + "%'";
        return runQuerry(query);
    }

    public ResultSet displayAllBorrowers() {
        String query = "SELECT * FROM BORROWERS";
        return runQuerry(query);
    }

    // Getter for book name by ISBN
    public String getBookName(int isbn) {
        String name = null;
        String query = "SELECT title FROM BOOKS WHERE isbn = '" + isbn + "'";
        try (ResultSet resultSet = runQuerry(query)) {
            if (resultSet.next()) {
                name = resultSet.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching book name: " + e.getMessage());
        }
        return name;
    }
    // Method to count the number of books in the database
    public int countBooks() {
        int count = 0;
        String query = "SELECT COUNT(*) FROM BOOKS";
        try (ResultSet resultSet = runQuerry(query)) {
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error counting books: " + e.getMessage());
        }
        return count;
    }
    
    // Method to count the number of borrowers in the database
    public int countBorrowers() {
        int count = 0;
        String query = "SELECT COUNT(*) FROM Borrower";
        try (ResultSet resultSet = runQuerry(query)) {
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error counting borrowers: " + e.getMessage());
        }
        return count;
    }
    // Method to add a new book
    public void addBook(String title, String author, int isbn, int publishedYear, int availableCopies) {
        String query = "INSERT INTO BOOKS (title, author, isbn, published_year, available_copies) VALUES ('" + title + "', '" + author + "', '" + isbn + "', '" + publishedYear + "', '" + availableCopies + "')";
        System.out.println("Query: " + query);
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }

    // Method to add a new borrower
    public void addBorrower(int card_id, String name, int book_id, String date_borrowed, String date_return, String status) {
        String query = "INSERT INTO Borrower (card_id, book_id, name, date_borrowed, date_return, status) VALUES ('" + card_id + "', '" + book_id + "', '" + name + "', '" + date_borrowed + "', '" + date_return + "', '" + status + "')";
        System.out.println("Query: " + query);
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }
    // Method to delete a book by ISBN
    public void deleteBookByIsbn(int isbn) {
        String query = "DELETE FROM BOOKS WHERE isbn = '" + isbn + "'";
        System.out.println("Query: " + query);
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error deleting book: " + e.getMessage());
        }
    }

    


    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
}
