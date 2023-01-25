package ks45team04.sos.member.dto;

public class MPointFeeRate {
	
	private String pointFeeRateCode;
	private int pointFeeRate;
	private String pointFeeRateContents;
	private String pointFeeRateId;
	private String pointFeeRateDatetime;
	public String getPointFeeRateCode() {
		return pointFeeRateCode;
	}
	public void setPointFeeRateCode(String pointFeeRateCode) {
		this.pointFeeRateCode = pointFeeRateCode;
	}
	public int getPointFeeRate() {
		return pointFeeRate;
	}
	public void setPointFeeRate(int pointFeeRate) {
		this.pointFeeRate = pointFeeRate;
	}
	public String getPointFeeRateContents() {
		return pointFeeRateContents;
	}
	public void setPointFeeRateContents(String pointFeeRateContents) {
		this.pointFeeRateContents = pointFeeRateContents;
	}
	public String getPointFeeRateId() {
		return pointFeeRateId;
	}
	public void setPointFeeRateId(String pointFeeRateId) {
		this.pointFeeRateId = pointFeeRateId;
	}
	public String getPointFeeRateDatetime() {
		return pointFeeRateDatetime;
	}
	public void setPointFeeRateDatetime(String pointFeeRateDatetime) {
		this.pointFeeRateDatetime = pointFeeRateDatetime;
	}
	@Override
	public String toString() {
		return "MPointFeeRate [pointFeeRateCode=" + pointFeeRateCode + ", pointFeeRate=" + pointFeeRate
				+ ", pointFeeRateContents=" + pointFeeRateContents + ", pointFeeRateId=" + pointFeeRateId
				+ ", pointFeeRateDatetime=" + pointFeeRateDatetime + "]";
	}
	
	
	
}
