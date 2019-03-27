package com.zb.mapper;
import com.zb.pojo.Outs;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OutsMapper {

	public Outs getOutsById(@Param(value = "id") Long id)throws Exception;

	public List<Outs>	getOutsListByMap(Map<String,Object> param)throws Exception;

	public Integer getOutsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOuts(Outs outs)throws Exception;

	public Integer updateOuts(Outs outs)throws Exception;

	public Integer deleteOutsById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOuts(Map<String,List<String>> params);

}
