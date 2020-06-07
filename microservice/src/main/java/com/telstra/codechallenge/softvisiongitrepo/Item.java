package com.telstra.codechallenge.softvisiongitrepo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
	private String login,id,node_id,avatar_url,gravatar_id,url,
			html_url,followers_url,following_url,gists_url,starred_url,
			subscriptions_url,organizations_url,repos_url,events_url,received_events_url,
			type,site_admin,score;

	public String getLogin() {
		return login;
	}

	public String getId() {
		return id;
	}

	public String getNode_id() {
		return node_id;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public String getGravatar_id() {
		return gravatar_id;
	}

	public String getUrl() {
		return url;
	}

	public String getHtml_url() {
		return html_url;
	}

	public String getFollowers_url() {
		return followers_url;
	}

	public String getFollowing_url() {
		return following_url;
	}

	public String getGists_url() {
		return gists_url;
	}

	public String getStarred_url() {
		return starred_url;
	}

	public String getSubscriptions_url() {
		return subscriptions_url;
	}

	public String getOrganizations_url() {
		return organizations_url;
	}

	public String getRepos_url() {
		return repos_url;
	}

	public String getEvents_url() {
		return events_url;
	}

	public String getReceived_events_url() {
		return received_events_url;
	}

	public String getType() {
		return type;
	}

	public String getSite_admin() {
		return site_admin;
	}

	public String getScore() {
		return score;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public void setGravatar_id(String gravatar_id) {
		this.gravatar_id = gravatar_id;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public void setFollowers_url(String followers_url) {
		this.followers_url = followers_url;
	}

	public void setFollowing_url(String following_url) {
		this.following_url = following_url;
	}

	public void setGists_url(String gists_url) {
		this.gists_url = gists_url;
	}

	public void setStarred_url(String starred_url) {
		this.starred_url = starred_url;
	}

	public void setSubscriptions_url(String subscriptions_url) {
		this.subscriptions_url = subscriptions_url;
	}

	public void setOrganizations_url(String organizations_url) {
		this.organizations_url = organizations_url;
	}

	public void setRepos_url(String repos_url) {
		this.repos_url = repos_url;
	}

	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}

	public void setReceived_events_url(String received_events_url) {
		this.received_events_url = received_events_url;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSite_admin(String site_admin) {
		this.site_admin = site_admin;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
