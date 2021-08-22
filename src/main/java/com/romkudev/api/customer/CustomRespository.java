package com.romkudev.api.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRespository extends MongoRepository<Customer, String> {
}
