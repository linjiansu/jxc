package com.zb.mapper;
import com.zb.pojo.Alarminfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlarminfoMapper {

	public Alarminfo getAlarminfoById(@Param(value = "id") Long id)throws Exception;

	public List<Alarminfo>	getAlarminfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getAlarminfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertAlarminfo(Alarminfo alarminfo)throws Exception;

	public Integer updateAlarminfo(Alarminfo alarminfo)throws Exception;

	public Integer deleteAlarminfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteAlarminfo(Map<String,List<String>> params);

}
