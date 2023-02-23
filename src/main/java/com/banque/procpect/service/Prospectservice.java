package com.banque.procpect.service;

import com.banque.procpect.entitie.PospectEntitieConnaissance;
import com.banque.procpect.entitie.ProspectEntitie;
import com.banque.procpect.repository.ProspectRepository;
import lombok.AllArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Prospectservice {
    private ProspectRepository prospectRepository;

    public List<ProspectEntitie> getListProspect(){
        List<ProspectEntitie> listProspect = prospectRepository.findAll();
        return listProspect;
    }




}
