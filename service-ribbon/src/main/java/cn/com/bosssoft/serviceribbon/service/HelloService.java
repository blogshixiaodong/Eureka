package cn.com.bosssoft.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shixiaodong
 * @date 2018/8/7 23:59
 */

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloServer(String name) {
        return restTemplate.getForObject("http://SERVICE-PROVIDER1/hello?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hi, " + name + ", sorry, error!";
    }

}
