package controller.db_controller;

import db.DBConnection;
import model.UserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {

    public static UserDTO chkLogin(String username, String password) {
        UserDTO userDTO = null;
        try {
            Connection connection = DBConnection.getDBConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select uid,accountType from user where uid=? && password=?");
            preparedStatement.setObject(1, username);
            preparedStatement.setObject(2, password);
            ResultSet rst = preparedStatement.executeQuery();
            if (rst.next()) {
                userDTO = new UserDTO();
                userDTO.setUid(rst.getString(1));
                userDTO.setAccountType(rst.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userDTO;
    }

    public static UserDTO getStudentUsername(String uid) {
        UserDTO userDTO = null;
        try {
            Connection connection = DBConnection.getDBConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select student_name from user u,student s where u.uid=s.uid && u.uid=?");
            preparedStatement.setObject(1, uid);
            ResultSet rst = preparedStatement.executeQuery();
            if (rst.next()) {
                userDTO = new UserDTO();
                userDTO.setUsername(rst.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userDTO;
    }

    public static UserDTO getAdminUsername(String uid) {
        UserDTO userDTO = null;
        try {
            Connection connection = DBConnection.getDBConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select admin_name from user u,admin a where u.uid=a.uid && u.uid=?");
            preparedStatement.setObject(1, uid);
            ResultSet rst = preparedStatement.executeQuery();
            if (rst.next()) {
                userDTO = new UserDTO();
                userDTO.setUsername(rst.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userDTO;
    }
}
