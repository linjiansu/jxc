package com.zb.mapper;
import com.zb.pojo.Outdetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OutdetailMapper {

	public Outdetail getOutdetailById(@Param(value = "id") Long id)throws Exception;

	public List<Outdetail>	getOutdetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getOutdetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOutdetail(Outdetail outdetail)throws Exception;

	public Integer updateOutdetail(Outdetail outdetail)throws Exception;

	public Integer deleteOutdetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOutdetail(Map<String,List<String>> params);

}
