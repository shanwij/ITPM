/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code_complexity.contraller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Lahiru Sanka
 */
@WebServlet(name = "main_servlet", urlPatterns = {"/main_servlet"})
public class main_servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession httpsession = request.getSession();

        try {

            String path = main_servlet.class.getClassLoader().getResource("").getPath();
            String fullPath = URLDecoder.decode(path, "UTF-8");
            String pathArr[] = fullPath.split("Fileupload/"); //get WEB INF Path
            String pdfname = "";

            System.out.println("*****ado****" + pathArr[0]);

            if (ServletFileUpload.isMultipartContent(request)) {

                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List<Object> items = upload.parseRequest(request);
                for (Object x : items) {
                    FileItem fileitem = (FileItem) x;

                    System.out.println("" + fileitem);

                    // String extention = (fileitem.getName().contains(".") ? fileitem.getName().substring(fileitem.getName().lastIndexOf('.')) : "");
                    // String name = System.currentTimeMillis() + "_" + fileitem.getName().hashCode() + extention;
                    if (fileitem.getSize() < 0) {
                        out.print("Error: No File Found");
                    } else {

                        System.out.println("Directory is Exist!" + fileitem);
                        // String extention = (fileitem.getName().contains(".") ? fileitem.getName().substring(fileitem.getName().lastIndexOf('.')) : "");

                        File image = new File(pathArr[0] + "/Files/" + fileitem.getName()); //save file in server
                        if (image.exists()) {

                            out.print("Error: File Name Already Exist!");
                        } else {

                            image.createNewFile();
                            FileOutputStream fos = new FileOutputStream(image);
                            fos.write(fileitem.get());
                            fos.close();
                            out.print("Uploaded");

                            try (BufferedReader br = new BufferedReader(new FileReader(path + "Files/" + fileitem.getName()))) {
                                StringBuilder sb = new StringBuilder();
                                String line = br.readLine();

                                while (line != null) {
                                    sb.append(line);
                                    sb.append(System.lineSeparator());
                                    line = br.readLine();
                                }
                                String everything = sb.toString();

                                String codelines = "";
                                int ifcount = 0;
                                int forcount = 0;
                                int count = 0;
                                for (String f_line : everything.split("\\n")) {
                                    f_line = f_line.split("//")[0].trim();
                                    count++;
                                    if (f_line.contains("if")) {
                                        ifcount++;
                                        codelines += "<tr> <td >"+count+"</td> <td>"+f_line+"</td> <td>2</td> <td>1</td> <td>Ccspps</td> <td>Ccs</td> </tr>"+"\n";
                                        
                                        
                                        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssss" + f_line);
                                    }
                                    else if (f_line.contains("for")) {
                                        forcount++;
                                        codelines += "<tr> <td >"+count+"</td> <td>"+f_line+"</td> <td>3</td> <td>1</td> <td>Ccspps</td> <td>Ccs</td> </tr>"+"\n";
                                         
                                    }
                                    else if (f_line.contains("switch")) {
                                        forcount++;
                                        codelines += "<tr> <td >"+count+"</td> <td>"+f_line+"</td> <td>2</td> <td>1</td> <td>Ccspps</td> <td>Ccs</td> </tr>"+"\n";
                                         
                                    }
                                    else if (f_line.contains("case")) {
                                        forcount++;
                                        codelines += "<tr> <td >"+count+"</td> <td>"+f_line+"</td> <td>1</td> <td>1</td> <td>Ccspps</td> <td>Ccs</td> </tr>"+"\n";
                                         
                                    }else{
                                        codelines += "<tr> <td >"+count+"</td> <td>"+f_line+"</td> <td></td> <td></td> <td>Ccspps</td> <td>Ccs</td> </tr>"+"\n";
                                       
                                    }
                                }
                                System.out.println("for Count :" + forcount);
                                System.out.println("IF  Count :" + ifcount);

                                out.print("this one>>>>>" + everything);
                                System.out.println("------------------------------------------------------------"+codelines);
                                httpsession.setAttribute("Readfile", codelines);
                                System.out.println("**************session*********" + httpsession.getAttribute("Readfile"));
                            }

                        }

                    }

                }

            } else if (request.getParameter("RqData") != null) {
                System.out.println("calllllllllllllllllllllllllllll");
                out.print(httpsession.getAttribute("Readfile"));

            } else {
                out.print("Error: No File Found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
