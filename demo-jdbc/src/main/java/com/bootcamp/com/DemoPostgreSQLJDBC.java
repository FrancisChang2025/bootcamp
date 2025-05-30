package com.bootcamp.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoPostgreSQLJDBC {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/bootcamp_2504";
    String user = "postgres";
    String password = "admin1234";

    try {
      Connection conn =
          DriverManager.getConnection(url, user, password);

    // create table
    String createTable =
      "CREATE TABLE IF NOT EXISTS JDBC_POSTGERSQL_TABLE (id INT PRIMARY KEY, name VARCHAR(50))";

    // insert
    String insertData1 =
      "INSERT INTO JDBC_POSTGRESQL_TABLE (id, name) VALUES (1, 'Vincent')";
    String insertData2 =
      "INSERT INTO JDBC_POSTGRESQL_TABLE (id, name) VALUES (2, 'John')";
    String insertData3 =
      "INSERT INTO JDBC_POSTGRESQL_TABLE (id, name) VALUES (3, 'Peter')";

    // select

    // update (similar to insert)

    // delete (similar to insert)
    
    }
  }
}
