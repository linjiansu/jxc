package com.zb.mapper;
import com.zb.pojo.Paiddetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaiddetailMapper {

	public Paiddetail getPaiddetailById(@Param(value = "id") Long id)throws Exception;

	public List<Paiddetail>	getPaiddetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getPaiddetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPaiddetail(Paiddetail paiddetail)throws Exception;

	public Integer updatePaiddetail(Paiddetail paiddetail)throws Exception;

	public Integer deletePaiddetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeletePaiddetail(Map<String,List<String>> params);

}
