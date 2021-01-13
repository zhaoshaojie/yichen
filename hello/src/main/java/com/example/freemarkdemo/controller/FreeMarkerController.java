package com.example.freemarkdemo.controller;

import com.example.freemarkdemo.utils.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author:sjZhao
 * @Date:2021/1/1218:51
 */
@Controller
@RequestMapping(value = "/freemarker")
public class FreeMarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping(value = "left")
    public String left(ModelMap modelMap){
        modelMap.put("resource",resource);
        return  "freemarker/left";
    }

    @RequestMapping(value ="center")
    public String  center(ModelMap modelMap){
        List<Map> list= new ArrayList<>();
        for(int i=0;i<10;i++){
            Map map= new HashMap();
            map.put("name","kevin_"+i);
            map.put("age",10+i);
            map.put("phone","1860291105"+i);
            list.add(map);
        }
        modelMap.put("users",list);
        modelMap.put("title","用户列表");
        return "freemarker/center/center";
    }
}
