package cn.yunhe.entity;

public class Record {
	
	private String date;
	private String stu_name;
	private String start_time;
	private String end_time;
	private int status;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Record [date=" + date + ", stu_name=" + stu_name
				+ ", start_time=" + start_time + ", end_time=" + end_time
				+ ", status=" + status + "]";
	}
	public Record(){}
	public Record(String date, String stu_name, String start_time,
			String end_time, int status) {
		super();
		this.date = date;
		this.stu_name = stu_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.status = status;
	}
	
	
	
	
	
	
	
	
}
