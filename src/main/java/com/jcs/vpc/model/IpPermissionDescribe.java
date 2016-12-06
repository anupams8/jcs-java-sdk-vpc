package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class IpPermissionDescribe implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private int fromPort;
	private int toPort;
	private String ipProtocol;
	private List<IpRange> ipRanges = new ArrayList<IpRange>();
	
	
	public IpPermissionDescribe(){
	}

	public IpPermissionDescribe(int fromPort, int toPort, String ipProtocol, List<IpRange> ipRanges ) {
		super();
		this.fromPort = fromPort;
		this.toPort = toPort;
		this.ipProtocol = ipProtocol;
		this.ipRanges = ipRanges;
		
	}

	public int getFromPort() {
		return fromPort;
	}

	public void setFromPort(int fromPort) {
		this.fromPort = fromPort;
	}

	public int getToPort() {
		return toPort;
	}

	public void setToPort(int toPort) {
		this.toPort = toPort;
	}

	public String getIpProtocol() {
		return ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
	}

	public List<IpRange> getIpRanges() {
		return ipRanges;
	}

	public void setIpRanges(List<IpRange> ipRanges) {
		this.ipRanges = ipRanges;
	}

	

	public IpPermissionDescribe withFromPort(int fromPort){
		setFromPort(fromPort);
		return this;
	}

	public IpPermissionDescribe withToPort(int toPort){
		setFromPort(toPort);
		return this;
	}
	
	public IpPermissionDescribe withIpProtocol(String ipProtocol){
		setIpProtocol(ipProtocol);
		return this;
	}
	
	public IpPermissionDescribe withIpRanges(List<IpRange> ipRanges){
		setIpRanges(ipRanges);
		return this;
	}
	
	
	
	public String toString() {
		return new Gson().toJson(this);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fromPort;
		result = prime * result + ((ipProtocol == null) ? 0 : ipProtocol.hashCode());
		result = prime * result + ((ipRanges == null) ? 0 : ipRanges.hashCode());
		result = prime * result + toPort;
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
		IpPermissionDescribe other = (IpPermissionDescribe) obj;
		if (fromPort != other.fromPort)
			return false;
		if (ipProtocol == null) {
			if (other.ipProtocol != null)
				return false;
		} else if (!ipProtocol.equals(other.ipProtocol))
			return false;
		if (ipRanges == null) {
			if (other.ipRanges != null)
				return false;
		} else if (!ipRanges.equals(other.ipRanges))
			return false;
		if (toPort != other.toPort)
			return false;
		return true;
	}
	
	@Override
	public IpPermissionDescribe clone() {
		try {
			return (IpPermissionDescribe) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
	

}
