package com.han.controller;

import com.han.model.TAgency;
import com.han.model.TFilm;
import com.han.service.impl.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Controller
public class FilmController {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private FilmService filmService;


    @RequestMapping("getOneFilm")
    public String findOneFilm(TAgency tagency)
    {
       //TFilm film = filmService.selectByPrimaryKey("1");
        TAgency agency = filmService.selectOneAgency(tagency.gettAgencyId());
        System.out.println(agency.gettAgencyName());
        return "account";
    }
}
