package org.repo.scbookservice.Controller;

import org.repo.scbookservice.Model.Book;
import org.repo.scbookservice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/dbService")
public class BookController{

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/{name}")
    public List<Book> getBooksForAuthor(@PathVariable("name") String author){
        return bookService.getAllBooks(author);
    }
}
