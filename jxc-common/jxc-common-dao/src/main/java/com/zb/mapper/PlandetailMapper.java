package com.zb.mapper;
import com.zb.pojo.Plandetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlandetailMapper {

	public Plandetail getPlandetailById(@Param(value = "id") Long id)throws Exception;

	public List<Plandetail>	getPlandetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getPlandetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPlandetail(Plandetail plandetail)throws Exception;

	public Integer updatePlandetail(Plandetail plandetail)throws Exception;

	public Integer deletePlandetailById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeletePlandetail(Map<String,List<String>> params);

}
