package com.laity.springcloud.service;

import com.laity.springcloud.entities.CommonResult;
import com.laity.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
/**
 * feign只需要定义服务绑定接口且以声明式的方法，优雅而简单的实现了服务调用
 * 不再通过RestTemplate进行服务调用
 */
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    /**
     * openfeign测试，超时方法
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
 
 
