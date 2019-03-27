package com.zb.mapper;
import com.zb.pojo.Ar;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArMapper {

	public Ar getArById(@Param(value = "id") Long id)throws Exception;

	public List<Ar>	getArListByMap(Map<String,Object> param)throws Exception;

	public Integer getArCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertAr(Ar ar)throws Exception;

	public Integer updateAr(Ar ar)throws Exception;

	public Integer deleteArById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteAr(Map<String,List<String>> params);

}
