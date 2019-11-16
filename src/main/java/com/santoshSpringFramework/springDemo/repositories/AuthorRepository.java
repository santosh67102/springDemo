package com.santoshSpringFramework.springDemo.repositories;

import com.santoshSpringFramework.springDemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
