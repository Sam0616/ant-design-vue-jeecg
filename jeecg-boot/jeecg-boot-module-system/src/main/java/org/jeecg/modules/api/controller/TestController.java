package org.jeecg.modules.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//http://localhost:8080/jeecg-boot/test/jeecgDemo/hello
@Controller
@RequestMapping("/test/jeecgDemo")
@Slf4j
public class TestController {

    @GetMapping(value = "/hello")
    @ResponseBody
    public Result<String> hello(){
        Result<String> result = new Result<>();
        result.setResult("hello jeegboot！");
        result.setSuccess(true);
        return result;
    }
}
