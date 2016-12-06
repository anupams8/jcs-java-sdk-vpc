package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class AllocateAddressRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String domain;
	
	
   public AllocateAddressRequest(){
   }
	
	public AllocateAddressRequest(String domain) {
		super();
		this.domain = domain;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
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
		AllocateAddressRequest other = (AllocateAddressRequest) obj;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		return true;
	}

	@Override
	public AllocateAddressRequest clone() {
		try {
			return (AllocateAddressRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
