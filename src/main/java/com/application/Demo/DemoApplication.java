package com.application.Demo;

import com.application.Demo.entity.Author;
import com.application.Demo.entity.Book;
import com.application.Demo.entity.Category;
import com.application.Demo.entity.Publisher;
import com.application.Demo.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return (args) -> {
			Book book1 = new Book("Abc", "Book name", "my 1st book");
			Author author1 = new Author("Test name", "Test description");
			Category category1 = new Category("Business books");
			Publisher publisher1 = new Publisher("1st publisher");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("Abc2", "Book name2", "my 2st book");
			Author author2 = new Author("Test name2", "Test description2");
			Category category2 = new Category("Business books2");
			Publisher publisher2 = new Publisher("1st publisher2");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);

			Book book3 = new Book("Abc3", "Book name3", "my 3st book");
			Author author3 = new Author("Test name3", "Test description3");
			Category category3 = new Category("Business books3");
			Publisher publisher3 = new Publisher("1st publisher3");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.createBook(book3);
		};
	}

}
