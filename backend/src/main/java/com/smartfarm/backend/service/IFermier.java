package com.smartfarm.backend.service;

import com.smartfarm.backend.model.dto.FermierDto;
import com.smartfarm.backend.model.entities.Fermier;

public interface IFermier {
    FermierDto findFermierById(String id);
    FermierDto updateFermier(FermierDto fermierDto);
    Fermier saveFermier(Fermier fermier);
    String authentificate(String mail, String mdp);
    void deconnect(Fermier fermier);
}
