package com.zb.mapper;
import com.zb.pojo.Receipt;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReceiptMapper {

	public Receipt getReceiptById(@Param(value = "id") Long id)throws Exception;

	public List<Receipt>	getReceiptListByMap(Map<String,Object> param)throws Exception;

	public Integer getReceiptCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertReceipt(Receipt receipt)throws Exception;

	public Integer updateReceipt(Receipt receipt)throws Exception;

	public Integer deleteReceiptById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteReceipt(Map<String,List<String>> params);

}
