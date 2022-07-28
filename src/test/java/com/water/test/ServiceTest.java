package com.water.test;

import com.water.config.SpringConfig;
import com.water.pojo.Book;
import com.water.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class ServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void getByIdTest(){
        Book book = bookService.getById(3);
        System.out.println(book);
    }

    @Test
    public void getAllTest(){
        List<Book> list = bookService.getAll();
        System.out.println(list);
    }
}
