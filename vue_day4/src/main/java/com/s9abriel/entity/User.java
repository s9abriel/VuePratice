package com.s9abriel.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data //getter and setter
@AllArgsConstructor //全参
@NoArgsConstructor //无参
@ToString //toString
@Accessors(chain = true) //访问器
public class User {

    private String id;
    private String name;
    private Integer age;
    private Double salary;
    private String phoneCode;
}
