package com.kylon.controller;

import com.kylon.resultful.Resp;
import com.kylon.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
@Api(tags = "test", value = "测试接口")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value = "testone")
    @GetMapping("/testone")
    public Resp testOne(){
        return Resp.success(testService.test());
    }
}
