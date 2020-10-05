package webapp.servlet;

import webapp.dao.UserDao;
import webapp.dao.UserDaoImpl;
import webapp.entity.User;
import webapp.service.UserService;
import webapp.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

@WebServlet (name = "Login", urlPatterns = "/login")
public class UserServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter writer = resp.getWriter();
        UserService userService = new UserServiceImpl(new UserDaoImpl());
        Map<String, String[]> reqParameterMap = req.getParameterMap();
        String reqUsername = reqParameterMap.get("username")[0];
        String reqPassword = reqParameterMap.get("password")[0];
        for(String name : reqParameterMap.keySet()){
            if(name.equals("name")){
                String reqName = reqParameterMap.get("name")[0];
                userService.create(new User(reqUsername,reqPassword,reqName));
            }


        }
        if(reqUsername.equals(userService.findByUsername(reqUsername).getUsername())){
            writer.write("<html><body><h3>Hi," + userService.findByUsername(reqUsername).getName() + "<h3></body></html>");
        }
        else{
            writer.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Document</title>\n" +
                    "    <link href=\"regcss.css\" type=\"text/css\" rel=\"stylesheet\">\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h3>Registration</h3>\n" +
                    "    <form>\n" +
                    "        <p><input type=\"text\" name=\"username\" placeholder=\"Enter username\"></p>\n" +
                    "        <p><input type=\"text\" name=\"password\" placeholder=\"Enter password\"></p>\n" +
                    "        <p><input type=\"text\" name=\"name\" placeholder=\"Enter username\"></p> \n" +
                    "        <button type=\"submit\">Register</button>\n" +
                    "    </form>\n" +
                    "</body>\n" +
                    "</html>");
        }

        System.out.println("I'm in the end.");
        writer.close();
    }

    @Override
    public void destroy() {
    }
}
