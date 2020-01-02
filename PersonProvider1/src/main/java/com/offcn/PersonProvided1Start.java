package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * company: www.abc.com
 * Author: 苏依林
 * Create Data: 2019/12/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PersonProvided1Start {
    public static void main(String[] args) {
        SpringApplication.run(PersonProvided1Start.class, args);
    }
}
