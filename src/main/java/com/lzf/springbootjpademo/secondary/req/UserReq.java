package com.lzf.springbootjpademo.secondary.req;

import java.io.Serializable;

/**
 * 写点注释
 * <br/>
 * Created in 2019-08-27 23:11:34
 * <br/>
 *
 * @author Zhenfeng Li
 */
public class UserReq implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * -
     */
    private String name;

    /**
     * -
     */
    private Integer age;

    /**
     * - 开始值
     */
    private Integer ageStart;

    /**
     * - 结束值
     */
    private Integer ageEnd;

    /**
     * -
     */
    private String password;

    /**
     * 当前页数
     */
    private Integer page;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 排序字段及规则
     */
    private Integer orderByClause;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAgeStart(Integer ageStart) {
        this.ageStart = ageStart;
    }

    public Integer getAgeStart() {
        return ageStart;
    }

    public void setAgeEnd(Integer ageEnd) {
        this.ageEnd = ageEnd;
    }

    public Integer getAgeEnd() {
        return ageEnd;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage() {
        return page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setOrderByClause(Integer orderByClause) {
        this.orderByClause = orderByClause;
    }

    public Integer getOrderByClause() {
        return orderByClause;
    }

    @Override
    public String toString() {
        return "UserReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", orderByClause=" + orderByClause +
                "}";
    }
}