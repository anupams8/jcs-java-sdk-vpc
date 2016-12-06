package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class ReleaseAddressRequest extends JCSRequest implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private String allocationId;
	
	public ReleaseAddressRequest(){
	}

	public ReleaseAddressRequest(String allocationId) {
		super();
		this.allocationId = allocationId;
	}

	public String getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	public ReleaseAddressRequest withAllocatioId(String allocationId){
		setAllocationId(allocationId);
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
		result = prime * result + ((allocationId == null) ? 0 : allocationId.hashCode());
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
		ReleaseAddressRequest other = (ReleaseAddressRequest) obj;
		if (allocationId == null) {
			if (other.allocationId != null)
				return false;
		} else if (!allocationId.equals(other.allocationId))
			return false;
		return true;
	}

	@Override
	public ReleaseAddressRequest clone() {
		try {
			return (ReleaseAddressRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
