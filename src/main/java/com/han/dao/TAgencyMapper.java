package com.han.dao;

import com.han.model.TAgency;
import org.springframework.stereotype.Repository;

@Repository
public interface TAgencyMapper {
    int deleteByPrimaryKey(String tAgencyId);

    int insert(TAgency record);

    int insertSelective(TAgency record);

    TAgency selectByPrimaryKey(String tAgencyId);

    int updateByPrimaryKeySelective(TAgency record);

    int updateByPrimaryKey(TAgency record);
}