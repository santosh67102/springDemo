package com.santoshSpringFramework.springDemo.repositories;

import com.santoshSpringFramework.springDemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
