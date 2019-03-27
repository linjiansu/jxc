package com.zb.mapper;
import com.zb.pojo.Goodinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodinfoMapper {

	public Goodinfo getGoodinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Goodinfo>	getGoodinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoodinfo(Goodinfo goodinfo)throws Exception;

	public Integer updateGoodinfo(Goodinfo goodinfo)throws Exception;

	public Integer deleteGoodinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGoodinfo(Map<String,List<String>> params);

}
