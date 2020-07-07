package com.alvis.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Alvis
 * @date 2020/7/6 19:30
 */

@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "--------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "--------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        //暂停几秒钟线程
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测RT");

        log.info("testD 异常比例");
        int age = 10 / 0;
        return "-------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE 异常数");
        int age = 10 / 0;
        return "-------testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey") // 热点限流模式必须带有blockHandler,否则进入错误页面
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "-------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException e) {
        return "deal_testHotKey , 备用的处理方法"; // 替代Sentinel系统默认提示：Blocked by Sentinel (Flow limiting)
    }
}
