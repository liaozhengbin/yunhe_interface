package cn.yunhe.entity;

public class Student {
	
		
		private int stu_id; //ID
		private String stu_no;//学号
		private String stu_name;//姓名
		private String stu_img;	//头像
		private String stu_sex;	//性别
		private String stu_profession;//专业
		private String stu_icno;//身份证
		private String stu_phone;//手机号码
		private String stu_birth;//生日
		private String stu_qq;//QQ
		private String class_name;//所属班级名称
		
		private double score_jishu;//技术分
		private double score_jilv;//纪律分
		private double score_zhiye;//职业技能分
		private double score_zonghe;//综合分
		public int getStu_id() {
			return stu_id;
		}
		public void setStu_id(int stu_id) {
			this.stu_id = stu_id;
		}
		public String getStu_no() {
			return stu_no;
		}
		public void setStu_no(String stu_no) {
			this.stu_no = stu_no;
		}
		public String getStu_name() {
			return stu_name;
		}
		public void setStu_name(String stu_name) {
			this.stu_name = stu_name;
		}
		public String getStu_img() {
			return stu_img;
		}
		public void setStu_img(String stu_img) {
			this.stu_img = stu_img;
		}
		public String getStu_sex() {
			return stu_sex;
		}
		public void setStu_sex(String stu_sex) {
			this.stu_sex = stu_sex;
		}
		public String getStu_profession() {
			return stu_profession;
		}
		public void setStu_profession(String stu_profession) {
			this.stu_profession = stu_profession;
		}
		public String getStu_icno() {
			return stu_icno;
		}
		public void setStu_icno(String stu_icno) {
			this.stu_icno = stu_icno;
		}
		public String getStu_phone() {
			return stu_phone;
		}
		public void setStu_phone(String stu_phone) {
			this.stu_phone = stu_phone;
		}
		public String getStu_birth() {
			return stu_birth;
		}
		public void setStu_birth(String stu_birth) {
			this.stu_birth = stu_birth;
		}
		public String getStu_qq() {
			return stu_qq;
		}
		public void setStu_qq(String stu_qq) {
			this.stu_qq = stu_qq;
		}
		public String getClass_name() {
			return class_name;
		}
		public void setClass_name(String class_name) {
			this.class_name = class_name;
		}
		public double getScore_jishu() {
			return score_jishu;
		}
		public void setScore_jishu(double score_jishu) {
			this.score_jishu = score_jishu;
		}
		public double getScore_jilv() {
			return score_jilv;
		}
		public void setScore_jilv(double score_jilv) {
			this.score_jilv = score_jilv;
		}
		public double getScore_zhiye() {
			return score_zhiye;
		}
		public void setScore_zhiye(double score_zhiye) {
			this.score_zhiye = score_zhiye;
		}
		public double getScore_zonghe() {
			return score_zonghe;
		}
		public void setScore_zonghe(double score_zonghe) {
			this.score_zonghe = score_zonghe;
		}
		
		@Override
		public String toString() {
			return "Student [stu_id=" + stu_id + ", stu_no=" + stu_no
					+ ", stu_name=" + stu_name + ", stu_img=" + stu_img
					+ ", stu_sex=" + stu_sex + ", stu_profession="
					+ stu_profession + ", stu_icno=" + stu_icno
					+ ", stu_phone=" + stu_phone + ", stu_birth=" + stu_birth
					+ ", stu_qq=" + stu_qq + ", class_name=" + class_name
					+ ", score_jishu=" + score_jishu + ", score_jilv="
					+ score_jilv + ", score_zhiye=" + score_zhiye
					+ ", score_zonghe=" + score_zonghe + "]";
		}
		
		public Student(){}
		
		public Student(int stu_id, String stu_no, String stu_name,
				String stu_img, String stu_sex, String stu_profession,
				String stu_icno, String stu_phone, String stu_birth,
				String stu_qq, String class_name, double score_jishu,
				double score_jilv, double score_zhiye, double score_zonghe) {
			super();
			this.stu_id = stu_id;
			this.stu_no = stu_no;
			this.stu_name = stu_name;
			this.stu_img = stu_img;
			this.stu_sex = stu_sex;
			this.stu_profession = stu_profession;
			this.stu_icno = stu_icno;
			this.stu_phone = stu_phone;
			this.stu_birth = stu_birth;
			this.stu_qq = stu_qq;
			this.class_name = class_name;
			this.score_jishu = score_jishu;
			this.score_jilv = score_jilv;
			this.score_zhiye = score_zhiye;
			this.score_zonghe = score_zonghe;
		}
		
		
		
		
	}	
