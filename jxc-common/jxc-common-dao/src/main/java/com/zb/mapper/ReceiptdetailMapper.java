package com.zb.mapper;
import com.zb.pojo.Receiptdetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReceiptdetailMapper {

	public Receiptdetail getReceiptdetailById(@Param(value = "id") Long id)throws Exception;

	public List<Receiptdetail>	getReceiptdetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getReceiptdetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertReceiptdetail(Receiptdetail receiptdetail)throws Exception;

	public Integer updateReceiptdetail(Receiptdetail receiptdetail)throws Exception;

	public Integer deleteReceiptdetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteReceiptdetail(Map<String,List<String>> params);

}
