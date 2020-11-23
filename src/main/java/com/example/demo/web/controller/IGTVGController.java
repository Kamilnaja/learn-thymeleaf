package com.example.demo.web.controller;

import org.thymeleaf.ITemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface IGTVGController {
    public void process(
            HttpServletRequest request, HttpServletResponse response, ServletContext servletContext, ITemplateEngine templateEngine
    ) throws IOException;
}
