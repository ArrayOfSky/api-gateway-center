package com.gaoyifeng.apigateway.center.infrastructure.commom;

/**
 * @author gaoyifeng
 * @Classname ResponseCode
 * @Description TODO
 * @Date 2024/11/19 21:23
 * @Created by gaoyifeng
 */
public enum ResponseCode {

    SUCCESS("0000", "成功"),
    UN_ERROR("0001", "未知失败"),
    ILLEGAL_PARAMETER("0002", "非法参数"),
    INDEX_DUP("0003", "主键冲突"),
    NO_UPDATE("0004", "SQL操作无更新");

    private String code;
    private String info;

    ResponseCode(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
