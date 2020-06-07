package com.telstra.codechallenge.softvisiongitrepo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.codechallenge.helloworld.HelloWorld;
import com.telstra.codechallenge.quotes.Quote;
import com.telstra.codechallenge.softvisiongitrepo.GitHubTestObject;

@RestController
public class GitHubTestController {

	private GitHubTestService gitHubService;

	public GitHubTestController(GitHubTestService gitHubService) {
		this.gitHubService = gitHubService;
	}

	@GetMapping(path = "/olduser")
	public String getOldUser() {

		String currentvalue = "{ \" id \": " + gitHubService.getOldUser().getId() + ",\" login \":"
				+ gitHubService.getOldUser().getLogin() + ",\" html_url \" : "
				+ gitHubService.getOldUser().getHtml_url() + " } ";
		return currentvalue;

	}

	@GetMapping(path = "/latestrepo")
	public String getLatestRepo() {
		      
		
		  String currentvalue = "{ \" name \": " + gitHubService.getLatestRepo().getName()
		  + ",\" fullname \":"+ gitHubService.getLatestRepo().getFull_name() 
		  + ",\" watchers_count \":"+ gitHubService.getLatestRepo().getWatchers_count() 
		  + ",\" language \":"+ gitHubService.getLatestRepo().getLanguage() 
		  + ",\" description \":"+ gitHubService.getLatestRepo().getDescription() +
		  ",\" html_url \" : " + gitHubService.getLatestRepo().getHtml_url() + " } ";
		 
		return currentvalue;

	}
	
}
