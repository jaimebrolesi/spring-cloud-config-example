package com.jaimebrolesi.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloWorldController {

    @Value("${hello.world.message}")
    private String helloWorld;

    @Value("${hello.world.encrypted}")
    private String helloWorldEncrypt;

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String getHelloWorld() {
        System.out.println(helloWorld);
        return helloWorld;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-encrypt")
    public String getHelloWorldEncrypted() {
        System.out.println(helloWorldEncrypt);
        return helloWorldEncrypt;
    }
}
