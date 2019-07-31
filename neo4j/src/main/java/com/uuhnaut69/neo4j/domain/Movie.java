package com.uuhnaut69.neo4j.domain;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private int released;
	private String tagline;

	@JsonIgnoreProperties("movie")
	@Relationship(type = "ACTED_IN", direction = Relationship.INCOMING)
	private List<Role> roles;
}
