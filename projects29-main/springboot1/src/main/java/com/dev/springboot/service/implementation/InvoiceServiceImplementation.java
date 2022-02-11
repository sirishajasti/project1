package com.dev.springboot.service.implementation;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dev.springboot.exception.InvoiceNotFoundException;
import com.dev.springboot.model.Invoice;
import com.dev.springboot.respository.InvoiceRespository;
import com.dev.springboot.service.InvoiceService;

@Service
public class InvoiceServiceImplementation implements InvoiceService{

    @Autowired
    private InvoiceRespository repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
       return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
       return repo.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
       Optional<Invoice> opt = repo.findById(id);
       if(opt.isPresent()) {
           return opt.get();
       } else {
           throw new InvoiceNotFoundException("Invoice with Id : "+id+" Not Found");
       }
    }

    @Override
    public void deleteInvoiceById(Long id) {
       repo.delete(getInvoiceById(id)); 
    }

    @Override
    public void updateInvoice(Invoice invoice) {
       repo.save(invoice);
    }
}
