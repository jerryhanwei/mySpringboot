package com.han.service.impl;

import com.han.dao.TAgencyMapper;
import com.han.dao.TFilmMapper;
import com.han.model.TAgency;
import com.han.model.TFilm;
import com.han.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FilmService implements IFilmService {
    @Autowired
    private TFilmMapper filmMapper;
    @Autowired
    private TAgencyMapper agencyMapper;
    @Override
    public TFilm selectByPrimaryKey(String filmId) {
       return filmMapper.selectByPrimaryKey(Short.valueOf(filmId));
    }


    @Override
    public TAgency selectOneAgency(String agencyID) {
        return agencyMapper.selectByPrimaryKey(agencyID);
    }
}
