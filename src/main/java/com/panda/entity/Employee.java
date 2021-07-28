package com.panda.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "员工信息")
public class Employee {

    @ApiModelProperty(value = "员工id",required=true)
    private String id;

    @ApiModelProperty(value = "员工姓名",required=true)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
