package com.pazartsepeti.pazarsepeti.repository;

import com.pazartsepeti.pazarsepeti.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Integer> {

}
