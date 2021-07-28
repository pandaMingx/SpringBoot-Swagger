package com.panda.controller;

import com.panda.entity.Employee;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "员工管理模块")
public class EmployeeController {

    /**
     * 保存数据
     * @param user
     * @return
     */
    @PostMapping(value = "/save")
    //说明是什么方法(可以理解为方法注释)
    @ApiOperation(value = "添加用户", notes = "添加用户")

    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "添加用户数据")
    }
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "添加用户成功"),
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public String saveUser(Employee user){
        return "保存成功";
    }

    /**
     * 根据id查询用户
     *
     * @ApiImplicitParam注解演示
     *
     * @param id
     * @return
     */
    @GetMapping(value = "findById")
    @ApiOperation(value = "根据id获取用户信息", notes = "根据id查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id")
    public Employee getUser(Integer id){
        return null;
    }

    @DeleteMapping(value = "deleteById")
    @ApiOperation(value = "根据id删除数据", notes = "删除用户")
    public String delete(Integer id){
        return "删除成功";
    }

}
