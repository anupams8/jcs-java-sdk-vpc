package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class IpPermission implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private int fromPort;
	private int toPort;
	private String ipProtocol;
	private List<IpRange> ipRanges = new ArrayList<IpRange>();
	private List<Group> groups = new ArrayList<Group>();
	
	public IpPermission(){
	}

	public IpPermission(int fromPort, int toPort, String ipProtocol, List<IpRange> ipRanges, List <Group>groups ) {
		super();
		this.fromPort = fromPort;
		this.toPort = toPort;
		this.ipProtocol = ipProtocol;
		this.ipRanges = ipRanges;
		this.groups = groups;
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

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public IpPermission withFromPort(int fromPort){
		setFromPort(fromPort);
		return this;
	}

	public IpPermission withToPort(int toPort){
		setFromPort(toPort);
		return this;
	}
	
	public IpPermission withIpProtocol(String ipProtocol){
		setIpProtocol(ipProtocol);
		return this;
	}
	
	public IpPermission withIpRanges(List<IpRange> ipRanges){
		setIpRanges(ipRanges);
		return this;
	}
	
	public IpPermission withGroups(List<Group> groups){
		setGroups(groups);
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
		result = prime * result + fromPort;
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
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
		IpPermission other = (IpPermission) obj;
		if (fromPort != other.fromPort)
			return false;
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
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
	public IpPermission clone() {
		try {
			return (IpPermission) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
	

}
