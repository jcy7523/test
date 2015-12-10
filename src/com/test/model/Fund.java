/**
 * 创建于:2015年8月5日 上午11:48:57
 * 所属项目:
 * 文件名称:Fund.java
 * 作者:jiangchunyan
 * 版权信息:
 */
package com.test.model;
public class Fund {
	/**
	 * 基金类型
	 */
	private String fundType;
	/**
	 * 基金代码
	 */
	private String fundCode;
	/**
	 * 基金名称
	 */
	private String fundName;
	/**
	 * 单位净值
	 */
	private String dwjz;
	/**
	 * 累计净值
	 */
	private String ljjz;
	/**
	 * 最近一天
	 */
	private String zjyt;
	/**
	 * 最近一年
	 */
	private String zjyn;
	/**
	 * 最近三年
	 */
	private String zjsn;
	/**
	 * 成立以来增长率
	 */
	private String clylZzlv;
	/**
	 * 状态
	 */
	private String zt;
	public String getFundType() {
		return fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getDwjz() {
		return dwjz;
	}
	public void setDwjz(String dwjz) {
		this.dwjz = dwjz;
	}
	public String getLjjz() {
		return ljjz;
	}
	public void setLjjz(String ljjz) {
		this.ljjz = ljjz;
	}
	public String getZjyt() {
		return zjyt;
	}
	public void setZjyt(String zjyt) {
		this.zjyt = zjyt;
	}
	public String getZjyn() {
		return zjyn;
	}
	public void setZjyn(String zjyn) {
		this.zjyn = zjyn;
	}
	public String getZjsn() {
		return zjsn;
	}
	public void setZjsn(String zjsn) {
		this.zjsn = zjsn;
	}
	public String getClylZzlv() {
		return clylZzlv;
	}
	public void setClylZzlv(String clylZzlv) {
		this.clylZzlv = clylZzlv;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	
	
}
