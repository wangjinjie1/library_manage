package com.wjj;

import com.wjj.entity.Book;
import com.wjj.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpringbootVueApplicationTests {


    @Autowired
    BookMapper bookMapper;
    @Test
    void contextLoads() {
    }

    @Test
    void testFindAll(){
        List<Book> books = bookMapper.selectList(null);
        for (Book book:books
             ) {
            System.out.println(book);
        }
    }

    @Test
    void testSaveBook(){
        Book book = new Book();
        book.setName("www");
        book.setAuthor("hhhhh");
        int i  = bookMapper.insert(book);
        System.out.println(i);
    }

    @Test
    void  testFindById(){
        Book book = bookMapper.selectById(1);
        System.out.println(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(1);
        book.setName("全栈");
        book.setAuthor("小明");
        int i = bookMapper.updateById(book);
    }

    @Test
    void testDeleteById(){
        int i = bookMapper.deleteById(16);
        System.out.println(i);
    }

}
