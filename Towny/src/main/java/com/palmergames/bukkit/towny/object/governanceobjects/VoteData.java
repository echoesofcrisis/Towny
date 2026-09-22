package com.palmergames.bukkit.towny.object.governanceobjects;

/// Contains the information to send back to the relevant command script when a vote is finalized, along with other descriptive data.
public class VoteData {
	public VoteData(String data) {this.data = data;}
	
	private String data;

	public String getData() {
		return data;
	}
}
