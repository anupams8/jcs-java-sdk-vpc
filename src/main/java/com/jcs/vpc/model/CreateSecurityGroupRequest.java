package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateSecurityGroupRequest extends JCSRequest implements Serializable, Cloneable {	
	private static final long serialVersionUID = 1L;
	private String groupName;
	private String groupDescription;
	private String vpcId;
	
	public CreateSecurityGroupRequest() {
	}
	
	public CreateSecurityGroupRequest(String groupName, String groupDescription, String vpcId) {
		super();
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.vpcId = vpcId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}
	
	public String toString() {
		return new Gson().toJson(this);
	}
	
	public CreateSecurityGroupRequest withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}
	
	public CreateSecurityGroupRequest withGroupDescription(String groupDescription) {
		setGroupDescription(groupDescription);
		return this;
	}
	
	public CreateSecurityGroupRequest withVpcId(String vpcId) {
		setVpcId(groupName);
		return this;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((groupDescription == null) ? 0 : groupDescription.hashCode());
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		result = prime * result + ((vpcId == null) ? 0 : vpcId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateSecurityGroupRequest other = (CreateSecurityGroupRequest) obj;
		if (groupDescription == null) {
			if (other.groupDescription != null)
				return false;
		} else if (!groupDescription.equals(other.groupDescription))
			return false;
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		if (vpcId == null) {
			if (other.vpcId != null)
				return false;
		} else if (!vpcId.equals(other.vpcId))
			return false;
		return true;
	}

	@Override
	public CreateSecurityGroupRequest clone() {
		try {
			return (CreateSecurityGroupRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
