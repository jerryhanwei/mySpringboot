package com.han.dao;

import com.han.model.TFilm;
import org.springframework.stereotype.Repository;

@Repository
public interface TFilmMapper {
    int deleteByPrimaryKey(Short filmId);

    int insert(TFilm record);

    int insertSelective(TFilm record);

    TFilm selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(TFilm record);

    int updateByPrimaryKeyWithBLOBs(TFilm record);

    int updateByPrimaryKey(TFilm record);
}