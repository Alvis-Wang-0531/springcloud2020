package com.alvis.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alvis.springcloud.entities.CommonResult;

/**
 * @author Alvis
 * @date 2020/7/7 17:03
 */

public class CustomerBlockHandler {
        public static CommonResult handlerExecption1(BlockException e){
            return new CommonResult(444,"按用户自定义方法 -------1");
        }

        public static CommonResult handlerExecption2(BlockException e){
            return new CommonResult(444,"按用户自定义方法 -------2");
        }
}
