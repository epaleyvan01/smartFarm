package com.smartfarm.backend.repository;

import com.smartfarm.backend.model.entities.Fermier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface FermierRepository extends JpaRepository<Fermier, String> {
    Optional<Fermier> findById(String id);
    @Query(value = "SELECT ID_FERMIER FROM FERMIER WHERE EMAIL = :email", nativeQuery = true)
    public long getIdByMail(@Param("email") String email);

    @Query(value = "SELECT PWD FROM FERMIER WHERE ID_FERMIER = :id", nativeQuery = true)
    public String getMdpById(@Param("id") long id);
}