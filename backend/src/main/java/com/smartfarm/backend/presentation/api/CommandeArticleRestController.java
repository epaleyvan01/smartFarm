package com.smartfarm.backend.presentation.api;

import com.smartfarm.backend.model.dto.ArticleDto;
import com.smartfarm.backend.model.dto.ArticleDtoForList;
import com.smartfarm.backend.model.dto.CommandearticleDto;
import com.smartfarm.backend.service.IArticle;
import com.smartfarm.backend.service.ICommande;
import com.smartfarm.backend.service.ICommandearticle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/commandearticle")
@Slf4j
public class CommandeArticleRestController {
    @Autowired
    private ICommandearticle iCommandearticle;

    @PostMapping(value = "/save")
    public void enregistrer(@RequestBody CommandearticleDto create){
        //ArticleRestController.log.info("enregistrer-commande");
        iCommandearticle.saveCommandeArticle(create);
    }
}
