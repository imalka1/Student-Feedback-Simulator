package login;

import db.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try {
            if (checkLogin(req, username, password)) {
                resp.sendRedirect("subjects.jsp");
            } else {
                resp.sendRedirect("index.jsp?error=error");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private boolean checkLogin(HttpServletRequest request, String username, String password) throws SQLException, ClassNotFoundException {
        HttpSession sessionLogin = request.getSession(false);
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select uid from user where username=? && password=?");
        preparedStatement.setObject(1, username);
        preparedStatement.setObject(2, password);
        ResultSet rst = preparedStatement.executeQuery();
        if (rst.next()) {
            sessionLogin.setAttribute("login", "logged");
            return true;
        }
        return false;
    }
}
