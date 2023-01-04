package ks45team04.sos.admin.dto;

public class PointRefundApproval {
	private String pointRefundCode;
	private String pointRefundId;
	private int refundRequestPoint;
	private String pointRefundFeeRateCode;
	private int pointRefundFee;
	private int refundPoint;
	private String refundBank;
	private String refundAccountNumber;
	private String refundName;
	private String refundReuquestDatetime;
	private String refundState;
	private String pointRefundApprovalId;
	private String refundApprovalDatetime;
	
	public String getPointRefundCode() {
		return pointRefundCode;
	}
	public void setPointRefundCode(String pointRefundCode) {
		this.pointRefundCode = pointRefundCode;
	}
	public String getPointRefundId() {
		return pointRefundId;
	}
	public void setPointRefundId(String pointRefundId) {
		this.pointRefundId = pointRefundId;
	}
	public int getRefundRequestPoint() {
		return refundRequestPoint;
	}
	public void setRefundRequestPoint(int refundRequestPoint) {
		this.refundRequestPoint = refundRequestPoint;
	}
	public String getPointRefundFeeRateCode() {
		return pointRefundFeeRateCode;
	}
	public void setPointRefundFeeRateCode(String pointRefundFeeRateCode) {
		this.pointRefundFeeRateCode = pointRefundFeeRateCode;
	}
	public int getPointRefundFee() {
		return pointRefundFee;
	}
	public void setPointRefundFee(int pointRefundFee) {
		this.pointRefundFee = pointRefundFee;
	}
	public int getRefundPoint() {
		return refundPoint;
	}
	public void setRefundPoint(int refundPoint) {
		this.refundPoint = refundPoint;
	}
	public String getRefundBank() {
		return refundBank;
	}
	public void setRefundBank(String refundBank) {
		this.refundBank = refundBank;
	}
	public String getRefundAccountNumber() {
		return refundAccountNumber;
	}
	public void setRefundAccountNumber(String refundAccountNumber) {
		this.refundAccountNumber = refundAccountNumber;
	}
	public String getRefundName() {
		return refundName;
	}
	public void setRefundName(String refundName) {
		this.refundName = refundName;
	}
	public String getRefundReuquestDatetime() {
		return refundReuquestDatetime;
	}
	public void setRefundReuquestDatetime(String refundReuquestDatetime) {
		this.refundReuquestDatetime = refundReuquestDatetime;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public String getPointRefundApprovalId() {
		return pointRefundApprovalId;
	}
	public void setPointRefundApprovalId(String pointRefundApprovalId) {
		this.pointRefundApprovalId = pointRefundApprovalId;
	}
	public String getRefundApprovalDatetime() {
		return refundApprovalDatetime;
	}
	public void setRefundApprovalDatetime(String refundApprovalDatetime) {
		this.refundApprovalDatetime = refundApprovalDatetime;
	}
	@Override
	public String toString() {
		return "PointRefund [pointRefundCode=" + pointRefundCode + ", pointRefundId=" + pointRefundId
				+ ", refundRequestPoint=" + refundRequestPoint + ", pointRefundFeeRateCode=" + pointRefundFeeRateCode
				+ ", pointRefundFee=" + pointRefundFee + ", refundPoint=" + refundPoint + ", refundBank=" + refundBank
				+ ", refundAccountNumber=" + refundAccountNumber + ", refundName=" + refundName
				+ ", refundReuquestDatetime=" + refundReuquestDatetime + ", refundState=" + refundState
				+ ", pointRefundApprovalId=" + pointRefundApprovalId + ", refundApprovalDatetime="
				+ refundApprovalDatetime + "]";
	}
}
