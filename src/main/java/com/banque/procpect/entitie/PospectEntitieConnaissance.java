package com.banque.procpect.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PospectEntitieConnaissance {
    private String ProduitBancaire;
    private String ProduitCredit ;
    private String ProduitAssurance;
    private String ProduitEpargne;

}
