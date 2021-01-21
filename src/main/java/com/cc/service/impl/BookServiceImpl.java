package com.cc.service.impl;

import com.cc.entity.Book;
import com.cc.mapper.BookMapper;
import com.cc.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 金金文
 * @since 2021-01-21
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
