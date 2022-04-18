package com.example.nmai.Test;

import com.example.nmai.Data.DataOfChatBot;
import com.example.nmai.pages.MealManagement;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ChatBot", value = "/ChatBot")
public class ChatBotController extends HttpServlet {

    public void init() {
        System.out.println("bắt đầu Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // tạo phương thức tại đây
        request.getRequestDispatcher("ChatBot.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] botMsg = request.getParameterValues("botMsg");
        String[] humanMsg = request.getParameterValues("humanMsg");

        for (String bot : botMsg) {
            System.out.println(bot);
        }
        for (String human : humanMsg) {
            System.out.println(human);
        }
    }

    public void destroy() {
        System.out.println("Kết thúc servlet");
    }
}