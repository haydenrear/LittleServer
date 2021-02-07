package com.ee.okay;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class LittleServer {

    public static void main(String [] args) throws LifecycleException, ServletException {

        String userDir =System.getProperty("user.dir");
        System.out.println(userDir);
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8000);
        tomcat.addWebapp("/", userDir+"\\src\\main\\resources");
        tomcat.start();
        tomcat.getServer().await();

    }


}
