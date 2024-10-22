package br.com.meli.socialtestenetwork.model;

import java.util.ArrayList;
import java.util.List;

public class Seller {

	private Integer userId;
	private String  username;
	private Double  ranking;
	private List<Buyer> followers;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public List<Buyer> getFollowers() {
		return followers;
	}
	public void setFollowers(List<Buyer> followers) {
		this.followers = followers;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Double getRanking() {
		return ranking;
	}
	public void setRanking(Double ranking) {
		this.ranking = ranking;
	}
	public Seller(Integer userId, String username, Double ranking) {
		this();
		this.userId = userId;
		this.username = username;
		this.ranking = ranking;
	}
	public Seller() {
		super();
		this.followers = new ArrayList<Buyer>();
	}
	
}
