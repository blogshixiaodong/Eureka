package cn.com.bosssoft.servicehystrix.controller;

import cn.com.bosssoft.servicehystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Shixiaodong
 * @date 2018/8/8 14:41
 */
@Service
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.helloService(name);
    }

}
