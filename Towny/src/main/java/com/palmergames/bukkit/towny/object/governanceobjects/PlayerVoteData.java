package com.palmergames.bukkit.towny.object.governanceobjects;

import java.util.UUID;

/// Data container class that contains a player's vote.
public class PlayerVoteData {
	public PlayerVoteData(UUID player, int vote) {this.player = player; this.vote = vote;}
	
	private UUID player;
	private int vote;

	public UUID getPlayer() {
		return player;
	}
	
	public int getVote()
	{
		return vote;
	}
}
