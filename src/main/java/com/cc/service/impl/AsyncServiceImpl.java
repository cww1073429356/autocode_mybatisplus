package com.cc.service.impl;

import com.cc.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author: jinjinwen
 * @description: async
 * @date: 2021-01-22 09:40
 **/
@Service
public class AsyncServiceImpl implements AsyncService {
    @Override
    @Async
    public void dealAsync(){

        try {
            Thread.sleep(3000);
            System.out.println("处理好了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("正在处理中！");
    }
    //秒   分   时     日   月   周几
    //0 * * * * MON-FRI
    //注意cron表达式的用法；
    @Scheduled(cron = "*/2 * * * * *")
    public void add(){
        System.out.println("开始...");
    }
}
