package com.example.MongoSprindData.Repository;

import com.example.MongoSprindData.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  EmployeeRepository extends MongoRepository<Employee,Integer> {
}
