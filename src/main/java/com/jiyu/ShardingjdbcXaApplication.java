package com.jiyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zhongjingyun
 * @Date 2020/2/14 下午5:42
 **/
@SpringBootApplication(scanBasePackages = {
        "com.jiyu"
})
@MapperScan(basePackages = "com.jiyu.dao")
public class ShardingjdbcXaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingjdbcXaApplication.class, args);
    }
}
