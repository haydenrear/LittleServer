package com.ee.okay;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class LittleServer {

    private String hello = "hello world";

    public static void main(String [] args) throws LifecycleException, ServletException {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8000);
        tomcat.addWebapp("/", "C:\\Users\\hayde\\IdeaProjects\\ee\\src\\main\\resources");
        tomcat.start();
        tomcat.getServer().await();

    }


}
