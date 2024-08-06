package main.java.org.example.librarymanagement;

import org.springframework.context.ApplicationContext;

import com.library.repository.BookService;
import com.library.service.BookRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryManagementApplication {
    private static ApplicationContext context;
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(BookRepository.class);
        //BookService b_new = cont.getBean(BookService.class);

        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository b = context.getBean("bookRepository", BookRepository.class);


        System.out.println("Name: "+b.getName());

        System.out.println("Constructor injection in BookService");




    }

}
