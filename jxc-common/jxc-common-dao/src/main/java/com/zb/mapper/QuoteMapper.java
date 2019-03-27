package com.zb.mapper;
import com.zb.pojo.Quote;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuoteMapper {

	public Quote getQuoteById(@Param(value = "id") Long id)throws Exception;

	public List<Quote>	getQuoteListByMap(Map<String,Object> param)throws Exception;

	public Integer getQuoteCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertQuote(Quote quote)throws Exception;

	public Integer updateQuote(Quote quote)throws Exception;

	public Integer deleteQuoteById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteQuote(Map<String,List<String>> params);

}
