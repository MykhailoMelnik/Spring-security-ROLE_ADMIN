package com.security.repository;

import com.security.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // TODO: 28.11.2023 nomber not email
    @Query("select distinct p from Person p left join fetch p.roles where p.email = ?1")
    Person findByEmailFetchRoles(String email);
}
