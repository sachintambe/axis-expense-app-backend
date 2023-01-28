package com.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ex.model.Expense;
import com.ex.service.Expenseservice;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ExpenseController {
	
	    @Autowired
	    Expenseservice expenseService;
	
	    
	
	    public ExpenseController() {
			
		}
	    
	    
		public Expenseservice getExpenseService() {
			return expenseService;
		}


		public void setExpenseService(Expenseservice expenseService) {
			this.expenseService = expenseService;
		}


		@GetMapping(path="/expense/{id}")
         public Expense getExpenseByTripId(@PathVariable int tripId) {
	    	  
	    	return expenseService.findById(tripId);	    	
	    }
	    @GetMapping(path="/expense")
         public List<Expense> getAllExpenses(){
	    	   return expenseService.getAllexpense();
	    }
	    
	    @PostMapping(path="/expense")
	    public Expense addExpense (@RequestBody Expense expense) {
	    	return   expenseService.addexpense(expense);
	    }
	    
	    @DeleteMapping("/expense/{id}")
	   public void deleteexpenseById(@PathVariable long id) {
		   
	    	expenseService.deleteExpenseById(id);
	   }
	    @PutMapping("/expense/{id}")
	    public Expense updateExpense (@RequestBody Expense expense,@PathVariable long id) {
	    	return expenseService.updateExpenseById(expense,id);
	    }
	    

}
