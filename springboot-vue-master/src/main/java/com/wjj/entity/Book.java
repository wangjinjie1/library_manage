package com.wjj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
//    设置主键自增
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;
    private String author;
}
