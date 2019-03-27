package com.zb.mapper;
import com.zb.pojo.Orderdetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderdetailMapper {

	public Orderdetail getOrderdetailById(@Param(value = "id") Long id)throws Exception;

	public List<Orderdetail>	getOrderdetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getOrderdetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOrderdetail(Orderdetail orderdetail)throws Exception;

	public Integer updateOrderdetail(Orderdetail orderdetail)throws Exception;

	public Integer deleteOrderdetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOrderdetail(Map<String,List<String>> params);

}
