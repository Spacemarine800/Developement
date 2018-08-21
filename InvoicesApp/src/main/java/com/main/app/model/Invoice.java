package com.main.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Invoice {

	private long id;
	private String client;
	private long vatRate;
	private Date invoiceDate;
	private List<InvoiceItem> items;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public long getVatRate() {
		return vatRate;
	}
	public void setVatRate(long vatRate) {
		this.vatRate = vatRate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public List<InvoiceItem> getItems() {
		return items;
	}
	public void setItems(List<InvoiceItem> items) {
		this.items = items;
	}
	
	
	
}
