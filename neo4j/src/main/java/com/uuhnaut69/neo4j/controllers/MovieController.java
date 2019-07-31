package com.uuhnaut69.neo4j.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uuhnaut69.neo4j.domain.Movie;
import com.uuhnaut69.neo4j.services.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/graph")
	public Map<String, Object> graph(@RequestParam(value = "limit", required = false) Integer limit) {
		return movieService.graph(limit == null ? 100 : limit);
	}

	@GetMapping("/movie")
	public Movie findByTitle(@RequestParam String title) {
		return movieService.findByTitle(title);
	}

}
