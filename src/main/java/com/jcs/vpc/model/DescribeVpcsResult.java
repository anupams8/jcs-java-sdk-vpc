package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DescribeVpcsResult extends JCSResult implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private List<Vpc> vpcSet = new ArrayList<Vpc>();

	public DescribeVpcsResult() {

	}

	public DescribeVpcsResult(List<Vpc> vpcSet) {
		super();
		this.vpcSet = vpcSet;
	}

	public List<Vpc> getVpcSet() {
		return vpcSet;
	}

	public void setVpcSet(List<Vpc> vpcSet) {
		this.vpcSet = vpcSet;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((vpcSet == null) ? 0 : vpcSet.hashCode());
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
		DescribeVpcsResult other = (DescribeVpcsResult) obj;
		if (vpcSet == null) {
			if (other.vpcSet != null)
				return false;
		} else if (!vpcSet.equals(other.vpcSet))
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
