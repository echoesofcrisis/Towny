package com.palmergames.bukkit.towny.object.governance;

/// Data container class for policies, containing the policy data and policy value as an integer.
public class Policy {
	public Policy(PolicyData data, int value) { this.data = data; this.value = value;}
	
	private PolicyData data;
	/// Which 'value' of the policy is selected. Arbitrary, depends on the policy.
	private int value;

	public PolicyData getData() {
		return data;
	}

	public int getValue() {
		return value;
	}
}
