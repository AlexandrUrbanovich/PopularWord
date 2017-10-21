package ru.mail.urbanovichalexandr.controllers;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/MyServlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("My Servlet example.goGet()");
    }
}
