package com.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.hospital.dao")
public class HospitalApp  extends SpringBootServletInitializer {
        //    使用自带tomcat启动
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(HospitalApp.class);
//    }
    public static void main(String[] args){
        SpringApplication.run(HospitalApp.class,args);
    }

}
