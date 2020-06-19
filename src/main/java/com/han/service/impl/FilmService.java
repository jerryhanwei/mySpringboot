package com.han.service.impl;

import com.han.dao.TFilmMapper;
import com.han.model.TFilm;
import com.han.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FilmService implements IFilmService {
    @Autowired
    private TFilmMapper filmMapper;

    @Override
    public TFilm selectByPrimaryKey(String filmId) {
       return filmMapper.selectByPrimaryKey(Short.valueOf(filmId));
    }
}
