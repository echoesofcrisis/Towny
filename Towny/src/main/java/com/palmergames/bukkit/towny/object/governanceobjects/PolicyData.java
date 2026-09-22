package com.palmergames.bukkit.towny.object.governanceobjects;

/// Contains information about the policy, its name, description, ect. Mostly arbitrary.
public class PolicyData {
	public PolicyData(String id, String displayName, String description) {this.id = id; this.displayName = displayName; this.description = description;}
	
	private String id;
	private String displayName;
	private String description;

	public String getId() {
		return id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getDescription() {
		return description;
	}
}
