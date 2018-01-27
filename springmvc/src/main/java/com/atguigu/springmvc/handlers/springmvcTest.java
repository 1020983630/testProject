package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/springmvc")
@Controller
public class springmvcTest {

    private static final String SUCCESS = "success";

    @RequestMapping("testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "User-Agent") String UserAgent ){
        System.out.println("testRequestHeader:" + UserAgent);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam("username") String username,
                                   @RequestParam(value = "age",required = false) Integer age){
        System.out.println("testRequestParam: username is "+username+",age is "+age);
        return SUCCESS;
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id){
        System.out.println("test Delete:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/put/{id}",method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id){
        System.out.println("test Put:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String testRestPost(){
        System.out.println("test Post");
        return SUCCESS;
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public String testRestGet(@PathVariable Integer id){
        System.out.println("test Get:" + id);
        return SUCCESS;
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println("testPathVariable" + id);
        return SUCCESS;
    }

    @RequestMapping("test")
    public String test(){
        System.out.println("test");
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethon");
        return SUCCESS;
    }

    @RequestMapping(value = "testParamsAndHeaders",
            params = {"username","age!=10"},
            headers = {"Accept-Language=en-US,en;q=0.5"})
    public String testParamsAndHeaders(){
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }
}
