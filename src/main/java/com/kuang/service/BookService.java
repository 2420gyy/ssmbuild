package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

public interface BookService {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryById(int id);

    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}
