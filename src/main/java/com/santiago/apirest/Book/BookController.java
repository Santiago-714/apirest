package com.santiago.apirest.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200") 
@RestController
public class BookController {
    
    @Autowired
    BookService bookService;

    @GetMapping("/libro")
    public ResponseEntity<List<Book>> listarBook(){
        return ResponseEntity.ok(bookService.listarBook());
    }

    @PostMapping("/libro")
    @ResponseBody
    public void createBook(@RequestBody Book book){
        bookService.createBook(book);
    }

    @DeleteMapping("/libro/{id}")
    public ResponseEntity<Boolean> deleteBook(@PathVariable Integer id){
        bookService.borrarBook(id);
        return ResponseEntity.ok(!(bookService.buscarBookPorId(id)!=null));
    }

    @GetMapping("/libro/{id}")
    public Book buscarBookPorId(@PathVariable Integer id){
        return bookService.buscarBookPorId(id);
    }

    @PutMapping("/libro")
    public void modificarBookPorId(@RequestBody Book book){
        bookService.modificarBook(book);
    }

}
