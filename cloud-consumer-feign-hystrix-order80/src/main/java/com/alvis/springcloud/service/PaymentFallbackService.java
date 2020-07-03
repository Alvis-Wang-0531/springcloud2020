package com.alvis.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Alvis
 * @date 2020/7/1 15:26
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----8001服务器挂了 /(ToT)/";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService   paymentInfo_TimeOut /(ToT)/";
    }
}
