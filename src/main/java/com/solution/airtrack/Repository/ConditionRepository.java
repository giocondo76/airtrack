package com.solution.airtrack.Repository;
import com.solution.airtrack.Models.Condition;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConditionRepository extends JpaRepository<Condition, Integer> {
}

