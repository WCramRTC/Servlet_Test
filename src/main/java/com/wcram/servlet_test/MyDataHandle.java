/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wcram.servlet_test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException; 
import java.io.PrintWriter; 
/**
 *
 * @author WCram
 */
// Annotation to map the Servlet URL 
@WebServlet("/MyData") 
public class MyDataHandle extends HttpServlet {

    public MyDataHandle() {
        super();
    }
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
         
                 // set the content type of response to 'text/html' 
        response.setContentType("text/html"); 
          
        // Get the PrintWriter object to write  
        // the response to the text-output stream 
        PrintWriter out = response.getWriter(); 
          
        // Print the data 
        out.print("<html><body>"); 
        out.print("<h3>Wills Data was Entered</h3><br/>"); 
          
 
          
        out.print("</body></html>"); 
     
     }
    
    
}
