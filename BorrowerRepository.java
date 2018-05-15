package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Borrower;

public interface BorrowerRepository extends JpaRepository<Borrower, Long >{

}
