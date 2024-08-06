package org.example.librarymanagement;


public class LibraryManagementApplication {

	public static void main(String[] args) {

		System.out.println("Spring Web, Spring Data JPA, and H2 Database dependencies added");
        System.out.println("Book entity and BookRepository interface created");
        //System.out.println("Controller class created for CRUD operations");
        BookController b = new BookController();
        b.desc();
        
		

	}

}
