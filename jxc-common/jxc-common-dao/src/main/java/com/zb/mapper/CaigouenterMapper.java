package com.zb.mapper;
import com.zb.pojo.Caigouenter;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaigouenterMapper {

	public Caigouenter getCaigouenterById(@Param(value = "id") Long id)throws Exception;

	public List<Caigouenter>	getCaigouenterListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigouenterCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigouenter(Caigouenter caigouenter)throws Exception;

	public Integer updateCaigouenter(Caigouenter caigouenter)throws Exception;

	public Integer deleteCaigouenterById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCaigouenter(Map<String,List<String>> params);

}
