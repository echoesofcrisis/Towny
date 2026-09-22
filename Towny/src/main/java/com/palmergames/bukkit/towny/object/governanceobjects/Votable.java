package com.palmergames.bukkit.towny.object.governanceobjects;

import java.util.Collection;

public interface Votable {
	Collection<Vote> getActiveVotes();
	
	void AddVote(Vote vote);
	
	void RemoveVote(Vote vote);
}
