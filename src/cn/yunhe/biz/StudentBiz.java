package cn.yunhe.biz;

import java.util.List;

import cn.yunhe.entity.Student;

public interface StudentBiz {
	
	/**
	 * 通过班级ID查询该班级下所有学生的积分信息（按照综合分排序）
	 * @param classId
	 * @return
	 */
	List<Student> selectStudent(int classId);
	
	//通过学生ID查询学生信息
	Student selectStudentById(int stuId);
	
	
	List<Student> selectStudent2(int classId);
	
}
