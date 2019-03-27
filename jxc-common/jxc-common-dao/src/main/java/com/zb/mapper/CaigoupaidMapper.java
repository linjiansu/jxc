package com.zb.mapper;
import com.zb.pojo.Caigoupaid;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaigoupaidMapper {

	public Caigoupaid getCaigoupaidById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoupaid>	getCaigoupaidListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoupaidCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoupaid(Caigoupaid caigoupaid)throws Exception;

	public Integer updateCaigoupaid(Caigoupaid caigoupaid)throws Exception;

	public Integer deleteCaigoupaidById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCaigoupaid(Map<String,List<String>> params);

}
