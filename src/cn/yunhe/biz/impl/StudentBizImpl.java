package cn.yunhe.biz.impl;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cn.yunhe.biz.StudentBiz;
import cn.yunhe.dao.StudentDao;
import cn.yunhe.dao.impl.StudentDaoImpl;
import cn.yunhe.entity.Student;

public class StudentBizImpl implements StudentBiz {
	private StudentDao student = new StudentDaoImpl();

	@Override
	public List<Student> selectStudent(int classId) {
		// TODO Auto-generated method stub
		List<Student> stulist = student.selectStudent(classId);
		for (Student stu : stulist) {
			double jilv = stu.getScore_jilv() + 100;
			double jishu = stu.getScore_jishu() + 100;
			double zhiye = stu.getScore_zhiye() + 100;
			stu.setScore_jilv(jilv);
			stu.setScore_jishu(jishu);
			stu.setScore_zhiye(zhiye);

			// 综合评分=纪律分*20%+技术分*40%+职业能力分*40%
			double zonghe = jilv * 0.2 + jishu * 0.4 + zhiye * 0.4;

			// 处理浮点型计算的精度问题，返回的是String
			DecimalFormat df = new DecimalFormat(".0");
			String str = df.format(zonghe);

			// 将String转成double
			stu.setScore_zonghe(Double.parseDouble(str));

		}

		// 排序
		Collections.sort(stulist, new Comparator<Student>() {

			@Override
			public int compare(Student stu1, Student stu2) {
				if (stu1.getScore_zonghe() > stu2.getScore_zonghe()) {
					return -1;
				} else if (stu1.getScore_zonghe() < stu2.getScore_zonghe()) {
					return 1;
				} else {
					return 0;
				}
			}

		});

		return stulist;
	}

	@Override
	public Student selectStudentById(int stuId) {
		// TODO Auto-generated method stub
		return student.selectStudentById(stuId);
	}

	@Override
	public List<Student> selectStudent2(int classId) {
		// TODO Auto-generated method stub
		return student.selectStudent2(classId);
	}

}
