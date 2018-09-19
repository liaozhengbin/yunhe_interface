package cn.yunhe.dao.impl;

import java.util.List;

import cn.yunhe.dao.ScoreDao;
import cn.yunhe.entity.Score;
import cn.yunhe.util.ORMUtil;

public class ScoreDaoImpl implements ScoreDao {

	@Override
	public List<Score> scoreList(int h1, int h2) {
		// TODO Auto-generated method stub
		
		//
		String sql="SELECT t2.stu_name,t1.score_type,t1.score_value,t1.score_contents,t1.time FROM tb_score t1,tb_student t2 where t1.class_id=? AND DATE_FORMAT(time,'%y-%m')=DATE_FORMAT(NOW(),'%y-%m') AND score_type=?";
		Object[] sc={h1,h2};
		List<Score> scoreList=ORMUtil.ormutil().selectList(sql, sc, Score.class);
		return scoreList;
	}

	@Override
	public List<Score> scoreListAll(int h1) {
		// TODO Auto-generated method stub

		String sql="SELECT *FROM tb_score  where stu_id=?";
		Object[] sc={h1};
		List<Score> scoreList=ORMUtil.ormutil().selectList(sql, sc, Score.class);
		return scoreList;
	}

	@Override
	public List<Score> scoreList2(int h1) {
		// TODO Auto-generated method stub
		String sql="SELECT t2.stu_id,t2.stu_name,t1.score_type,t1.score_value,t1.score_contents,t1.time FROM tb_score t1,tb_student t2 where t2.stu_id=? AND DATE_FORMAT(time,'%y-%m')=DATE_FORMAT(NOW(),'%y-%m')";
		Object[] sc={h1};
		List<Score> scoreList=ORMUtil.ormutil().selectList(sql, sc, Score.class);
		return scoreList;
	}

}
