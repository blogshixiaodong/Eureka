package cn.com.bosssoft.servicefeign.controller;

import cn.com.bosssoft.servicefeign.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shixiaodong
 * @date 2018/8/8 11:23
 */
@RestController
public class HelloController {

    @Autowired
    SchedualServiceHello schedualServiceHello;

    @GetMapping(value = "hello")
    public String sayHello(@RequestParam String name) {
        System.out.println("hello");
        return schedualServiceHello.helloFromClient(name);
    }

}
