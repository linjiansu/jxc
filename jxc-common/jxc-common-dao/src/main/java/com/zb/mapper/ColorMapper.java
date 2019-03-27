package com.zb.mapper;
import com.zb.pojo.Color;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ColorMapper {

	public Color getColorById(@Param(value = "id") Long id)throws Exception;

	public List<Color>	getColorListByMap(Map<String,Object> param)throws Exception;

	public Integer getColorCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertColor(Color color)throws Exception;

	public Integer updateColor(Color color)throws Exception;

	public Integer deleteColorById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteColor(Map<String,List<String>> params);

}
