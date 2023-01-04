package ks45team04.sos.member.dto;

public class ToDoList {
	 private String toDoListCode;
	 private String memId;
	 private String liCode;
	 private String lsCode;
	 private String toDoListTitle;
	 private String toDoListDay;
	 private String toDoListRegTime;
	 private String toDayStudyTime;
	 
	public String getToDoListCode() {
		return toDoListCode;
	}
	public void setToDoListCode(String toDoListCode) {
		this.toDoListCode = toDoListCode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getLiCode() {
		return liCode;
	}
	public void setLiCode(String liCode) {
		this.liCode = liCode;
	}
	public String getLsCode() {
		return lsCode;
	}
	public void setLsCode(String lsCode) {
		this.lsCode = lsCode;
	}
	public String getToDoListTitle() {
		return toDoListTitle;
	}
	public void setToDoListTitle(String toDoListTitle) {
		this.toDoListTitle = toDoListTitle;
	}
	public String getToDoListDay() {
		return toDoListDay;
	}
	public void setToDoListDay(String toDoListDay) {
		this.toDoListDay = toDoListDay;
	}
	public String getToDoListRegTime() {
		return toDoListRegTime;
	}
	public void setToDoListRegTime(String toDoListRegTime) {
		this.toDoListRegTime = toDoListRegTime;
	}
	public String getToDayStudyTime() {
		return toDayStudyTime;
	}
	public void setToDayStudyTime(String toDayStudyTime) {
		this.toDayStudyTime = toDayStudyTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ToDoList [toDoListCode=");
		builder.append(toDoListCode);
		builder.append(", memId=");
		builder.append(memId);
		builder.append(", liCode=");
		builder.append(liCode);
		builder.append(", lsCode=");
		builder.append(lsCode);
		builder.append(", toDoListTitle=");
		builder.append(toDoListTitle);
		builder.append(", toDoListDay=");
		builder.append(toDoListDay);
		builder.append(", toDoListRegTime=");
		builder.append(toDoListRegTime);
		builder.append(", toDayStudyTime=");
		builder.append(toDayStudyTime);
		builder.append("]");
		return builder.toString();
	}
	
	 
}
