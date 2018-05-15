package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.BorrowerDao;
import com.app.model.Borrower;

@RestController
@RequestMapping("/borrowerEntry")
public class BorrowController {
	@Autowired
	BorrowerDao borrowerDao;
	
	@PostMapping("/borrower")
	public Borrower createUser(@RequestBody Borrower borrower){
		
			return borrowerDao.save(borrower);
		
	}
	
	@GetMapping("/borrowers")
	public List<Borrower> getAllBorrowers(){
		return borrowerDao.findAll();
	}
	
	@GetMapping("/borrower/{id}")
	public ResponseEntity<Borrower> getUserById(@PathVariable(value="id") long id){
		Borrower borrower=borrowerDao.findOne((id));
		if(borrower==null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(borrower);
	}
	
	@PutMapping("/borrowers/{id}")
	public ResponseEntity<Borrower> update(@PathVariable(value="id") int id, @RequestBody Borrower borrowerDetails){
		Borrower borrower=borrowerDao.findOne(id);
		if(borrower==null){
			return ResponseEntity.notFound().build();
		}
		Borrower updateBorrower=borrowerDao.save(borrower);
		borrower.setBooksName(borrowerDetails.getBooksName());
		borrower.setBorrowerFname(borrowerDetails.getBorrowerFname());
		borrower.setBorrowerLname(borrowerDetails.getBorrowerLname());
		borrower.setBooknumber(borrowerDetails.getBooknumber());
		return ResponseEntity.ok().body(updateBorrower);
	}
	
	@DeleteMapping("/borrower/{id}")
	public ResponseEntity<Borrower> delete(@PathVariable(value="id") int id)
	{
		Borrower borrower=borrowerDao.findOne(id);
		if(borrower==null){
			return ResponseEntity.notFound().build();
		}
		borrowerDao.delete(borrower);
		return ResponseEntity.ok().build();
		
	}
	
}
