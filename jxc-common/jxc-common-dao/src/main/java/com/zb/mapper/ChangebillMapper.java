package com.zb.mapper;
import com.zb.pojo.Changebill;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChangebillMapper {

	public Changebill getChangebillById(@Param(value = "id") Long id)throws Exception;

	public List<Changebill>	getChangebillListByMap(Map<String,Object> param)throws Exception;

	public Integer getChangebillCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertChangebill(Changebill changebill)throws Exception;

	public Integer updateChangebill(Changebill changebill)throws Exception;

	public Integer deleteChangebillById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteChangebill(Map<String,List<String>> params);

}
