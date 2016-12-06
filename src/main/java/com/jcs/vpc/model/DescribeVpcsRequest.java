package com.jcs.vpc.model;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DescribeVpcsRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private List<String> vpcIds = new ArrayList<String>();

	public DescribeVpcsRequest() {

	}

	public DescribeVpcsRequest(List<String> vpcIds) {
		super();
		this.vpcIds = vpcIds;
	}

	public List<String> getVpcIds() {
		return vpcIds;
	}

	public void setVpcIds(List<String> vpcIds) {
		this.vpcIds = vpcIds;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((vpcIds == null) ? 0 : vpcIds.hashCode());
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
		DescribeVpcsRequest other = (DescribeVpcsRequest) obj;
		if (vpcIds == null) {
			if (other.vpcIds != null)
				return false;
		} else if (!vpcIds.equals(other.vpcIds))
			return false;
		return true;
	}

	@Override
	public DescribeVpcsRequest clone() {
		try {
			return (DescribeVpcsRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
	

}
