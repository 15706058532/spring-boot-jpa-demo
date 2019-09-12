package com.lzf.springbootjpademo.primary.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 写点注释
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Entity
@Table(name = "bbs_order_detail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 订单Id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 库存Id -->因为库存Id才能定位到一条具体的商品
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 商品Id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 商品编号
     */
    @Column(name = "product_no")
    private String productNo;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品价格
     */
    @Column(name = "product_price")
    private Double productPrice;

    /**
     * 商品颜色
     */
    @Column(name = "product_color")
    private String productColor;

    /**
     * 商品尺寸
     */
    @Column(name = "product_size")
    private String productSize;

    /**
     * 购买的数量
     */
    @Column(name = "num")
    private Integer num;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor == null ? null : productColor.trim();
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize == null ? null : productSize.trim();
    }

    public String getProductSize() {
        return productSize;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", skuId=" + skuId +
                ", productId=" + productId +
                ", productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productColor='" + productColor + '\'' +
                ", productSize='" + productSize + '\'' +
                ", num=" + num +
                ", createTime=" + createTime +
                "}";
    }
}