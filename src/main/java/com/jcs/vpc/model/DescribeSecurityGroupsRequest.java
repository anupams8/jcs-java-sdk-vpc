package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DescribeSecurityGroupsRequest extends JCSRequest implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
private List<String> groupIds = new ArrayList<String>();
	
	public DescribeSecurityGroupsRequest(){
		
	}

	public DescribeSecurityGroupsRequest(List<String> groupIds) {
		super();
		this.groupIds = groupIds;
	}

	public List<String> getSubnetIds() {
		return groupIds;
	}

	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public DescribeSecurityGroupsRequest withGroupIds(List<String> groupIds){
		setGroupIds(groupIds);
		return this;
	}
	
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((groupIds == null) ? 0 : groupIds.hashCode());
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
		DescribeSecurityGroupsRequest other = (DescribeSecurityGroupsRequest) obj;
		if (groupIds == null) {
			if (other.groupIds != null)
				return false;
		} else if (!groupIds.equals(other.groupIds))
			return false;
		return true;
	}
	
	@Override
	public DescribeSecurityGroupsResult clone() {
		try {
			return (DescribeSecurityGroupsResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
