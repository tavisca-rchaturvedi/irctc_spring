package com.tavisca.irctc.dao;

import com.tavisca.irctc.models.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepo extends JpaRepository<Stop,Integer> {
}
