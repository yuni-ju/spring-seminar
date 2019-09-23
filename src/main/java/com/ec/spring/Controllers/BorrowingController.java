package com.ec.spring.Controllers;


import com.ec.spring.services.BorrowingService;
import models.Borrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowings")
public class BorrowingController {

    @Autowired
    private BorrowingService borrowingService;

    @GetMapping
    public List<Borrowing> getAllBorrowings(){
        return borrowingService.getAllBorrowing();
    }

    @GetMapping("/{id}")
    public Borrowing getBorrowingById(@PathVariable int id){
        return borrowingService.getBorrowingById(id);
    }

    @PostMapping("/{memberId}/{bookId}")
    public void borrow(@PathVariable String memberId, @PathVariable int bookId){
        borrowingService.borrow(memberId,bookId);
    }

    @PutMapping("/{memberId}/{bookId}")
    public void returnBook(@PathVariable String memberId, @PathVariable int bookId){
        borrowingService.returnBook(memberId,bookId);
    }
}
