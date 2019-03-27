package com.zb.mapper;
import com.zb.pojo.Unit;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UnitMapper {

	public Unit getUnitById(@Param(value = "id") Long id)throws Exception;

	public List<Unit>	getUnitListByMap(Map<String,Object> param)throws Exception;

	public Integer getUnitCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertUnit(Unit unit)throws Exception;

	public Integer updateUnit(Unit unit)throws Exception;

	public Integer deleteUnitById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteUnit(Map<String,List<String>> params);

}
