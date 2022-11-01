package com.smartfarm.backend.service;

import com.smartfarm.backend.model.dto.ArticleDto;
import com.smartfarm.backend.model.entities.Commande;
import com.smartfarm.backend.model.dto.CommandeDto;
import java.util.List;

public interface ICommande {
    //Commande findByNumber(Integer nuumber);
    List<CommandeDto> listCommandes();
    CommandeDto searchArticleById(String id);
    int deleteCommandeById(String id);
    String saveCommande(CommandeDto commandeDto);
    CommandeDto updateStatutCommande(String id ,String state);

}
