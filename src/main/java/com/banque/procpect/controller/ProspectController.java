package com.banque.procpect.controller;

import com.banque.procpect.entitie.PospectEntitieConnaissance;
import com.banque.procpect.entitie.ProspectEntitie;
import com.banque.procpect.service.Prospectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/prospect")
@RestController
public class ProspectController {
    @Autowired

    private Prospectservice prospectservice;

    @GetMapping("/listProspect")
    public List<ProspectEntitie> getListProspect(){
        return prospectservice.getListProspect();
    }



}
