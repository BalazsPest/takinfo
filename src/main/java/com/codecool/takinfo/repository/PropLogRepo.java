package com.codecool.takinfo.repository;


import com.codecool.takinfo.modal.Property;
import com.codecool.takinfo.modal.PropertyCalcLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropLogRepo extends JpaRepository<PropertyCalcLog, Integer> {
}
