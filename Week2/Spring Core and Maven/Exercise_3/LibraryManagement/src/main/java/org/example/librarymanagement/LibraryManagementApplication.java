package main.java.org.example.librarymanagement;

import com.library.aspect.LoggingAspect;
import org.springframework.context.ApplicationContext;

import com.library.repository.BookService;
import com.library.service.BookRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryManagementApplication {
    private static ApplicationContext context;
    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository b = context.getBean("bookRepository", BookRepository.class);


        System.out.println("Name: "+b.getName());

        LoggingAspect a = context.getBean("logging", LoggingAspect.class);
        a.method();




    }

}
