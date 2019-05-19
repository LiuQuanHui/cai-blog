package com.caiheng.blog.response;


/**
 * @author cai heng
 * @since 2019/5/19 20:06
 */

public class ServerResponse<T> {

    private String status;

    private String msg;

    private T data;

    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    private ServerResponse(String status) {
        this.status = status;
    }

    private ServerResponse(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponse(String status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public boolean isSuccess() {
        return this.status.equals(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse createBySuccess() {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse createBySuccessMessage(String msg) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResponse createBySuccess(T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerResponse createBySuccess(String msg, T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerResponse createByError() {
        return new ServerResponse(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg());
    }

    public static <T> ServerResponse createByErrorMessage(String msg) {
        return new ServerResponse(ResponseCode.ERROR.getCode(), msg);
    }

    public static <T> ServerResponse createByErrorCodeMessage(String errorCode, String errorMsg) {
        return new ServerResponse(errorCode, errorMsg);
    }
}
