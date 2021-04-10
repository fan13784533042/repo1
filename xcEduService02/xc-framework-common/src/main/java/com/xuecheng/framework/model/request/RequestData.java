package com.xuecheng.framework.model.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.StringUtils;

/**
 * Created by mrt on 2018/3/5.
 */
/*@Data
@ToString*/

public class RequestData {


     private int age;

     private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
