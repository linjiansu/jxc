package com.zb.mapper;
import com.zb.pojo.Goodback;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodbackMapper {

	public Goodback getGoodbackById(@Param(value = "id") Long id)throws Exception;

	public List<Goodback>	getGoodbackListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodbackCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoodback(Goodback goodback)throws Exception;

	public Integer updateGoodback(Goodback goodback)throws Exception;

	public Integer deleteGoodbackById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGoodback(Map<String,List<String>> params);

}
