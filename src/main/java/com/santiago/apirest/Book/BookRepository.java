package com.santiago.apirest.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, Integer> {
    void deleteById(Integer id);
    
    //public int update(Book book);
    //public int deleteById(int id);
}
