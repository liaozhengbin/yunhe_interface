package cn.yunhe.dao.impl;

import java.util.List;

import cn.yunhe.dao.StudentDao;
import cn.yunhe.entity.Student;
import cn.yunhe.util.ORMUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> selectStudent(int classId) {
		// TODO Auto-generated method stub
		
		String sql="select t2.stu_id,t2.stu_name,t2.stu_no ,t1.score_jilv,t1.score_jishu,t1.score_zhiye from "
				+ "(select stu_id,"
				+ "SUM(CASE WHEN score_type=1 THEN score_value END )score_jilv,"
				+ "SUM(CASE WHEN score_type=2 THEN score_value END )score_jishu,"
				+ "SUM(CASE WHEN score_type=3 THEN score_value END )score_zhiye "
				+ "from tb_score  where class_id=? GROUP BY stu_id)t1,"
				+ "tb_student t2 WHERE t1.stu_id=t2.stu_id";
		Object[]  classid={classId};
		
		List<Student> stu=ORMUtil.ormutil().selectList(sql, classid, Student.class);
		
		return stu;
	}

	@Override
	public Student selectStudentById(int stuId) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_student  where stu_id=?";
		Object[]  stuid={stuId};
		List<Student> stu=ORMUtil.ormutil().selectList(sql, stuid, Student.class);
		return stu.size()>0?stu.get(0):null;
	}

	@Override
	public List<Student> selectStudent2(int classId) {
		// TODO Auto-generated method stub
		String sql="SELECT stu_id,stu_no,stu_name,stu_profession FROM tb_student  where class_id=?";
		Object[]  classid={classId};
		List<Student> stu=ORMUtil.ormutil().selectList(sql, classid, Student.class);
		return stu;
	}

	
}
