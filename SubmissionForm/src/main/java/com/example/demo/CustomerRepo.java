package com.example.demo;

import org.springframework.data.repository.CrudRepository;
//primary key will be Intreger type and Customer Class se interact karna hai 
public interface CustomerRepo extends CrudRepository<Customers, Integer>{

}
