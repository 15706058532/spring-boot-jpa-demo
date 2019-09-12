package com.lzf.springbootjpademo.primary.req;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.io.Serializable;
/**
 * 订单
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
public class OrderReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 订单号 
	 */
	private String orderNo;

	/**
	 * 运费 
	 */
	private Double deliverFee;

	/**
	 * 运费 开始值
	 */
	private Double deliverFeeStart;

	/**
	 * 运费 结束值
	 */
	private Double deliverFeeEnd;

	/**
	 * 应付金额 
	 */
	private Double payableFee;

	/**
	 * 应付金额 开始值
	 */
	private Double payableFeeStart;

	/**
	 * 应付金额 结束值
	 */
	private Double payableFeeEnd;

	/**
	 * 订单金额 
	 */
	private Double totalPrice;

	/**
	 * 订单金额 开始值
	 */
	private Double totalPriceStart;

	/**
	 * 订单金额 结束值
	 */
	private Double totalPriceEnd;

	/**
	 * 支付方式 0:到付 1:在线 2:邮局 3:公司转帐 
	 */
	private Integer paymentWay;

	/**
	 * 支付方式 0:到付 1:在线 2:邮局 3:公司转帐 开始值
	 */
	private Integer paymentWayStart;

	/**
	 * 支付方式 0:到付 1:在线 2:邮局 3:公司转帐 结束值
	 */
	private Integer paymentWayEnd;

	/**
	 * 货到付款方式.1现金,2POS刷卡 
	 */
	private Integer paymentCash;

	/**
	 * 货到付款方式.1现金,2POS刷卡 开始值
	 */
	private Integer paymentCashStart;

	/**
	 * 货到付款方式.1现金,2POS刷卡 结束值
	 */
	private Integer paymentCashEnd;

	/**
	 * 送货时间 0:只工作日送货（双休日，节假日不送） 1:只双休日，假日送货   2:工作日，双休日，假日均可送货 
	 */
	private Integer delivery;

	/**
	 * 送货时间 0:只工作日送货（双休日，节假日不送） 1:只双休日，假日送货   2:工作日，双休日，假日均可送货 开始值
	 */
	private Integer deliveryStart;

	/**
	 * 送货时间 0:只工作日送货（双休日，节假日不送） 1:只双休日，假日送货   2:工作日，双休日，假日均可送货 结束值
	 */
	private Integer deliveryEnd;

	/**
	 * 是否电话确认 1:是  0: 否 
	 */
	private Integer isConfirm;

	/**
	 * 是否电话确认 1:是  0: 否 开始值
	 */
	private Integer isConfirmStart;

	/**
	 * 是否电话确认 1:是  0: 否 结束值
	 */
	private Integer isConfirmEnd;

	/**
	 * 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败 
	 */
	private Integer isPaiy;

	/**
	 * 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败 开始值
	 */
	private Integer isPaiyStart;

	/**
	 * 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败 结束值
	 */
	private Integer isPaiyEnd;

	/**
	 * 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货 
	 */
	private Integer state;

	/**
	 * 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货 开始值
	 */
	private Integer stateStart;

	/**
	 * 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货 结束值
	 */
	private Integer stateEnd;

	/**
	 * 订单生成时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTime;

	/**
	 * 订单生成时间 开始值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTimeStart;

	/**
	 * 订单生成时间 结束值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTimeEnd;

	/**
	 * 发货时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date deliverGoodsTime;

	/**
	 * 发货时间 开始值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date deliverGoodsTimeStart;

	/**
	 * 发货时间 结束值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date deliverGoodsTimeEnd;

	/**
	 * 预计送达时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date expectedDeliveryTime;

	/**
	 * 预计送达时间 开始值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date expectedDeliveryTimeStart;

	/**
	 * 预计送达时间 结束值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date expectedDeliveryTimeEnd;

	/**
	 * 附言 
	 */
	private String note;

	/**
	 * 用户Id 
	 */
	private Long buyerId;

	/**
	 * 用户Id 开始值
	 */
	private Long buyerIdStart;

	/**
	 * 用户Id 结束值
	 */
	private Long buyerIdEnd;

	/**
	 * 地址Id 
	 */
	private Long addrId;

	/**
	 * 地址Id 开始值
	 */
	private Long addrIdStart;

	/**
	 * 地址Id 结束值
	 */
	private Long addrIdEnd;

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

	public void setDeliverFeeStart(Double deliverFeeStart) {
		this.deliverFeeStart = deliverFeeStart;
	}

	public Double getDeliverFeeStart() {
		return deliverFeeStart;
	}

	public void setDeliverFeeEnd(Double deliverFeeEnd) {
		this.deliverFeeEnd = deliverFeeEnd;
	}

	public Double getDeliverFeeEnd() {
		return deliverFeeEnd;
	}

	public void setPayableFee(Double payableFee) {
		this.payableFee = payableFee;
	}

	public Double getPayableFee() {
		return payableFee;
	}

	public void setPayableFeeStart(Double payableFeeStart) {
		this.payableFeeStart = payableFeeStart;
	}

	public Double getPayableFeeStart() {
		return payableFeeStart;
	}

	public void setPayableFeeEnd(Double payableFeeEnd) {
		this.payableFeeEnd = payableFeeEnd;
	}

	public Double getPayableFeeEnd() {
		return payableFeeEnd;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPriceStart(Double totalPriceStart) {
		this.totalPriceStart = totalPriceStart;
	}

	public Double getTotalPriceStart() {
		return totalPriceStart;
	}

	public void setTotalPriceEnd(Double totalPriceEnd) {
		this.totalPriceEnd = totalPriceEnd;
	}

	public Double getTotalPriceEnd() {
		return totalPriceEnd;
	}

	public void setPaymentWay(Integer paymentWay) {
		this.paymentWay = paymentWay;
	}

	public Integer getPaymentWay() {
		return paymentWay;
	}

	public void setPaymentWayStart(Integer paymentWayStart) {
		this.paymentWayStart = paymentWayStart;
	}

	public Integer getPaymentWayStart() {
		return paymentWayStart;
	}

	public void setPaymentWayEnd(Integer paymentWayEnd) {
		this.paymentWayEnd = paymentWayEnd;
	}

	public Integer getPaymentWayEnd() {
		return paymentWayEnd;
	}

	public void setPaymentCash(Integer paymentCash) {
		this.paymentCash = paymentCash;
	}

	public Integer getPaymentCash() {
		return paymentCash;
	}

	public void setPaymentCashStart(Integer paymentCashStart) {
		this.paymentCashStart = paymentCashStart;
	}

	public Integer getPaymentCashStart() {
		return paymentCashStart;
	}

	public void setPaymentCashEnd(Integer paymentCashEnd) {
		this.paymentCashEnd = paymentCashEnd;
	}

	public Integer getPaymentCashEnd() {
		return paymentCashEnd;
	}

	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}

	public Integer getDelivery() {
		return delivery;
	}

	public void setDeliveryStart(Integer deliveryStart) {
		this.deliveryStart = deliveryStart;
	}

	public Integer getDeliveryStart() {
		return deliveryStart;
	}

	public void setDeliveryEnd(Integer deliveryEnd) {
		this.deliveryEnd = deliveryEnd;
	}

	public Integer getDeliveryEnd() {
		return deliveryEnd;
	}

	public void setIsConfirm(Integer isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Integer getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirmStart(Integer isConfirmStart) {
		this.isConfirmStart = isConfirmStart;
	}

	public Integer getIsConfirmStart() {
		return isConfirmStart;
	}

	public void setIsConfirmEnd(Integer isConfirmEnd) {
		this.isConfirmEnd = isConfirmEnd;
	}

	public Integer getIsConfirmEnd() {
		return isConfirmEnd;
	}

	public void setIsPaiy(Integer isPaiy) {
		this.isPaiy = isPaiy;
	}

	public Integer getIsPaiy() {
		return isPaiy;
	}

	public void setIsPaiyStart(Integer isPaiyStart) {
		this.isPaiyStart = isPaiyStart;
	}

	public Integer getIsPaiyStart() {
		return isPaiyStart;
	}

	public void setIsPaiyEnd(Integer isPaiyEnd) {
		this.isPaiyEnd = isPaiyEnd;
	}

	public Integer getIsPaiyEnd() {
		return isPaiyEnd;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return state;
	}

	public void setStateStart(Integer stateStart) {
		this.stateStart = stateStart;
	}

	public Integer getStateStart() {
		return stateStart;
	}

	public void setStateEnd(Integer stateEnd) {
		this.stateEnd = stateEnd;
	}

	public Integer getStateEnd() {
		return stateEnd;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setDeliverGoodsTime(Date deliverGoodsTime) {
		this.deliverGoodsTime = deliverGoodsTime;
	}

	public Date getDeliverGoodsTime() {
		return deliverGoodsTime;
	}

	public void setDeliverGoodsTimeStart(Date deliverGoodsTimeStart) {
		this.deliverGoodsTimeStart = deliverGoodsTimeStart;
	}

	public Date getDeliverGoodsTimeStart() {
		return deliverGoodsTimeStart;
	}

	public void setDeliverGoodsTimeEnd(Date deliverGoodsTimeEnd) {
		this.deliverGoodsTimeEnd = deliverGoodsTimeEnd;
	}

	public Date getDeliverGoodsTimeEnd() {
		return deliverGoodsTimeEnd;
	}

	public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}

	public Date getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}

	public void setExpectedDeliveryTimeStart(Date expectedDeliveryTimeStart) {
		this.expectedDeliveryTimeStart = expectedDeliveryTimeStart;
	}

	public Date getExpectedDeliveryTimeStart() {
		return expectedDeliveryTimeStart;
	}

	public void setExpectedDeliveryTimeEnd(Date expectedDeliveryTimeEnd) {
		this.expectedDeliveryTimeEnd = expectedDeliveryTimeEnd;
	}

	public Date getExpectedDeliveryTimeEnd() {
		return expectedDeliveryTimeEnd;
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

	public void setBuyerIdStart(Long buyerIdStart) {
		this.buyerIdStart = buyerIdStart;
	}

	public Long getBuyerIdStart() {
		return buyerIdStart;
	}

	public void setBuyerIdEnd(Long buyerIdEnd) {
		this.buyerIdEnd = buyerIdEnd;
	}

	public Long getBuyerIdEnd() {
		return buyerIdEnd;
	}

	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}

	public Long getAddrId() {
		return addrId;
	}

	public void setAddrIdStart(Long addrIdStart) {
		this.addrIdStart = addrIdStart;
	}

	public Long getAddrIdStart() {
		return addrIdStart;
	}

	public void setAddrIdEnd(Long addrIdEnd) {
		this.addrIdEnd = addrIdEnd;
	}

	public Long getAddrIdEnd() {
		return addrIdEnd;
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
		return "OrderReq{" +
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
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}