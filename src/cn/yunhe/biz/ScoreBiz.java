package cn.yunhe.biz;

import java.util.List;

import cn.yunhe.entity.Score;

public interface ScoreBiz {
	
	//查看所有学生的积分
	List<Score> scoreListAll(int h1);
		
	//查看本月的技术、纪律、职业等积分
	List<Score> scoreList(int h1,int h2);
	
	
	//查看本月的技术、纪律、职业等积分
	List<Score> scoreList2(int h1);
	
}
