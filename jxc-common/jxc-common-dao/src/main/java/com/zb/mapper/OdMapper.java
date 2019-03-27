package com.zb.mapper;
import com.zb.pojo.Od;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OdMapper {

	public Od getOdById(@Param(value = "id") Long id)throws Exception;

	public List<Od>	getOdListByMap(Map<String,Object> param)throws Exception;

	public Integer getOdCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOd(Od od)throws Exception;

	public Integer updateOd(Od od)throws Exception;

	public Integer deleteOdById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOd(Map<String,List<String>> params);

}
