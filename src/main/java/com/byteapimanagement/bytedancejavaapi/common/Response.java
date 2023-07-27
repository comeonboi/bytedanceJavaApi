package com.byteapimanagement.bytedancejavaapi.common;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Response {
    @ApiModelProperty(value = "是否成功")
    private boolean success;
    @ApiModelProperty(value = "返回码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();



    //构造方法私有
    private Response(){}

    public static Response successResponse(){
        Response response = new Response();
        response.setSuccess(true);
        response.setCode(ResultCode.SUCCESS);
        response.setMessage("成功");
        return response;
    }

    public static Response errorResponse(){
        Response response = new Response();
        response.setSuccess(false);
        response.setCode(ResultCode.ERROR);
        response.setMessage("失败");
        return response;
    }

    //失败静态方法
    public static Response error() {
        Response response = new Response();
        response.setSuccess(false);
        response.setCode(ResultCode.ERROR);
        response.setMessage("失败");
        return response;
    }

    public Response success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public Response status(String status) {
        this.setStatus(status);
        return this;
    }

    public Response message(String message) {
        this.setMessage(message);
        return this;
    }

    public Response code(Integer code) {
        this.setCode(code);
        return this;
    }

    public Response data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Response data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }





}

