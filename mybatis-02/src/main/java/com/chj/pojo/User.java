package com.chj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

/**
 * @author ：com.chj
 * @date ：Created in 2021/10/20 19:34
 * @params :  user实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
@Alias("user")
public class User {
    private int id;
    private String name;
    private String pwd;
}
