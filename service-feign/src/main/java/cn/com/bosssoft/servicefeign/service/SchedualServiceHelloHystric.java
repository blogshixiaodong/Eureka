package cn.com.bosssoft.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author Shixiaodong
 * @date 2018/8/8 15:19
 */
@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {

    @Override
    public String helloFromClient(String name) {
        return "服务熔断！" + "请求参数为name=" + name;
    }
}
