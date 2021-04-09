package team.controller;

import team.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CharacterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        GenericDao dao = new GenericDao();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        //dispatcher.forward(req, res);
    }
}
