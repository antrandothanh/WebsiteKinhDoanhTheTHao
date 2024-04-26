package com.project.WebsiteKinhDoanhTheThao.repository;

import com.project.WebsiteKinhDoanhTheThao.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
