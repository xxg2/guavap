package com.guava;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;
import java.util.EnumSet;

@Configuration
@ComponentScan({ "com.guava" })
public class AppConfiguration
{

    @Bean
    public ServletContextInitializer initializer()
    {
        return new ServletContextInitializer()
        {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
                servletContext.setInitParameter("tapestry.app-package", "com.guava");
                servletContext.setInitParameter("tapestry.development-modules", "com.guava.services.DevelopmentModule");
                servletContext.setInitParameter("tapestry.qa-modules", "com.foo.services.QaModule");
                servletContext.setSessionTrackingModes(EnumSet.of(SessionTrackingMode.COOKIE));
            }
        };
    }

    @Bean
    public ConfigurableServletWebServerFactory webServerFactory()
    {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error404"));
        return factory;
    }
}
