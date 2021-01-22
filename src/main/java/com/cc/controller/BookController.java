package com.cc.controller;


import com.cc.entity.Book;
import com.cc.service.AsyncService;
import com.cc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 金金文
 * @since 2021-01-21
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private AsyncService asyncServiceImpl;
    @Autowired
    private BookService bookServiceImpl;
    @RequestMapping("/Byid")
    public Book getBook(Integer id){
//        asyncServiceImpl.add();
        Book byId = bookServiceImpl.getById(id);
        return byId;
    }
    @RequestMapping("/add")
    public Book insertBook(Book book){
        bookServiceImpl.save(book);
        int i=10/0;
        return book;
    }



}

