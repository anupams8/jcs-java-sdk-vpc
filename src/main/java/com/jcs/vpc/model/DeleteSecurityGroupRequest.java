package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DeleteSecurityGroupRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
    private String groupId;
	
	public DeleteSecurityGroupRequest(){
	}
	
	public DeleteSecurityGroupRequest(String groupId) {
		super();
		this.groupId = groupId;
	}

	public String getgroupId() {
		return groupId;
	}

	public void setgroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
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
		DeleteSecurityGroupRequest other = (DeleteSecurityGroupRequest) obj;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		return true;
	}

	@Override
	public DeleteSecurityGroupRequest clone() {
		try {
			return (DeleteSecurityGroupRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}


}
