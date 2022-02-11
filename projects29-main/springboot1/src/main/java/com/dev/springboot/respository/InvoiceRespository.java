package com.dev.springboot.respository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import com.dev.springboot.model.Invoice;

	public interface InvoiceRespository extends JpaRepository<Invoice, Long> {

	}

