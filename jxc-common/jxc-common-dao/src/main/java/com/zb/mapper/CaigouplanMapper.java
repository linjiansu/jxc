package com.zb.mapper;
import com.zb.pojo.Caigouplan;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaigouplanMapper {

	public Caigouplan getCaigouplanById(@Param(value = "id") Long id)throws Exception;

	public List<Caigouplan>	getCaigouplanListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigouplanCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigouplan(Caigouplan caigouplan)throws Exception;

	public Integer updateCaigouplan(Caigouplan caigouplan)throws Exception;

	public Integer deleteCaigouplanById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCaigouplan(Map<String,List<String>> params);

}
