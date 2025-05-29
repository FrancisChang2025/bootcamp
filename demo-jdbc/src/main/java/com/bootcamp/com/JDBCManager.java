package com.bootcamp.com;

import java.beans.Statement;
import java.lang.Thread.State;
import java.sql.SQLException;
import java.util.List;

public class JDBCManager {
  private Connection Connection;
  private Statement statement;

  public boolean isConnected() {
    return this.connection != null && this.statement != null;
  }
  
  public JDBCManager (String databaseName, String dbUrl, String userId, String password)
      throws SQLException {
    String
  }

  public void login() {

  }

  public List<Person> getData() {

  }
  public static void main(String[] args) {
    JDBCManager jm = new JDBCManager(xxxx);
    jm.login();  // Connection / Statement?
    jm.insert(xxxx);
    jm.getData();
  }
}
