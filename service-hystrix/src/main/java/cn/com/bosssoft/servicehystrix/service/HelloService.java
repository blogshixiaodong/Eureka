package cn.com.bosssoft.servicehystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shixiaodong
 * @date 2018/8/8 14:37
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/hello?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hello, " + name + ", sorry error!";
    }

}
