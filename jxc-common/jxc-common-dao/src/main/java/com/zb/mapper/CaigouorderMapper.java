package com.zb.mapper;
import com.zb.pojo.Caigouorder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaigouorderMapper {

	public Caigouorder getCaigouorderById(@Param(value = "id") Long id)throws Exception;

	public List<Caigouorder>	getCaigouorderListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigouorderCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigouorder(Caigouorder caigouorder)throws Exception;

	public Integer updateCaigouorder(Caigouorder caigouorder)throws Exception;

	public Integer deleteCaigouorderById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCaigouorder(Map<String,List<String>> params);

}
