package com.nbug.swaggertest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NBUG
 * @date 2018/8/30 14:31
 * Swagger注解说明
 *
 * swagger通过注解表明该接口会生成文档，包括接口名、请求方法、参数、返回信息的等等。
 *
 * @Api：修饰整个类，描述Controller的作用
 * @ApiOperation：描述一个类的一个方法，或者说一个接口
 * @ApiParam：单个参数描述
 * @ApiModel：用对象来接收参数
 * @ApiProperty：用对象接收参数时，描述对象的一个字段
 * @ApiResponse：HTTP响应其中1个描述
 * @ApiResponses：HTTP响应整体描述
 * @ApiIgnore：使用该注解忽略这个API
 * @ApiError ：发生错误返回的信息
 * @ApiImplicitParam：一个请求参数
 * @ApiImplicitParams：多个请求参数
 */
@RestController
@Api("测试")
public class TestController {
    @ApiOperation(value = "获取信息",notes = "获取信息")
    @GetMapping("/getMsg")
    public String getMsg(){

        return "ssssss";

    }

    @ApiOperation(value = "获取信息2",notes = "获取信息2")
    @PostMapping("/getMsg2")
    public String getMsg2(int id){

        return "ssssss222222";

    }
}
