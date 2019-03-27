package com.zb.mapper;
import com.zb.pojo.Inbill;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InbillMapper {

	public Inbill getInbillById(@Param(value = "id") Long id)throws Exception;

	public List<Inbill>	getInbillListByMap(Map<String,Object> param)throws Exception;

	public Integer getInbillCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertInbill(Inbill inbill)throws Exception;

	public Integer updateInbill(Inbill inbill)throws Exception;

	public Integer deleteInbillById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteInbill(Map<String,List<String>> params);

}
