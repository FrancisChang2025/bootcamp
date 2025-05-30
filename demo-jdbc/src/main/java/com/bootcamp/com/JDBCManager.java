package com.bootcamp.com;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// JVM performance tuning
public class JDBCManager {
  private static int value = 0; // 30000

  private Connection connection;
  private PreparedStatement statement; // ! fix SQL injection

  public boolean isConnected() {
    return this.connection != null;
  }

  public void login(String databaseName, String userId, String password)
      throws SQLException {
    if (isConnected())
      return;
    String dbUrl = "jdbc:postgresql://localhost:5432/" + databaseName;
    this.connection = DriverManager.getConnection(dbUrl, userId, password);
  }

  // ! fixed SQL injection
  public void insertData(String tableName, Person person) throws SQLException {
    String sql = "INSERT INTO " + tableName + " (name, email) VALUES (?, ?)";
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setInt(1, person.getId()); // 1 -> the first question mark
    stmt.setString(2, person.getName());
    this.statement = connection.prepareStatement(sql);
    this.statement.executeUpdate();
  }

  // ! fixed SQL injection
  public List<Person> getPersonByName(String name) throws SQLException {
    if (!isConnected())
      throw new RuntimeException("Database is not conneceted.");
    String sql = "select * from Persons where name = ?";
    this.statement = connection.prepareStatement(sql);
    statement.setString(1, name);
    ResultSet rs = this.statement.executeQuery();
    List<Person> persons = new ArrayList<>();
    while (rs.next()) {
      int idValue = rs.getInt("id");
      String nameValue = rs.getString("name");
      persons.add(new Person(idValue, nameValue));
    }
    return persons;
  }

  public static void main(String[] args) {
    JDBCManager jm = new JDBCManager();
    try {
      jm.login("bootcamp_2504", "postgres", "admin1234"); // Connection/ Statement?
      jm.getPersonByName("John");
    } catch (SQLException e) {
      e.printStackTrace(); // SQL error message
    }

    BigDecimal.valueOf(3.0).add(BigDecimal.valueOf(7));

  }
}