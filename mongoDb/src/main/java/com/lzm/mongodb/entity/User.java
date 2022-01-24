package com.lzm.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @description:
 * @author: lzm
 * @create: 2022-01-22 02:16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("users")  //类的实例代表mobgo中的一条文档
public class User {
    @Id
    private Integer id;

    @Field("userName")
    private String name;

    @Field
    private Date birthday;
}
