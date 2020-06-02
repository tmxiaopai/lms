package com.tmxf.lms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The type Lms application.
 * @author TMXIAOPAI
 */
@SpringBootApplication
@MapperScan("com.tmxf.lms.mapper")
public class LmsApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(LmsApplication.class, args);
    }

}
