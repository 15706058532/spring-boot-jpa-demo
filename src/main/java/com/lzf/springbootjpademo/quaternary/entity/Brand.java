package com.lzf.springbootjpademo.quaternary.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 品牌
 * <br/>
 * Created in 2019-09-01 11:11:56
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Entity
@Table(name = "bbs_brand", schema = "babasport")
public class Brand implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 图片URI
     */
    @Column(name = "img_uri")
    private String imgUri;

    /**
     * 品牌网址
     */
    @Column(name = "web_site")
    private String webSite;

    /**
     * 排序:最大最排前
     */
    @Column(name = "sort")
    private Integer sort;

    /**
     * 是否可见 1:可见 0:不可见
     */
    @Column(name = "is_display")
    private Integer isDisplay;

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

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri == null ? null : imgUri.trim();
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite == null ? null : webSite.trim();
    }

    public String getWebSite() {
        return webSite;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {
        return sort;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Integer getIsDisplay() {
        return isDisplay;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imgUri='" + imgUri + '\'' +
                ", webSite='" + webSite + '\'' +
                ", sort=" + sort +
                ", isDisplay=" + isDisplay +
                "}";
    }
}