package com.zb.mapper;
import com.zb.pojo.Ckinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CkinfoMapper {

	public Ckinfo getCkinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Ckinfo>	getCkinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getCkinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCkinfo(Ckinfo ckinfo)throws Exception;

	public Integer updateCkinfo(Ckinfo ckinfo)throws Exception;

	public Integer deleteCkinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCkinfo(Map<String,List<String>> params);

}
