package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DescribeSubnetsRequest extends JCSRequest implements Serializable, Cloneable  {
	private static final long serialVersionUID = 1L;
	private List<String> subnetIds = new ArrayList<String>();
	
	public DescribeSubnetsRequest(){
		
	}

	public DescribeSubnetsRequest(List<String> subnetIds) {
		super();
		this.subnetIds = subnetIds;
	}

	public List<String> getSubnetIds() {
		return subnetIds;
	}

	public void setSubnetIds(List<String> subnetIds) {
		this.subnetIds = subnetIds;
	}
	
	public DescribeSubnetsRequest withSubnetIds(List<String> subnetIds){
		setSubnetIds(subnetIds);
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
		result = prime * result + ((subnetIds == null) ? 0 : subnetIds.hashCode());
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
		DescribeSubnetsRequest other = (DescribeSubnetsRequest) obj;
		if (subnetIds == null) {
			if (other.subnetIds != null)
				return false;
		} else if (!subnetIds.equals(other.subnetIds))
			return false;
		return true;
	}
	
	@Override
	public DescribeSubnetsResult clone() {
		try {
			return (DescribeSubnetsResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
