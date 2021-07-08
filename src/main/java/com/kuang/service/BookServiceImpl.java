package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {
    //业务层service调dao层 ： 组合Dao层
    //可以增加一些操作 spring aop

    private BookMapper bookMapper;//spring直接托管注入？？？注解可以自动注入？？？@Autowired

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }//作用域？？私有的属性？？？


    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryById(int id) {
        return bookMapper.queryById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
