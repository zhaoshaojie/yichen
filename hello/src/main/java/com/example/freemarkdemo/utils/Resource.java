package com.example.freemarkdemo.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author:sjZhao
 * @Date:2021/1/12 16:53
 */
//标识这个类是一个读取配置文件的类

@Configuration

//标识配置的一些属性，其中的prefix表示前缀
@ConfigurationProperties(prefix = "com.zhaosj.opensource")


//指定所读取的配置文件的路径
@PropertySource("classpath:resource1.properties")
@Data
public class Resource {
    
    private String name;
    private String website;
    private String language;

}
