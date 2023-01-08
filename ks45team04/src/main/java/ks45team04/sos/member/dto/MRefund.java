package ks45team04.sos.member.dto;

public class MRefund {
	private String refundCode;
	private String payCompleteCode;
	private String payId;
	private String refundReason;
	private int finalPayPrice;
	private int refundPrice;
	private int refundPoint;
	private String refundState;
	private String refundDatetime;
	private String refundApprovalId;
	
	public String getRefundCode() {
		return refundCode;
	}
	public void setRefundCode(String refundCode) {
		this.refundCode = refundCode;
	}
	public String getPayCompleteCode() {
		return payCompleteCode;
	}
	public void setPayCompleteCode(String payCompleteCode) {
		this.payCompleteCode = payCompleteCode;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getRefundReason() {
		return refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public int getFinalPayPrice() {
		return finalPayPrice;
	}
	public void setFinalPayPrice(int finalPayPrice) {
		this.finalPayPrice = finalPayPrice;
	}
	public int getRefundPrice() {
		return refundPrice;
	}
	public void setRefundPrice(int refundPrice) {
		this.refundPrice = refundPrice;
	}
	public int getRefundPoint() {
		return refundPoint;
	}
	public void setRefundPoint(int refundPoint) {
		this.refundPoint = refundPoint;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public String getRefundDatetime() {
		return refundDatetime;
	}
	public void setRefundDatetime(String refundDatetime) {
		this.refundDatetime = refundDatetime;
	}
	public String getRefundApprovalId() {
		return refundApprovalId;
	}
	public void setRefundApprovalId(String refundApprovalId) {
		this.refundApprovalId = refundApprovalId;
	}
	@Override
	public String toString() {
		return "MRefund [refundCode=" + refundCode + ", payCompleteCode=" + payCompleteCode + ", payId=" + payId
				+ ", refundReason=" + refundReason + ", finalPayPrice=" + finalPayPrice + ", refundPrice=" + refundPrice
				+ ", refundPoint=" + refundPoint + ", refundState=" + refundState + ", refundDatetime=" + refundDatetime
				+ ", refundApprovalId=" + refundApprovalId + "]";
	}
	
}
