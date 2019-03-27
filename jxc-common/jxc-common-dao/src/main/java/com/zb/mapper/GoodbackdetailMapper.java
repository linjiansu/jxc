package com.zb.mapper;
import com.zb.pojo.Goodbackdetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodbackdetailMapper {

	public Goodbackdetail getGoodbackdetailById(@Param(value = "id") Long id)throws Exception;

	public List<Goodbackdetail>	getGoodbackdetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodbackdetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoodbackdetail(Goodbackdetail goodbackdetail)throws Exception;

	public Integer updateGoodbackdetail(Goodbackdetail goodbackdetail)throws Exception;

	public Integer deleteGoodbackdetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGoodbackdetail(Map<String,List<String>> params);

}
