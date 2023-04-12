package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.hibernate.validator.internal.metadata.provider.ProgrammaticMetaDataProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class ItemDaoTestSuite {
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;
    @Test
            void testItemDaoSave() {
        //Given
        Product product = new Product("Apple");
        Item item = new Item(product,new BigDecimal(2.50),5);
        Item item1 = new Item(product, new BigDecimal(3.69), 7);
        product.getItems().add(item1);
        product.getItems().add(item);

        //When
        itemDao.save(item);
        itemDao.save(item1);
        int id = product.getId();
        //Then
        Assertions.assertNotEquals(0,id);
        //CleanUp
        itemDao.deleteAll();
    }


}
