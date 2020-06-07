package com.telstra.codechallenge.softvisiongitrepo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.telstra.codechallenge.quotes.Quote;
import com.telstra.codechallenge.softvisiongitrepo.GitHubTestObject;

import lombok.Data;

@Service
public class GitHubTestService {

  @Value("${github.base.url}")
  private String githubBaseUrl;

  private RestTemplate restTemplate;

  public GitHubTestService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  /**
   * Returns an array of spring boot quotes. Taken from https://spring.io/guides/gs/consuming-rest/.
 * @return - a quote array
   */

  public Item getOldUser() {
    
	String service = "search/users?q=followers:0&sort=joined&order=asc";
	//System.out.println(githubBaseUrl + service);
	GitHubTestObject all = restTemplate.getForObject(githubBaseUrl + service, GitHubTestObject.class);
	//System.out.println( all.getItems().get(0)); 
    return all.getItems().get(0);
    
    
  }
  
  public LatestItems getLatestRepo() {
	    
	   LocalDate today = LocalDate.now();
	   
		String service = "search/repositories?q=created:>"+today.minusDays(7)+"&sort=stars&order=desc";
		//System.out.println(githubBaseUrl + service);
		GitHubLatestRepoObject allrepo= restTemplate.getForObject(githubBaseUrl + service, GitHubLatestRepoObject.class);
		//System.out.println("===" +allrepo.getTotal_count()); 
	    return allrepo.getItems().get(0);
	    
	  }
  

}
