package cn.yunhe.biz;

import java.util.List;

import cn.yunhe.entity.Record;

public interface RecordBiz {
	//根据学号查询打卡记录
	List<Record> seleteRecord(int xuehao,int page,int line);
		
	//根据学号查询总打卡记录
	int selectRecordId(int xuehao);
}
