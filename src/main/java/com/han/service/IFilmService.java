package com.han.service;

import com.han.model.TAgency;
import com.han.model.TFilm;

public interface IFilmService {

    TFilm selectByPrimaryKey(String filmId);

    TAgency selectOneAgency(String agencyID);

    TAgency updateAgency(TAgency agency);

}
