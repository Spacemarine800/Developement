package com.main.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.app.model.Invoice;
import com.main.app.service.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	private InvoiceService invService;
	
	
	@GetMapping("/invoices/{invoiceid}")
	public Invoice retrieveInvoice(@PathVariable long invoiceid){
		return invService.viewInvoice(invoiceid);
	}
	
	@PostMapping("/invoices/")
	public String addInvoice(){
		return invService.addInvoice();
	}
	
	@GetMapping("/invoices")
	public List<Map<String, Object>> viewAllInvoices(){
		return invService.viewAllInvoices();
	}
	
}
