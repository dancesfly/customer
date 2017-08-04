package com.test.customer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.provider.DubboProductorTest;

public class CustomerMain {  
    public static void main(String[] args) throws InterruptedException{  
        ClassPathXmlApplicationContext cfig = new ClassPathXmlApplicationContext("ApplicationContextCustomer.xml");  
        DubboProductorTest test = (DubboProductorTest) cfig.getBean("dubboProvider");  
        System.out.println("消费者调用服务方接口开始");  
        test.sayHello();  
        //Thread.sleep(100000);  
        System.out.println("消费者调用服务方接口结束");  
    }  
}  