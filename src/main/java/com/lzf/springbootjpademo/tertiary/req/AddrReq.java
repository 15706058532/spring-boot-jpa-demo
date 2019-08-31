package com.lzf.springbootjpademo.tertiary.req;

import java.io.Serializable;
/**
 * 收货地址
 * <br/>
 * Created in 2019-08-31 15:03:40
 * <br/>
 *
 * @author Zhenfeng Li
 */
public class AddrReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * z主键 
	 */
	private Long id;

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
	 * 收货人 
	 */
	private String name;

	/**
	 * 手机号或是固定电话号 
	 */
	private String phone;

	/**
	 * 省编码 
	 */
	private String provinceCode;

	/**
	 * 省名称 
	 */
	private String provinceName;

	/**
	 * 市编码 
	 */
	private String cityCode;

	/**
	 * 市名称 
	 */
	private String cityName;

	/**
	 * 县编码 
	 */
	private String townCode;

	/**
	 * 县名称 
	 */
	private String townName;

	/**
	 * 收货地址 
	 */
	private String addr;

	/**
	 * 是否默认 
	 */
	private Long isDef;

	/**
	 * 是否默认 开始值
	 */
	private Long isDefStart;

	/**
	 * 是否默认 结束值
	 */
	private Long isDefEnd;

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

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode == null ? null : provinceCode.trim();
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName == null ? null : provinceName.trim();
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}

	public String getCityName() {
		return cityName;
	}

	public void setTownCode(String townCode) {
		this.townCode = townCode == null ? null : townCode.trim();
	}

	public String getTownCode() {
		return townCode;
	}

	public void setTownName(String townName) {
		this.townName = townName == null ? null : townName.trim();
	}

	public String getTownName() {
		return townName;
	}

	public void setAddr(String addr) {
		this.addr = addr == null ? null : addr.trim();
	}

	public String getAddr() {
		return addr;
	}

	public void setIsDef(Long isDef) {
		this.isDef = isDef;
	}

	public Long getIsDef() {
		return isDef;
	}

	public void setIsDefStart(Long isDefStart) {
		this.isDefStart = isDefStart;
	}

	public Long getIsDefStart() {
		return isDefStart;
	}

	public void setIsDefEnd(Long isDefEnd) {
		this.isDefEnd = isDefEnd;
	}

	public Long getIsDefEnd() {
		return isDefEnd;
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
		return "AddrReq{" +
				"id=" + id +
				", buyerId=" + buyerId +
				", name='" + name + '\'' +
				", phone='" + phone + '\'' +
				", provinceCode='" + provinceCode + '\'' +
				", provinceName='" + provinceName + '\'' +
				", cityCode='" + cityCode + '\'' +
				", cityName='" + cityName + '\'' +
				", townCode='" + townCode + '\'' +
				", townName='" + townName + '\'' +
				", addr='" + addr + '\'' +
				", isDef=" + isDef +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}