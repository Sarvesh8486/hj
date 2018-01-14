package com.whiteboard.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whiteboard.springdemo.doa.CustomerDAO;
import com.whiteboard.springdemo.entity.Customer;
import com.whiteboard.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerContoller {

	@Autowired
	private CustomerService customerService; 
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
		List<Customer> customerList = customerService.getCustomers();
		model.addAttribute("customers", customerList);
		return "customer-list";
	}
	
}