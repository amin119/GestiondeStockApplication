package com.chabbah.gestiondestock.repository;

import com.chabbah.gestiondestock.model.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<Integer, MvtStock> {
}
