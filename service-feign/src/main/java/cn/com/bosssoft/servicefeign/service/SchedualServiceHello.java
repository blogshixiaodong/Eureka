package cn.com.bosssoft.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Shixiaodong
 * @date 2018/8/8 11:10
 */
@FeignClient(value = "service-provider1", fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String helloFromClient(@RequestParam(value = "name") String name);

}
