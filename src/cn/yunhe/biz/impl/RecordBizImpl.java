package cn.yunhe.biz.impl;

import java.util.List;

import cn.yunhe.biz.RecordBiz;
import cn.yunhe.dao.RecordDao;
import cn.yunhe.dao.impl.RecordDaoImpl;
import cn.yunhe.entity.Record;

public class RecordBizImpl implements RecordBiz {
	RecordDao recordDao=new RecordDaoImpl();
	@Override
	public List<Record> seleteRecord(int xuehao,int page,int line) {
		// TODO Auto-generated method stub
		return recordDao.seleteRecord(xuehao,page,line);
	}
	@Override
	public int selectRecordId(int xuehao) {
		// TODO Auto-generated method stub
		return recordDao.selectRecordId(xuehao);
	}

}
