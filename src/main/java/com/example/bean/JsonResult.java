package com.example.bean;

import org.springframework.context.annotation.Bean;

/**
 * 通用json数据返回
 * @author pc
 * @since 2020/8/8
 */
public class JsonResult {
    private String status;
    private Object result;
    public JsonResult status(String status){
        this.status=status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
