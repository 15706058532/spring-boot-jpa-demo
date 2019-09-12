package com.lzf.springbootjpademo.primary.resp;

import com.fasterxml.jackson.annotation.JsonInclude;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDetailResp implements Serializable {
	private static final long serialVersionUID = 1L;



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
	 * 商品颜色 
	 */
	private String productColor;




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

}