package cn.yunhe.dao;

import java.util.List;

import cn.yunhe.entity.Student;

public interface StudentDao {
	
	
	/**
	 * 通过班级ID查询该班级下所有学生的积分信息（按照综合分排序）
	 * @param classId
	 * @return
	 */
	List<Student> selectStudent(int classId);
	
	
	List<Student> selectStudent2(int classId);
	

	//通过学生ID查询学生信息
	Student selectStudentById(int stuId);
	
	
	
}
