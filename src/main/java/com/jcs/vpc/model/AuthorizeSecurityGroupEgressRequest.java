package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class AuthorizeSecurityGroupEgressRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
    private String groupId;
    List <IpPermission> ipPermissions = new ArrayList<IpPermission>();
    
    public AuthorizeSecurityGroupEgressRequest(){
    	
    }

	public AuthorizeSecurityGroupEgressRequest(String groupId, List<IpPermission> ipPermissions) {
		super();
		this.groupId = groupId;
		this.ipPermissions = ipPermissions;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<IpPermission> getIpPermissions() {
		return ipPermissions;
	}

	public void setIpPermissions(List<IpPermission> ipPermissions) {
		this.ipPermissions = ipPermissions;
	}

	public AuthorizeSecurityGroupEgressRequest withGroupId(String groupId){
		setGroupId(groupId);
		return this;
	}
	
	public AuthorizeSecurityGroupEgressRequest withIpPermissions(List<IpPermission> ipPermissions){
		setIpPermissions(ipPermissions);
		return this;
	}
		
	public String toString() {
		return new Gson().toJson(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((ipPermissions == null) ? 0 : ipPermissions.hashCode());
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
		AuthorizeSecurityGroupEgressRequest other = (AuthorizeSecurityGroupEgressRequest) obj;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (ipPermissions == null) {
			if (other.ipPermissions != null)
				return false;
		} else if (!ipPermissions.equals(other.ipPermissions))
			return false;
		return true;
	}
	
	@Override
	public AuthorizeSecurityGroupEgressRequest clone() {
		try {
			return (AuthorizeSecurityGroupEgressRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
    
}
