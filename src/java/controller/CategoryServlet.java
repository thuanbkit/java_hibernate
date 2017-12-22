/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entities.*;
import model.*;

/**
 *
 * @author thuandd
 */
@WebServlet(name = "CategoryServlet", urlPatterns = {"/CategoryServlet"})
public class CategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String page = "index.jsp";
        CategoryModel categoryM = new CategoryModel();
        Category cat = categoryM.find(id);
        categoryM.destroy(cat);
        response.sendRedirect(page);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String  name = request.getParameter("name");
        String page = "index.jsp";
        Category category = new Category();
        category.setName(name);
        CategoryModel categoryM = new CategoryModel();
        categoryM.add(category);
        response.sendRedirect(page);
    }

}
