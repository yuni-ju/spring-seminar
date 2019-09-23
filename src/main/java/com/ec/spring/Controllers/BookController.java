package com.ec.spring.Controllers;

import com.ec.spring.services.BookService;
import com.ec.spring.services.MemberService;
import models.Book;
import models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.POST)
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    public Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.PUT)
    public boolean updateBook(@PathVariable("id")int id, @RequestBody Book book){
        return bookService.updateBook(id,book);
    }
    @RequestMapping(value ="/{id}",method = RequestMethod.DELETE)
    public boolean deleteBook(@PathVariable("id")int id){
        return bookService.deleteBook(id);
    }
}
