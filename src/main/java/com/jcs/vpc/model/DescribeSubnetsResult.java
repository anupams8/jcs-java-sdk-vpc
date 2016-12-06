package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DescribeSubnetsResult extends JCSResult implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private List<Subnet> subnetSet = new ArrayList<Subnet>();
	
	public DescribeSubnetsResult() {
		
	}

	public DescribeSubnetsResult(List<Subnet> subnetSet) {
		super();
		this.subnetSet = subnetSet;
	}

	public List<Subnet> getSubnetSet() {
		return subnetSet;
	}

	public void setSubnetSet(List<Subnet> subnetSet) {
		this.subnetSet = subnetSet;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subnetSet == null) ? 0 : subnetSet.hashCode());
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
		DescribeSubnetsResult other = (DescribeSubnetsResult) obj;
		if (subnetSet == null) {
			if (other.subnetSet != null)
				return false;
		} else if (!subnetSet.equals(other.subnetSet))
			return false;
		return true;
	}
	
	@Override
	public DescribeVpcsResult clone() {
		try {
			return (DescribeVpcsResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
