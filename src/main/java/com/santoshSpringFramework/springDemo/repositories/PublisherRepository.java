package com.santoshSpringFramework.springDemo.repositories;

import com.santoshSpringFramework.springDemo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
