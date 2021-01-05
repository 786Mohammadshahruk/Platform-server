package com.Ugam.PlatformServer.utils;

import org.springframework.stereotype.Component;

@Component
public class CustomResponse {
    private  String status;
    private  String code;
    private  String message;
    private  Object data;

    public CustomResponse(){}

    public CustomResponse(String code,String message,Object data){
        super();
        this.status="Success";
        this.code=code;
        this.message=message;
        this.data=data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
