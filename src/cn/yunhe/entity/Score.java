package cn.yunhe.entity;

import java.math.BigDecimal;

public class Score {
	private double score_value;				//产生的分值
	private String score_contents;			//描述
	private String time;					//扣分时间
	private int score_type;					//积分类型
	
	private String stu_name;				//学员姓名（代表哪个学生的分数情况）
	
	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	public double getScore_value() {
		return score_value;
	}
	public void setScore_value(BigDecimal score_value) {
		this.score_value = score_value.doubleValue();
	}

	public String getScore_contents() {
		return score_contents;
	}
	public void setScore_contents(String score_contents) {
		this.score_contents = score_contents;
	}


	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	
	
	public int getScore_type() {
		return score_type;
	}
	public void setScore_type(int score_type) {
		this.score_type = score_type;
	}
	
	
}
