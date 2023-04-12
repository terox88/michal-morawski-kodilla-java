package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoTestSuite() {
        //Given
        Product apple = new Product("apples");
        Product cherry = new Product("cherry");
        Invoice invoice = new Invoice("FV-1234");
        Item applesItem1 = new Item(apple,new BigDecimal(2.25), 5);
        Item applesItem2 = new Item(apple,new BigDecimal(1.25), 100);
        Item cherryItem1 = new Item(cherry, new BigDecimal(4.5), 3);
        Item cherryItem2 = new Item(cherry, new BigDecimal(3.5), 80);
        applesItem1.setInvoice(invoice);
        applesItem2.setInvoice(invoice);
        cherryItem1.setInvoice(invoice);
        cherryItem2.setInvoice(invoice);


        invoice.getItems().add(applesItem1);
        invoice.getItems().add(applesItem2);
        invoice.getItems().add(cherryItem1);
        invoice.getItems().add(cherryItem2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0,id);
        //CleanUp
        productDao.deleteAll();
        invoiceDao.deleteById(id);



    }
}
