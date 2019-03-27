package com.zb.mapper;
import com.zb.pojo.Inbillinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InbillinfoMapper {

	public Inbillinfo getInbillinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Inbillinfo>	getInbillinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getInbillinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertInbillinfo(Inbillinfo inbillinfo)throws Exception;

	public Integer updateInbillinfo(Inbillinfo inbillinfo)throws Exception;

	public Integer deleteInbillinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteInbillinfo(Map<String,List<String>> params);

}
