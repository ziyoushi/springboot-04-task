package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author changchen
 * @create 2019-10-07 21:22
 */
@Service
public class AsyncService {

    @Async //这个注解告诉spring 这个个异步方法
    public void hello(){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("处理数据中。。。。");
    }
}
