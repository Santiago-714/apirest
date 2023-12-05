package com.santiago.apirest.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepo;
    
    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    public void borrarBook(Integer id){
        bookRepo.deleteById(id);
    }

    public List<Book> listarBook(){
        return bookRepo.findAll();
    }

    public Book buscarBookPorId(Integer id){
        return bookRepo.findById(id).orElse(null);
    }

    public void modificarBook(Book book){
        bookRepo.save(book);
    }

}
