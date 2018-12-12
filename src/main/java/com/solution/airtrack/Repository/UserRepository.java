package com.solution.airtrack.Repository;

import com.solution.airtrack.Models.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
