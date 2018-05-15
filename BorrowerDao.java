package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Borrower;
import com.app.repository.BorrowerRepository;

@Service
public class BorrowerDao {
	@Autowired
	BorrowerRepository borrowerRepo;

	public Borrower save(Borrower borrower){
		return borrowerRepo.save(borrower);
	}

	//search all Borrowers

	public List<Borrower> findAll(){
		return borrowerRepo.findAll();
		
	}
	//get an borrower

	public Borrower findOne(long id){
		return borrowerRepo.findOne(id);
	}

	//delete an employee

	public void delete(Borrower borrower){
		borrowerRepo.delete(borrower);
	}
}
