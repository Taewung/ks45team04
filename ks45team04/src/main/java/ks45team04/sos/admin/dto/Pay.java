package ks45team04.sos.admin.dto;

public class Pay {
	private String payId;
	private String payCompleteCode;
	private String goodsName;
	private int totalPayPrice;
	private int payUsePoint;
	private int finalPayPrice;
	private String payCompleteDatetime;
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getPayCompleteCode() {
		return payCompleteCode;
	}
	public void setPayCompleteCode(String payCompleteCode) {
		this.payCompleteCode = payCompleteCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getTotalPayPrice() {
		return totalPayPrice;
	}
	public void setTotalPayPrice(int totalPayPrice) {
		this.totalPayPrice = totalPayPrice;
	}
	public int getPayUsePoint() {
		return payUsePoint;
	}
	public void setPayUsePoint(int payUsePoint) {
		this.payUsePoint = payUsePoint;
	}
	public int getFinalPayPrice() {
		return finalPayPrice;
	}
	public void setFinalPayPrice(int finalPayPrice) {
		this.finalPayPrice = finalPayPrice;
	}
	public String getPayCompleteDatetime() {
		return payCompleteDatetime;
	}
	public void setPayCompleteDatetime(String payCompleteDatetime) {
		this.payCompleteDatetime = payCompleteDatetime;
	}
	@Override
	public String toString() {
		return "Pay [payId=" + payId + ", payCompleteCode=" + payCompleteCode + ", goodsName=" + goodsName
				+ ", totalPayPrice=" + totalPayPrice + ", payUsePoint=" + payUsePoint + ", finalPayPrice="
				+ finalPayPrice + ", payCompleteDatetime=" + payCompleteDatetime + "]";
	}
	


}
