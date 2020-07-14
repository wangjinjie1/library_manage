package com.wjj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjj.entity.Book;
import com.wjj.mapper.BookMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@MapperScan("com.wjj.mapper")
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookMapper bookMapper;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        Page<Book> bookPage = new Page<>(page,size);
        Page<Book> selectPage = bookMapper.selectPage(bookPage, null);
        return selectPage;
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book){
        int insert = bookMapper.insert(book);
        if (insert>0){
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id){
        return bookMapper.selectById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book){
        int insert = bookMapper.updateById(book);
        if (insert>0){
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        int i = bookMapper.deleteById(id);
        if (i>0){
            return "success";
        }else {
            return "error";
        }
    }

}
