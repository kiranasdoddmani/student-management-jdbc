package org.cfs;

import org.cfs.config.DBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService {

    // ADD Student
    public void addStudent(Student student) {
        String sql="INSERT INTO students (name,email,course,marks) VALUES (?,?,?,?)";
        try {
            Connection connection= DBConfig.getInstance();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            preparedStatement.setString(1,student.getName()); // 1st-index set name {name came form Student Construtor}
            preparedStatement.setString(2,student.getEmail());
            preparedStatement.setString(3,student.getCourse());
            preparedStatement.setDouble(4,student.getMarks());

           int row =preparedStatement.executeUpdate();
           if(row>0){
               System.out.println("SuccessFully Added");
           }
            preparedStatement.close();
            connection.close();
          }catch(SQLException e){
            e.printStackTrace();
        }
    }


    // Information
    public void ViewAllStduents(){
        String sql="SELECT * FROM students";
        try {
            Connection connection=DBConfig.getInstance();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

            ResultSet resultSet= preparedStatement.executeQuery();
            System.out.println();
          System.out.println("Student Record");

          while(resultSet.next()){
             int id=  resultSet.getInt("id");
             String name=resultSet.getString("name");
             String email=resultSet.getString("email");
             String course=resultSet.getString("course");
             double marks=resultSet.getDouble("marks");

              System.out.println("Id:"+id);
              System.out.println("Name:"+name);
              System.out.println("Email:"+email);
              System.out.println("course:"+course);
              System.out.println("Marks:"+marks);

              System.out.println("-------------------------------------");
          }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    // Search Students
    public void SearchStudent(int id){
        String sql="SELECT * FROM students WHERE id= ? ";

        try {
            Connection connection=DBConfig.getInstance();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);

            ResultSet resultSet= preparedStatement.executeQuery();

            if(resultSet.next()){
                System.out.println();
                System.out.println("Student Found");
                int Id=  resultSet.getInt("id");
                String name=resultSet.getString("name");
                String email=resultSet.getString("email");
                String course=resultSet.getString("course");
                double marks=resultSet.getDouble("marks");

                System.out.println("Id:"+Id);
                System.out.println("Name:"+name);
                System.out.println("Email:"+email);
                System.out.println("course:"+course);
                System.out.println("Marks:"+marks);

            }else {
                System.out.println("Student not Found");
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Update Students

    public void UpdateStudent(int id, double marks){
      String sql = "UPDATE students SET marks = ? WHERE id = ?";
      try{
          Connection connection=DBConfig.getInstance();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
             preparedStatement.setDouble(1,marks);
             preparedStatement.setInt(2,id);

          int row= preparedStatement.executeUpdate();
          if(row>0){
              System.out.println("SuccessFully Updated");
          }else{
              System.out.println("Not Updated");
          }
          preparedStatement.close();
          connection.close();
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
  }



    // Delete Students
    public void DeleteStudent(int id){
        String sql = "DELETE FROM students WHERE id = ?";
       try{
           Connection connection=DBConfig.getInstance();
           PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);

            int row= preparedStatement.executeUpdate();
            if(row>0){
                System.out.println("SuccessFully Deleted");
            }else{
                System.out.println("Not Deleted");
            }
           preparedStatement.close();
            connection.close();
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

}
