package com.zb.mapper;
import com.zb.pojo.Returneddetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReturneddetailMapper {

	public Returneddetail getReturneddetailById(@Param(value = "id") Long id)throws Exception;

	public List<Returneddetail>	getReturneddetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getReturneddetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertReturneddetail(Returneddetail returneddetail)throws Exception;

	public Integer updateReturneddetail(Returneddetail returneddetail)throws Exception;

	public Integer deleteReturneddetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteReturneddetail(Map<String,List<String>> params);

}
