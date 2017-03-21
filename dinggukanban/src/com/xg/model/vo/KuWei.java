package com.xg.model.vo;

/**********
 * 
 * @author dd
 * @date 2017年3月13日
 **********/

public class KuWei {
	private String number;
	private String bianhao;
	private String lkbh;
	private String leixing;
	private String zhuangtai;
	private String bjbh;
	private Integer lsbh;
	public KuWei() {}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the bianhao
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * @param bianhao the bianhao to set
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * @return the lkbh
	 */
	public String getLkbh() {
		return lkbh;
	}
	/**
	 * @param lkbh the lkbh to set
	 */
	public void setLkbh(String lkbh) {
		this.lkbh = lkbh;
	}
	/**
	 * @return the leixing
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * @param leixing the leixing to set
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * @return the zhuangtai
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * @param zhuangtai the zhuangtai to set
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * @return the bjbh
	 */
	public String getBjbh() {
		return bjbh;
	}
	/**
	 * @param bjbh the bjbh to set
	 */
	public void setBjbh(String bjbh) {
		this.bjbh = bjbh;
	}
	/**
	 * @return the lsbh
	 */
	public Integer getLsbh() {
		return lsbh;
	}
	/**
	 * @param lsbh the lsbh to set
	 */
	public void setLsbh(Integer lsbh) {
		this.lsbh = lsbh;
	}
	@Override
	public String toString() {
		return "KuWei [number=" + number + ", bianhao=" + bianhao + ", lkbh=" + lkbh + ", leixing=" + leixing
				+ ", zhuangtai=" + zhuangtai + ", bjbh=" + bjbh + ", lsbh=" + lsbh + "]";
	}
	
	
}
