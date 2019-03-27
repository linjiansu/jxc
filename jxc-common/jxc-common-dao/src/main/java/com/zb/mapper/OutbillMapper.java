package com.zb.mapper;
import com.zb.pojo.Outbill;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OutbillMapper {

	public Outbill getOutbillById(@Param(value = "id") Long id)throws Exception;

	public List<Outbill>	getOutbillListByMap(Map<String,Object> param)throws Exception;

	public Integer getOutbillCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOutbill(Outbill outbill)throws Exception;

	public Integer updateOutbill(Outbill outbill)throws Exception;

	public Integer deleteOutbillById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOutbill(Map<String,List<String>> params);

}
