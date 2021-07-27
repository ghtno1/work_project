package nacos.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test/controller")
public class TestController {

    @RequestMapping(value = "/test1")
    @ResponseBody
    public void test1(){
        System.out.println("hello nacos");
    }
}
