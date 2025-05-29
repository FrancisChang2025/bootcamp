package com.bootcamp.com;

import java.lang.reflect.Array;
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

  public static void insertPersonDB(Person person) throws SQLException {
    if (person == 
    null)
      return;
      String insertData1 = 
      "insert into JDBC_MYSQL_TABLE values (" + person.getId() + ", " + ) on duplicate key update id = 1";
    stmt.executeUpdate(insertData1);
    for (Person p : persons){
      insertPersonDB(p);
    }
  }


  // public static List<Person> getPersonsFromDB() {
    
  // }

  public static void main(String[] args) {
    String userID = "root";
    String password = "admin1234";
    String databaseURL = "jdbc:mysql://127.0.0.1:3306/bootcamp_2504";

    // login DB
    try {
      Connection conn = DriverManager.getConnection(databaseURL, userID, password);
        DriverManager.getConnection(databaseURL, userID, password);
      Statement stmt = conn.createStatement();

      // ! 1. create table
      // create table
      Statement stmt = conn.createStatement();
      String createTableStmt = 
        "create table if not exists JDBC_MYSQL_TABLE (id bigint primary key, name varchar(50))";
      stmt.executeUpdate(createTableStmt);

      // ! Front end -> Back end API
      List<Person> newPersons = new ArrayList<>(
          Arrays.asList(new Person(3, "Vincent"), new Person(4, "Lucas")));
      for (Person p : newPersons) {
        insertPersonDB(p);
      }

      // ! 2. insert data
      String insertData1 = 
        "insert into JDBC_MYSQL_TABLE values (1, 'John') on duplicate key update id = 1";
      stmt.executeUpdate(insertData1);
      String insertData2 = 
        "insert into JDBC_MYSQL_TABLE values (2, 'Alice') on duplicate key update id = 2";
      stmt.executeUpdate(insertData2);

      // create another table, and then insert 3 more data.
      // ! 3. select data
      ResultSet rs = stmt.executeQuery("select * from JDBC_MYSQL_TABLE");
      List<Person> persons = new LinkedList<>();
      while (rs.next()) {
        int idValue = rs.getInt("id");
        String nameValue = rs.getString("name");
        System.out.println("id: " + idValue + ", name: " + nameValue);
        persons.add(new Person(idValue, nameValue));
      }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    // List<Person>
    System.out.println(persons);
  }
  
}
