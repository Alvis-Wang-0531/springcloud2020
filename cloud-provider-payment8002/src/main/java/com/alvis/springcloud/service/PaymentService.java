package com.alvis.springcloud.service;

import com.alvis.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Alvis
 * @date 2020/6/23 17:19
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
