package com.banque.procpect.repository;

import com.banque.procpect.entitie.ProspectEntitie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProspectRepository extends JpaRepository<ProspectEntitie, Long> {


}
