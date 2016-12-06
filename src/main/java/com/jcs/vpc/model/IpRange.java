package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class IpRange implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private String cidrIP;
	
	public IpRange(){
	}

	public IpRange(String cidrIP) {
		super();
		this.cidrIP = cidrIP;
	}

	public String getCidrIP() {
		return cidrIP;
	}

	public void setCidrIP(String cidrIP) {
		this.cidrIP = cidrIP;
	}
	
	public IpRange withCidrIp(String cidrIp){
		setCidrIP(cidrIp);
		return this;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidrIP == null) ? 0 : cidrIP.hashCode());
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
		IpRange other = (IpRange) obj;
		if (cidrIP == null) {
			if (other.cidrIP != null)
				return false;
		} else if (!cidrIP.equals(other.cidrIP))
			return false;
		return true;
	}
	
	@Override
	public IpRange clone() {
		try {
			return (IpRange) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}


}
