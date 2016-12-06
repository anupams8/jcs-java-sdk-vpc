package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateVpcResult extends JCSResult implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private String requestId;
	private Vpc vpc;

	public CreateVpcResult() {

	}

	public CreateVpcResult(String requestId, Vpc vpc) {
		super();
		// this.requestId = requestId;
		this.vpc = vpc;
	}

	public Vpc getVpc() {
		return vpc;
	}

	public void setVpc(Vpc vpc) {
		this.vpc = vpc;
	}

	public CreateVpcResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	public CreateVpcResult withVpc(Vpc vpc) {
		setVpc(vpc);
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
		result = prime * result + ((vpc == null) ? 0 : vpc.hashCode());
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
		CreateVpcResult other = (CreateVpcResult) obj;
		if (vpc == null) {
			if (other.vpc != null)
				return false;
		} else if (!vpc.equals(other.vpc))
			return false;
		return true;
	}

	@Override
	public CreateVpcResult clone() {
		try {
			return (CreateVpcResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
