package com.zb.mapper;
import com.zb.pojo.Caigoureturned;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaigoureturnedMapper {

	public Caigoureturned getCaigoureturnedById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoureturned>	getCaigoureturnedListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoureturnedCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoureturned(Caigoureturned caigoureturned)throws Exception;

	public Integer updateCaigoureturned(Caigoureturned caigoureturned)throws Exception;

	public Integer deleteCaigoureturnedById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCaigoureturned(Map<String,List<String>> params);

}
