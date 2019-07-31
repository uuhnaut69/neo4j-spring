package com.uuhnaut69.neo4j.domain;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int born;

	@Relationship(type = "ACTED_IN")
	private List<Movie> movies = new ArrayList<>();

}
