package com.example.freemarkdemo;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
class FreeMarkerDemoApplicationTests {
    private static final String TEMPLATE_PATH = "src/main/resources/templates";
    private static final String CLASS_PATH = "src/main/java/com/example/freemarkdemo/vo";

    /**
     * 最常见的问题：
     * java.io.FileNotFoundException: xxx does not exist.
     *     FreeMarker jar 最新的版本（2.3.23）提示 Configuration 方法被弃用
     * 代码自动生产基本原理：
     *     数据填充 freeMarker 占位符
     */
    @Test
    void contextLoads() {
        //创建freemarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            //获取模板路径
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            //创建数据模型
            Map<String, Object> dateMap = new HashMap<String, Object>();
            dateMap.put("classPath", "com.example.freemarkdemo.vo");
            dateMap.put("className", "Hello2");
            dateMap.put("helloWorld", "通过freemarker获取java文件");
            //加载模板文件
            Template template = configuration.getTemplate("hello.ftl");
            //生成数据
            File docFile = new File(CLASS_PATH + "\\" + "Hello2.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            //输出文件
            template.process(dateMap, out);
            System.out.println("文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
