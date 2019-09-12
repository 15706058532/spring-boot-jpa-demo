package com.lzf.springbootjpademo.primary.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Entity
@Table(name = "bbs_order")
@NamedEntityGraph(name = "Order.orderDetails", attributeNodes = {@NamedAttributeNode("orderDetails")})
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 运费
     */
    @Column(name = "deliver_fee")
    private Double deliverFee;

    /**
     * 应付金额
     */
    @Column(name = "payable_fee")
    private Double payableFee;

    /**
     * 订单金额
     */
    @Column(name = "total_price")
    private Double totalPrice;

    /**
     * 支付方式 0:到付 1:在线 2:邮局 3:公司转帐
     */
    @Column(name = "payment_way")
    private Integer paymentWay;

    /**
     * 货到付款方式.1现金,2POS刷卡
     */
    @Column(name = "payment_cash")
    private Integer paymentCash;

    /**
     * 送货时间 0:只工作日送货（双休日，节假日不送） 1:只双休日，假日送货   2:工作日，双休日，假日均可送货
     */
    @Column(name = "delivery")
    private Integer delivery;

    /**
     * 是否电话确认 1:是  0: 否
     */
    @Column(name = "is_confirm")
    private Integer isConfirm;

    /**
     * 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败
     */
    @Column(name = "is_paiy")
    private Integer isPaiy;

    /**
     * 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货
     */
    @Column(name = "state")
    private Integer state;

    /**
     * 订单生成时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 发货时间
     */
    @Column(name = "deliver_goods_time")
    private Date deliverGoodsTime;

    /**
     * 预计送达时间
     */
    @Column(name = "expected_delivery_time")
    private Date expectedDeliveryTime;

    /**
     * 附言
     */
    @Column(name = "note")
    private String note;

    /**
     * 用户Id
     */
    @Column(name = "buyer_id")
    private Long buyerId;

    /**
     * 地址Id
     */
    @Column(name = "addr_id")
    private Long addrId;

    @OneToMany(targetEntity = OrderDetail.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", insertable = false, updatable = false, referencedColumnName = "id")
    private List<OrderDetail> orderDetails;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setDeliverFee(Double deliverFee) {
        this.deliverFee = deliverFee;
    }

    public Double getDeliverFee() {
        return deliverFee;
    }

    public void setPayableFee(Double payableFee) {
        this.payableFee = payableFee;
    }

    public Double getPayableFee() {
        return payableFee;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Integer getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentCash(Integer paymentCash) {
        this.paymentCash = paymentCash;
    }

    public Integer getPaymentCash() {
        return paymentCash;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setIsConfirm(Integer isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Integer getIsConfirm() {
        return isConfirm;
    }

    public void setIsPaiy(Integer isPaiy) {
        this.isPaiy = isPaiy;
    }

    public Integer getIsPaiy() {
        return isPaiy;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setDeliverGoodsTime(Date deliverGoodsTime) {
        this.deliverGoodsTime = deliverGoodsTime;
    }

    public Date getDeliverGoodsTime() {
        return deliverGoodsTime;
    }

    public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }

    public Date getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getNote() {
        return note;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    public Long getAddrId() {
        return addrId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", deliverFee=" + deliverFee +
                ", payableFee=" + payableFee +
                ", totalPrice=" + totalPrice +
                ", paymentWay=" + paymentWay +
                ", paymentCash=" + paymentCash +
                ", delivery=" + delivery +
                ", isConfirm=" + isConfirm +
                ", isPaiy=" + isPaiy +
                ", state=" + state +
                ", createTime=" + createTime +
                ", deliverGoodsTime=" + deliverGoodsTime +
                ", expectedDeliveryTime=" + expectedDeliveryTime +
                ", note='" + note + '\'' +
                ", buyerId=" + buyerId +
                ", addrId=" + addrId +
                "}";
    }
}