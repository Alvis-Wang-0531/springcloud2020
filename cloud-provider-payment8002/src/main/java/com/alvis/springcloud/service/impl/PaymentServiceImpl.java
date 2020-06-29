package com.alvis.springcloud.service.impl;

import com.alvis.springcloud.dao.PaymentDao;
import com.alvis.springcloud.entities.Payment;
import com.alvis.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Alvis
 * @date 2020/6/23 17:20
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
