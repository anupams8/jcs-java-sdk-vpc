package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DescribeAddressesResult extends JCSResult implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String requestId;
	private List<Address> addressesSet = new ArrayList<Address>();
	
	public DescribeAddressesResult() {
	}

	public DescribeAddressesResult(String requestId, List<Address> addressesSet) {
		super();
		this.requestId = requestId;
		this.addressesSet = addressesSet;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Address> getAddressesSet() {
		return addressesSet;
	}

	public void setAddressesSet(List<Address> addressesSet) {
		this.addressesSet = addressesSet;
	}
	
	public DescribeAddressesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	public DescribeAddressesResult withAddressesSet(List<Address> addressesSet) {
		setAddressesSet(addressesSet);
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
		result = prime * result + ((addressesSet == null) ? 0 : addressesSet.hashCode());
		result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
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
		DescribeAddressesResult other = (DescribeAddressesResult) obj;
		if (addressesSet == null) {
			if (other.addressesSet != null)
				return false;
		} else if (!addressesSet.equals(other.addressesSet))
			return false;
		if (requestId == null) {
			if (other.requestId != null)
				return false;
		} else if (!requestId.equals(other.requestId))
			return false;
		return true;
	}

	@Override
	public DescribeAddressesResult clone() {
		try {
			return (DescribeAddressesResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
