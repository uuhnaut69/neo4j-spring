package com.uuhnaut69.neo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.uuhnaut69.neo4j.domain.Person;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

	Person findByName(String name);

}
