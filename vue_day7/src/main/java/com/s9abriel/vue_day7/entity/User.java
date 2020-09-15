package com.s9abriel.vue_day7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Author sushibin
 * @Date 2020/9/15 7:07 下午
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class User {

    private String id;
    private String name;
    private Integer age;
    private Date bir;
}
