package com.focusone.testjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.focusone.testjpa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	List<Customer> findByFirstName(String firstName);

}
