package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DescribeSecurityGroupsResult extends JCSResult implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private List<SecurityGroupInfo> securityGroupInfo = new ArrayList<SecurityGroupInfo>();
	
	public DescribeSecurityGroupsResult(){
	}

	public DescribeSecurityGroupsResult(List<SecurityGroupInfo> securityGroupInfo) {
		super();
		this.securityGroupInfo = securityGroupInfo;
	}

	public List<SecurityGroupInfo> getSecurityGroupInfo() {
		return securityGroupInfo;
	}

	public void setSecurityGroupInfo(List<SecurityGroupInfo> securityGroupInfo) {
		this.securityGroupInfo = securityGroupInfo;
	}
	
	public DescribeSecurityGroupsResult withSecurityGroupInfo(List<SecurityGroupInfo> securityGroupInfo){
		setSecurityGroupInfo(securityGroupInfo);
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((securityGroupInfo == null) ? 0 : securityGroupInfo.hashCode());
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
		DescribeSecurityGroupsResult other = (DescribeSecurityGroupsResult) obj;
		if (securityGroupInfo == null) {
			if (other.securityGroupInfo != null)
				return false;
		} else if (!securityGroupInfo.equals(other.securityGroupInfo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
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
