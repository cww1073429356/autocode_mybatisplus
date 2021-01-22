package com.cc.autocode_mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync //开启异步注解功能
@EnableScheduling //开启基于注解的定时任务
@SpringBootApplication(scanBasePackages ="com.cc")//主启动类
@MapperScan(value = {"com.cc.mapper","com.baomidou.mybatisplus.samples.quickstart.mapper"})
public class AutocodeMybatisplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutocodeMybatisplusApplication.class, args);
	}

}
