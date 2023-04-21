package com.ucolab.api.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.Serializable;

/**
 * 接口返回对象实体
 *
 * @param <T>
 * @author wujing
 */
public final class Result<T> implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(Result.class);

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code = 100;

    /**
     * 错误信息
     */
    private String msg = null;

    /**
     * 返回结果实体
     */
    private T data = null;

    public Result() {
    }

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(200, "", data);
    }

    public static <T extends Serializable> Result<T> error(int code, String msg) {
        return new Result<T>(code, msg, null);
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }

}