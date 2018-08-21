package com.main.app.repository;

import java.sql.Time;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.main.app.model.Invoice;

@Repository
public class InvoiceRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Invoice findInvoiceById(long id) {
		Invoice inv = jdbcTemplate.queryForObject("select * from invoices where id=?", new Object[] { id },	new BeanPropertyRowMapper<Invoice>(Invoice.class));
		return inv;
	}

	public List<Map<String, Object>> retrieveAllInvoices() {
		List<Map<String, Object>> inv = jdbcTemplate.queryForList("select * from invoices", new Object[] {});
		return inv;
	}
	
	public void addInvoice(){
		Invoice inv = new Invoice();
		inv.setId(5);
		inv.setClient("Patrick");
		inv.setVatRate(24);
		try{
			jdbcTemplate.update("insert into invoices values(?,?,?,?)",	new Object[] { inv.getId(), inv.getClient(), inv.getVatRate(), new Time(System.currentTimeMillis()) });
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
