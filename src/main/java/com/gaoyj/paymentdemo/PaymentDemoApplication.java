package com.gaoyj.paymentdemo;

import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentDemoApplication {

    public static void main(String[] args) {
        // 需要添加这行代码，日志才会起效
        LogFactory.useCustomLogging(StdOutImpl.class);
        SpringApplication.run(PaymentDemoApplication.class, args);
    }

}
