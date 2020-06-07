package com.telstra.codechallenge.softvisiongitrepo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.telstra.codechallenge.quotes.Quote;
import com.telstra.codechallenge.quotes.Quote.Value;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GitHubTestObject {
	private String  total_count,
	            incomplete_results;
	List<Item> items;

}
