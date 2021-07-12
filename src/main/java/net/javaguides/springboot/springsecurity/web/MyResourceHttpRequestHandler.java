package net.javaguides.springboot.springsecurity.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;


import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

@Component
public class MyResourceHttpRequestHandler extends ResourceHttpRequestHandler {
     static String ATTR_FILE = MyResourceHttpRequestHandler.
            class.getName() + ".file";

    @Override
    protected Resource getResource(HttpServletRequest request) throws
            IOException {
        final File file = (File) request.getAttribute(ATTR_FILE);
        System.out.println(ATTR_FILE);
        return new FileSystemResource(file);
    }
    
}