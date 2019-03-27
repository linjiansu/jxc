package com.zb.mapper;
import com.zb.pojo.Changebillinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChangebillinfoMapper {

	public Changebillinfo getChangebillinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Changebillinfo>	getChangebillinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getChangebillinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertChangebillinfo(Changebillinfo changebillinfo)throws Exception;

	public Integer updateChangebillinfo(Changebillinfo changebillinfo)throws Exception;

	public Integer deleteChangebillinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteChangebillinfo(Map<String,List<String>> params);

}
