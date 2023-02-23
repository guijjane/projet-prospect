package com.banque.procpect.entitie;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProspectEntitie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Prenom;
    private Integer Age;
    private Integer Adress ;
    private Date Telephone;
    private String StatueFamilliale;
    private String Profession;
    private Integer NbrEnfant;





}
