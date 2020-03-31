package com.example.demo.dao.oracle;

import com.example.demo.model.oracle.NkParameterBean;
import com.example.demo.model.oracle.NkParameterBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface NkParameterBeanMapper {
    long countByExample(NkParameterBeanExample example);

    int deleteByExample(NkParameterBeanExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(NkParameterBean record);

    int insertSelective(NkParameterBean record);

    List<NkParameterBean> selectByExample(NkParameterBeanExample example);

    NkParameterBean selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") NkParameterBean record, @Param("example") NkParameterBeanExample example);

    int updateByExample(@Param("record") NkParameterBean record, @Param("example") NkParameterBeanExample example);

    int updateByPrimaryKeySelective(NkParameterBean record);

    int updateByPrimaryKey(NkParameterBean record);
}