package com.zb.mapper;
import com.zb.pojo.Enterdetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnterdetailMapper {

	public Enterdetail getEnterdetailById(@Param(value = "id") Long id)throws Exception;

	public List<Enterdetail>	getEnterdetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getEnterdetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertEnterdetail(Enterdetail enterdetail)throws Exception;

	public Integer updateEnterdetail(Enterdetail enterdetail)throws Exception;

	public Integer deleteEnterdetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteEnterdetail(Map<String,List<String>> params);

}
