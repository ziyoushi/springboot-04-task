package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author changchen
 * @create 2019-10-07 21:34
 */
@Service
public class ScheduledService {

    //second as well as minute, hour, day of month, month and day of week.

    /**
     * second(秒) as well as minute(分), hour(时), day of month(日), month(月) and day of week(周几).
     * "0 * * * * MON-FRI"
     */
    @Scheduled(cron = "0 * * * * MON-FRI")
    public void hello(){
        System.out.println("hello .....");
    }

}
