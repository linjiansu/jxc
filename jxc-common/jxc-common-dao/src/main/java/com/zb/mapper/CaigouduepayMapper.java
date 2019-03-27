package com.zb.mapper;
import com.zb.pojo.Caigouduepay;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaigouduepayMapper {

	public Caigouduepay getCaigouduepayById(@Param(value = "id") Long id)throws Exception;

	public List<Caigouduepay>	getCaigouduepayListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigouduepayCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigouduepay(Caigouduepay caigouduepay)throws Exception;

	public Integer updateCaigouduepay(Caigouduepay caigouduepay)throws Exception;

	public Integer deleteCaigouduepayById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCaigouduepay(Map<String,List<String>> params);

}
