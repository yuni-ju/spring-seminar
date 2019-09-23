package com.ec.spring.services;

import models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {

    private ArrayList<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        //도서추가
        books.add(book);
    }
    public ArrayList<Book> getBooks(){
        //모든도서반환
        return books;
    }
    public Book getBookById(int id){
        //id를 가진 도서 반환
        for(Book book : books){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }

    public boolean updateBook(int id, Book updateBook){
        for(Book book : books){
            if(book.getId()==id){
                book.setName(updateBook.getName());
                book.setAuthor(updateBook.getAuthor());
                return true;
            }
        }
        return false;
    }

    public boolean deleteBook(int id){
        for(Book book : books){
            if(book.getId()==id){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
