package com.vip.swaggerfirst.controller;

import com.vip.swaggerfirst.common.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author vip
 * @Description:
 * @Date 2020/2/15
 */
@RestController
@RequestMapping("/swagger/")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {

    @ApiOperation(value = "输出参数id")
    @RequestMapping(value = "testId", method = RequestMethod.GET)
    public String testId(Integer id,String name,Integer age) {
        return id+" "+name+" "+age;
    }

    @ApiOperation(value = "get测试")
    @RequestMapping(value = "testGet", method = RequestMethod.GET)
    public String testGet() {
        return "Hello world!!!";
    }

    @ApiOperation(value = "模拟用户登录")
    @PostMapping("testLogin")
    public String testUserLogin(UserDto dto){
        if(!dto.checkParam()){
            return "参数异常！";
        }
        return dto.toString();
    }

}
