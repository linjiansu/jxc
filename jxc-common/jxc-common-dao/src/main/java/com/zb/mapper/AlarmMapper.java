package com.zb.mapper;
import com.zb.pojo.Alarm;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlarmMapper {

	public Alarm getAlarmById(@Param(value = "id") Long id)throws Exception;

	public List<Alarm>	getAlarmListByMap(Map<String,Object> param)throws Exception;

	public Integer getAlarmCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertAlarm(Alarm alarm)throws Exception;

	public Integer updateAlarm(Alarm alarm)throws Exception;

	public Integer deleteAlarmById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteAlarm(Map<String,List<String>> params);

}
