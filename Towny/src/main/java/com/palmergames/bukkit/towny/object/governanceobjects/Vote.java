package com.palmergames.bukkit.towny.object.governanceobjects;

// if anyone is curious why all these nested classes exist, it's to avoid maps. which seem like a pain in the ass to add to towny metadata

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/// Data container class for votes, containing the data pertaining to the vote and the player voting data.
public class Vote {
	public Vote(VoteData data, VoteType type, UUID initiator) { 
		this.data = data; 
		this.type = type; 
		this.initiator = initiator;
	}

	private VoteData data;
	private VoteType type;
	private List<PlayerVoteData> votes = new ArrayList<>();
	private UUID initiator;

	public VoteData getData() {
		return data;
	}
	
	public VoteType getVoteType() {
		return type;
	}

	public UUID getInitiator() {
		return initiator;
	}

	public void AddVote(Player player, int vote)
	{
		for (PlayerVoteData pvd : votes)
		{
			if(pvd.getPlayer().equals(player.getUniqueId()))
				return;
		}
		votes.add(new PlayerVoteData(player.getUniqueId(), vote));
	}
}

