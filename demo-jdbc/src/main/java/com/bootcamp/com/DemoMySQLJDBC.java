package com.bootcamp.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ! Java connect Database
public class DemoMySQLJDBC {

  public static void insertPersonToDB(Statement stmt, Person person)
      throws SQLException {
    if (stmt == null || person == null || person.getName() == null)
      return;
    String insertData1 = "insert into JDBC_MYSQL_TABLE values ("
        + person.getId() + ", '" + person.getName()
        + "') on duplicate key update id = " + person.getId();
    stmt.executeUpdate(insertData1);
  }

  public static List<Person> getPersonsFromDB(Statement stmt)
      throws SQLException {
    ResultSet rs = stmt.executeQuery("select * from JDBC_MYSQL_TABLE");
    List<Person> persons = new ArrayList<>();
    while (rs.next()) {
      int idValue = rs.getInt("id");
      String nameValue = rs.getString("name");
      // System.out.println("id: " + idValue + ", name: " + nameValue);
      persons.add(new Person(idValue, nameValue));
    }
    return persons;
  }

  public static void main(String[] args) {
    String userId = "root";
    String password = "admin1234";
    String databaseUrl = "jdbc:mysql://127.0.0.1:3306/bootcamp_2504";

    // login DB
    try {
      Connection conn =
          DriverManager.getConnection(databaseUrl, userId, password);

      // ! 1. create table  // 死背 Java connect SQL
      Statement stmt = conn.createStatement();
      String createTableStmt =
          "create table if not exists JDBC_MYSQL_TABLE (id bigint primary key, name varchar(50))";
      stmt.executeUpdate(createTableStmt);

      // ! 2. insert data
      // ! Front-End -> Back-End API
      List<Person> newPersons = new ArrayList<>(
          Arrays.asList(new Person(3, "Vincent"), new Person(4, "Lucas")));
      for (Person p : newPersons) {
        insertPersonToDB(stmt, p);
      }

      // String insertData1 =
      // "insert into JDBC_MYSQL_TABLE values (1, 'John') on duplicate key update id = 1";
      // stmt.executeUpdate(insertData1);
      // String insertData2 =
      // "insert into JDBC_MYSQL_TABLE values (2, 'Alice') on duplicate key update id = 2";
      // stmt.executeUpdate(insertData2);

      // ! 3. select person data
      List<Person> persons = getPersonsFromDB(stmt);
      System.out.println(persons);
      
    } catch (SQLException e) {
      e.printStackTrace(); // similar print out message
    }
  }
}