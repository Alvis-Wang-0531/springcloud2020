package com.alvis.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alvis
 * @date 2020/6/23 14:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T  data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
