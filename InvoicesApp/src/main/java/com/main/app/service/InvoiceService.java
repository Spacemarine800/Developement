package com.main.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.app.model.Invoice;
import com.main.app.repository.InvoiceRepository;

@Component
public class InvoiceService {

	@Autowired
	InvoiceRepository invRepo;
	
	public String addInvoice(){
		System.out.println("This is adding a invoice");
		invRepo.addInvoice();
		return "Invoice Added";
	}
	
	public Invoice viewInvoice(long invoiceid){
		System.out.println("This is viewing an invoice");
		return invRepo.findInvoiceById(invoiceid);
	}
	
	public List<Map<String, Object>> viewAllInvoices(){
		System.out.println("This is viewing all invoices");
		return invRepo.retrieveAllInvoices();
	}
	
}
