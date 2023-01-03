package ks45team04.sos.admin.dto;

public class DailyRefund {
		private String drCode;
		private String drEndGroup;
		private String drTotalPayment;
		private String drRegDate;
		private String memId;
		private String mrEndGroup;
		private String drYearAndmonth;
	
		public String getDrCode() {
			return drCode;
		}
		public void setDrCode(String drCode) {
			this.drCode = drCode;
		}
		public String getDrEndGroup() {
			return drEndGroup;
		}
		public void setDrEndGroup(String drEndGroup) {
			this.drEndGroup = drEndGroup;
		}
		public String getDrTotalPayment() {
			return drTotalPayment;
		}
		public void setDrTotalPayment(String drTotalPayment) {
			this.drTotalPayment = drTotalPayment;
		}
		public String getDrRegDate() {
			return drRegDate;
		}
		public void setDrRegDate(String drRegDate) {
			this.drRegDate = drRegDate;
		}
		public String getMemId() {
			return memId;
		}
		public void setMemId(String memId) {
			this.memId = memId;
		}
		public String getMrEndGroup() {
			return mrEndGroup;
		}
		public void setMrEndGroup(String mrEndGroup) {
			this.mrEndGroup = mrEndGroup;
		}
		public String getDrYearAndmonth() {
			return drYearAndmonth;
		}
		public void setDrYearAndmonth(String drYearAndmonth) {
			this.drYearAndmonth = drYearAndmonth;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("DailyRefund [drCode=");
			builder.append(drCode);
			builder.append(", drEndGroup=");
			builder.append(drEndGroup);
			builder.append(", drTotalPayment=");
			builder.append(drTotalPayment);
			builder.append(", drRegDate=");
			builder.append(drRegDate);
			builder.append(", memId=");
			builder.append(memId);
			builder.append(", mrEndGroup=");
			builder.append(mrEndGroup);
			builder.append(", drYearAndmonth=");
			builder.append(drYearAndmonth);
			builder.append("]");
			return builder.toString();
		}
		
}
