package com.alvis.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alvis.springcloud.alibaba.myhandler.CustomerBlockHandler;
import com.alvis.springcloud.entities.CommonResult;
import com.alvis.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alvis
 * @date 2020/7/7 15:46
 */

@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    public CommonResult handleException(BlockException e) {
        return new CommonResult(444, e.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/ratelimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按url限流测试OK", new Payment(2020L, "serial002"));
    }

    //CustomerBlockHandler
    @GetMapping("/ratelimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerExecption2")
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "按customerBlockHandler限流测试OK", new Payment(2020L, "serial003"));
    }
}
