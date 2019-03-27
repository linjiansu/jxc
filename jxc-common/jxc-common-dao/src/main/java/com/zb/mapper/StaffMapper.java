package com.zb.mapper;
import com.zb.pojo.Staff;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffMapper {

	public Staff getStaffById(@Param(value = "id") Long id)throws Exception;

	public List<Staff>	getStaffListByMap(Map<String,Object> param)throws Exception;

	public Integer getStaffCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertStaff(Staff staff)throws Exception;

	public Integer updateStaff(Staff staff)throws Exception;

	public Integer deleteStaffById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteStaff(Map<String,List<String>> params);

}
