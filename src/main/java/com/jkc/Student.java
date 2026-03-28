package com.jkc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void readData() {
        Connection connection = JdbcConnection.getConnection();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select * from student");
            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2));
            }
        }
        catch (SQLException ex){
            throw new RuntimeException("SqlException :- "+ ex.getMessage());
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        Connection connection = JdbcConnection.getConnection();
        try (Statement statement = connection.createStatement()) {
            String sql = "create table if not exists student (\n" +
                    "id int primary key,\n" +
                    "name varchar\n" +
                    ")";

            boolean execute = statement.execute(sql);
            System.out.println(execute);
        }
        catch (SQLException ex){
            throw new RuntimeException("SqlException :- "+ ex.getMessage());
        }
    }

    public void insertData() {
        Connection connection = JdbcConnection.getConnection();
        try (Statement statement = connection.createStatement()) {
            String sql = "insert into student values ('"+this.getId()+"','"+this.getName()+"')";
            System.out.println(sql);

            int rowAffected =statement.executeUpdate(sql);
            if(rowAffected>0){
                System.out.println("Inserted successfully");
            }
        }
        catch (SQLException ex){
            throw new RuntimeException("SqlException :- "+ ex.getMessage());
        }
    }

    public void updateDate() {
        Connection connection = JdbcConnection.getConnection();
        try (Statement statement = connection.createStatement()) {
            String sql = "update student set name = '"+this.getName()+"' where id = '"+this.getId()+"'";
            System.out.println(sql);

            int rowAffected =statement.executeUpdate(sql);
            if(rowAffected>0){
                System.out.println("Updated successfully");
            }
        }
        catch (SQLException ex){
            throw new RuntimeException("SqlException :- "+ ex.getMessage());
        }
    }

    public void deleteData(){
        Connection connection = JdbcConnection.getConnection();
        try (Statement statement = connection.createStatement()) {
            String sql = "delete from student where id = '"+this.getId()+"'";
            System.out.println(sql);

            int rowAffected =statement.executeUpdate(sql);
            if(rowAffected>0){
                System.out.println("Deleted successfully");
            }
        }
        catch (SQLException ex){
            throw new RuntimeException("SqlException :- "+ ex.getMessage());
        }
    }
}
