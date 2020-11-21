package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class HomeController {
    public void process(final HttpServletRequest request, final HttpServletResponse response, final ServletContext servletContext, final ITemplateEngine templateEngine) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar cal = Calendar.getInstance();

        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        ctx.setVariable("today", dateFormat.format(cal.getTime()));
        templateEngine.process("home", ctx, response.getWriter());
    }

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
}
