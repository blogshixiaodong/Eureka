package cn.com.bosssoft.serviceribbon.controller;

import cn.com.bosssoft.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shixiaodong
 * @date 2018/8/8 0:01
 */
@RestController
public class HelloController implements ErrorController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        System.out.println("HelloController");
        return helloService.helloServer(name);
    }

    @Override
    public String getErrorPath() {
        System.out.println("happen error");
        return "errrrrrr!!!";
    }
}
