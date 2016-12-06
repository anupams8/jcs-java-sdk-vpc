package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class AssociateAddressRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String allocationId;
	private String instanceId;
	
	public AssociateAddressRequest() {	
	}

	public AssociateAddressRequest(String allocationId, String instanceId) {
		super();
		this.allocationId = allocationId;
		this.instanceId = instanceId;
	}

	public String getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public AssociateAddressRequest withAllocationId(String allocationId){
		setAllocationId(allocationId);
		return this;
	}
	
	public AssociateAddressRequest withInstanceId(String instanceId){
		setInstanceId(instanceId);
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
		result = prime * result + ((instanceId == null) ? 0 : instanceId.hashCode());
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
		AssociateAddressRequest other = (AssociateAddressRequest) obj;
		if (allocationId == null) {
			if (other.allocationId != null)
				return false;
		} else if (!allocationId.equals(other.allocationId))
			return false;
		if (instanceId == null) {
			if (other.instanceId != null)
				return false;
		} else if (!instanceId.equals(other.instanceId))
			return false;
		return true;
	}

	@Override
	public AssociateAddressRequest clone() {
		try {
			return (AssociateAddressRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
