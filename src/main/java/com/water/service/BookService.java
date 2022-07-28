package com.water.service;

import com.water.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存图书
     * @param book
     * @return
     */
    public boolean sava(Book book);

    /**
     * 更改图书
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除图书
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询图书
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询所有图书
     * @return
     */
    public List<Book> getAll();
}
