package com.example;

import javax.naming.InitialContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@WebServlet(name = "SimpleServlet", urlPatterns = {"/*"})
public class SimpleServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) {
    try {
      InitialContext context = new javax.naming.InitialContext();
      SimpleSessionBean simpleSessionBean = (SimpleSessionBean) context.lookup("java:global/jboss-hibernate/SimpleSessionBean");
      simpleSessionBean.save("TEST " + LocalDateTime.now().toString());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
      exception.printStackTrace();
    }
  }

}
