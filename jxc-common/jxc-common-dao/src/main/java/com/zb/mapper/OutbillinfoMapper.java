package com.zb.mapper;
import com.zb.pojo.Outbillinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OutbillinfoMapper {

	public Outbillinfo getOutbillinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Outbillinfo>	getOutbillinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getOutbillinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOutbillinfo(Outbillinfo outbillinfo)throws Exception;

	public Integer updateOutbillinfo(Outbillinfo outbillinfo)throws Exception;

	public Integer deleteOutbillinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOutbillinfo(Map<String,List<String>> params);

}
