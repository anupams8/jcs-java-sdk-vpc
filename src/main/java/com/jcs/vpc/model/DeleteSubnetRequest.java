package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DeleteSubnetRequest extends JCSRequest implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private String subnetId;

	public DeleteSubnetRequest() {
	}

	public DeleteSubnetRequest(String subnetId) {
		super();
		this.subnetId = subnetId;
	}

	public String getSubnetId() {
		return subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}

	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subnetId == null) ? 0 : subnetId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeleteSubnetRequest other = (DeleteSubnetRequest) obj;
		if (subnetId == null) {
			if (other.subnetId != null)
				return false;
		} else if (!subnetId.equals(other.subnetId))
			return false;
		return true;
	}

	@Override
	public DeleteSubnetRequest clone() {
		try {
			return (DeleteSubnetRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
