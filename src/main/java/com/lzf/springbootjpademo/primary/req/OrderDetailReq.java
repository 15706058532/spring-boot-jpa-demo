package com.lzf.springbootjpademo.primary.req;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.io.Serializable;
/**
 * 写点注释
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
public class OrderDetailReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键Id 
	 */
	private Long id;

	/**
	 * 订单Id 
	 */
	private Long orderId;

	/**
	 * 订单Id 开始值
	 */
	private Long orderIdStart;

	/**
	 * 订单Id 结束值
	 */
	private Long orderIdEnd;

	/**
	 * 库存Id -->因为库存Id才能定位到一条具体的商品 
	 */
	private Long skuId;

	/**
	 * 库存Id -->因为库存Id才能定位到一条具体的商品 开始值
	 */
	private Long skuIdStart;

	/**
	 * 库存Id -->因为库存Id才能定位到一条具体的商品 结束值
	 */
	private Long skuIdEnd;

	/**
	 * 商品Id 
	 */
	private Long productId;

	/**
	 * 商品Id 开始值
	 */
	private Long productIdStart;

	/**
	 * 商品Id 结束值
	 */
	private Long productIdEnd;

	/**
	 * 商品编号 
	 */
	private String productNo;

	/**
	 * 商品名称 
	 */
	private String productName;

	/**
	 * 商品价格 
	 */
	private Double productPrice;

	/**
	 * 商品价格 开始值
	 */
	private Double productPriceStart;

	/**
	 * 商品价格 结束值
	 */
	private Double productPriceEnd;

	/**
	 * 商品颜色 
	 */
	private String productColor;

	/**
	 * 商品尺寸 
	 */
	private String productSize;

	/**
	 * 购买的数量 
	 */
	private Integer num;

	/**
	 * 购买的数量 开始值
	 */
	private Integer numStart;

	/**
	 * 购买的数量 结束值
	 */
	private Integer numEnd;

	/**
	 * 创建时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTime;

	/**
	 * 创建时间 开始值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTimeStart;

	/**
	 * 创建时间 结束值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTimeEnd;

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

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderIdStart(Long orderIdStart) {
		this.orderIdStart = orderIdStart;
	}

	public Long getOrderIdStart() {
		return orderIdStart;
	}

	public void setOrderIdEnd(Long orderIdEnd) {
		this.orderIdEnd = orderIdEnd;
	}

	public Long getOrderIdEnd() {
		return orderIdEnd;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuIdStart(Long skuIdStart) {
		this.skuIdStart = skuIdStart;
	}

	public Long getSkuIdStart() {
		return skuIdStart;
	}

	public void setSkuIdEnd(Long skuIdEnd) {
		this.skuIdEnd = skuIdEnd;
	}

	public Long getSkuIdEnd() {
		return skuIdEnd;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductIdStart(Long productIdStart) {
		this.productIdStart = productIdStart;
	}

	public Long getProductIdStart() {
		return productIdStart;
	}

	public void setProductIdEnd(Long productIdEnd) {
		this.productIdEnd = productIdEnd;
	}

	public Long getProductIdEnd() {
		return productIdEnd;
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

	public void setProductPriceStart(Double productPriceStart) {
		this.productPriceStart = productPriceStart;
	}

	public Double getProductPriceStart() {
		return productPriceStart;
	}

	public void setProductPriceEnd(Double productPriceEnd) {
		this.productPriceEnd = productPriceEnd;
	}

	public Double getProductPriceEnd() {
		return productPriceEnd;
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

	public void setNumStart(Integer numStart) {
		this.numStart = numStart;
	}

	public Integer getNumStart() {
		return numStart;
	}

	public void setNumEnd(Integer numEnd) {
		this.numEnd = numEnd;
	}

	public Integer getNumEnd() {
		return numEnd;
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
		return "OrderDetailReq{" +
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
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}