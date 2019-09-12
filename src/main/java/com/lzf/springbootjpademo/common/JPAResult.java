package com.lzf.springbootjpademo.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * json返回工具类
 * Created in 2018-04-13 14:11
 *
 * @author Li Zhenfeng
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JPAResult implements Serializable {

    /**
     * 定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final long serialVersionUID = -2492072809889519824L;

    /**
     * 响应状态
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应数据
     */
    private Object data;

    public static JPAResult build(Integer code, String msg, Object data) {
        return new JPAResult(code, msg, data);
    }

    public static JPAResult ok(Object data) {
        return new JPAResult(data);
    }

    public static JPAResult ok() {
        return new JPAResult(null);
    }

    public JPAResult() {

    }

    public static JPAResult build(Integer code, String msg) {
        return new JPAResult(code, msg, null);
    }

    public JPAResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JPAResult(Object data) {
        this.code = 200;
        this.msg = "成功";
        this.data = data;
    }

    public Boolean isOK() {
        return Objects.equals(this.code, 200);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为E3Result对象
     *
     * @param jsonData json数据
     * @param clazz    E3Result中的object类型
     * @return
     */
    public static JPAResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, JPAResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isObject()) {
                obj = MAPPER.readValue(data.traverse(), clazz);
            } else if (data.isTextual()) {
                obj = MAPPER.readValue(data.asText(), clazz);
            }
            return build(jsonNode.get("code").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static JPAResult format(String json) {
        try {
            return MAPPER.readValue(json, JPAResult.class);
        } catch (Exception ignored) {
        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz    集合中的类型
     * @return
     */
    public static JPAResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("code").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
}
