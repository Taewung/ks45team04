package ks45team04.sos.admin.dto;

public class MonthlySalesAndRefund {
		private String msarCode;
		private String msarEndGroup;
		private String msarTotalPayment;
		private String salesOrRefund;
		private String msarYearAndMonth;
		private String msarRegDate;
		private String memrId;
		public String getMsarCode() {
			return msarCode;
		}
		public void setMsarCode(String msarCode) {
			this.msarCode = msarCode;
		}
		public String getMsarEndGroup() {
			return msarEndGroup;
		}
		public void setMsarEndGroup(String msarEndGroup) {
			this.msarEndGroup = msarEndGroup;
		}
		public String getMsarTotalPayment() {
			return msarTotalPayment;
		}
		public void setMsarTotalPayment(String msarTotalPayment) {
			this.msarTotalPayment = msarTotalPayment;
		}
		public String getSalesOrRefund() {
			return salesOrRefund;
		}
		public void setSalesOrRefund(String salesOrRefund) {
			this.salesOrRefund = salesOrRefund;
		}
		public String getMsarYearAndMonth() {
			return msarYearAndMonth;
		}
		public void setMsarYearAndMonth(String msarYearAndMonth) {
			this.msarYearAndMonth = msarYearAndMonth;
		}
		public String getMsarRegDate() {
			return msarRegDate;
		}
		public void setMsarRegDate(String msarRegDate) {
			this.msarRegDate = msarRegDate;
		}
		public String getMemrId() {
			return memrId;
		}
		public void setMemrId(String memrId) {
			this.memrId = memrId;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("MonthlySalesAndRefund [msarCode=");
			builder.append(msarCode);
			builder.append(", msarEndGroup=");
			builder.append(msarEndGroup);
			builder.append(", msarTotalPayment=");
			builder.append(msarTotalPayment);
			builder.append(", salesOrRefund=");
			builder.append(salesOrRefund);
			builder.append(", msarYearAndMonth=");
			builder.append(msarYearAndMonth);
			builder.append(", msarRegDate=");
			builder.append(msarRegDate);
			builder.append(", memrId=");
			builder.append(memrId);
			builder.append("]");
			return builder.toString();
		}
		
}
