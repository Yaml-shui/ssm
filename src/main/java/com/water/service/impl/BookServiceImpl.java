package com.water.service.impl;

import com.water.controller.Code;
import com.water.dao.BookDao;
import com.water.exception.BusinessException;
import com.water.exception.SystemException;
import com.water.pojo.Book;
import com.water.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public boolean sava(Book book) {
        bookDao.sava(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        //模拟异常
        if (id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要挑战我的极限");
        }

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试",e);
        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
