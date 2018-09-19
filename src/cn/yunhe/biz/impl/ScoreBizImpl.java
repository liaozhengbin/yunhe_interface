package cn.yunhe.biz.impl;

import java.util.List;

import cn.yunhe.biz.ScoreBiz;
import cn.yunhe.dao.ScoreDao;
import cn.yunhe.dao.impl.ScoreDaoImpl;
import cn.yunhe.entity.Score;

public class ScoreBizImpl implements ScoreBiz {
	ScoreDao scoreDao=new ScoreDaoImpl();
	@Override
	public List<Score> scoreListAll(int h1) {
		// TODO Auto-generated method stub
		return scoreDao.scoreListAll(h1);
	}

	@Override
	public List<Score> scoreList(int h1, int h2) {
		// TODO Auto-generated method stub
		return scoreDao.scoreList(h1, h2);
	}

	@Override
	public List<Score> scoreList2(int h1) {
		// TODO Auto-generated method stub
		return scoreDao.scoreList2(h1);
	}

}
