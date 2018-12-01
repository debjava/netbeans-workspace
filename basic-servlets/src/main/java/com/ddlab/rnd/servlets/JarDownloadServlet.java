package com.ddlab.rnd.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JarDownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("application/jar");

        File file = new File("E:/netbeans-workspace/basic-servlets/sampleJar/abcd.jar");
        byte[] buffer = new byte[(int) file.length()];
        FileInputStream fin = new FileInputStream(file);
        fin.read(buffer);
        OutputStream os = response.getOutputStream();
        os.write(buffer);
        os.flush();

    }

}
