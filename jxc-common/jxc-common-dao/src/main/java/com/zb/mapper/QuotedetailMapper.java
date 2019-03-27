package com.zb.mapper;
import com.zb.pojo.Quotedetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuotedetailMapper {

	public Quotedetail getQuotedetailById(@Param(value = "id") Long id)throws Exception;

	public List<Quotedetail>	getQuotedetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getQuotedetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertQuotedetail(Quotedetail quotedetail)throws Exception;

	public Integer updateQuotedetail(Quotedetail quotedetail)throws Exception;

	public Integer deleteQuotedetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteQuotedetail(Map<String,List<String>> params);

}
