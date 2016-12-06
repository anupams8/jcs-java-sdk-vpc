package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class SecurityGroupInfo implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private String vpcId;
	private String groupId;
	private List<IpPermissionDescribe> ipPermissions = new ArrayList<IpPermissionDescribe>();
	private String groupName;
	private List<IpPermissionDescribe> ipPermissionsEgress = new ArrayList<IpPermissionDescribe>();
	private String groupDescription;
	
	public SecurityGroupInfo(){
	}

	public SecurityGroupInfo(String vpcId, String groupId, List<IpPermissionDescribe> ipPermissions, String groupName,
			List<IpPermissionDescribe> ipPermissionsEgress, String groupDescription) {
		super();
		this.vpcId = vpcId;
		this.groupId = groupId;
		this.ipPermissions = ipPermissions;
		this.groupName = groupName;
		this.ipPermissionsEgress = ipPermissionsEgress;
		this.groupDescription = groupDescription;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<IpPermissionDescribe> getIpPermissions() {
		return ipPermissions;
	}

	public void setIpPermissions(List<IpPermissionDescribe> ipPermissions) {
		this.ipPermissions = ipPermissions;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<IpPermissionDescribe> getIpPermissionsEgress() {
		return ipPermissionsEgress;
	}

	public void setIpPermissionsEgress(List<IpPermissionDescribe> ipPermissionsEgress) {
		this.ipPermissionsEgress = ipPermissionsEgress;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
	
	public SecurityGroupInfo withVpcId(String vpcId){
		setVpcId(vpcId);
		return this;
	}
	
	public SecurityGroupInfo withGroupId(String groupId){
		setGroupId(vpcId);
		return this;
	}
	
	public SecurityGroupInfo withIpPermissions(List<IpPermissionDescribe> ipPermissions){
		setIpPermissions(ipPermissions);
		return this;
	}
	
	public SecurityGroupInfo withGroupName(String groupName){
		setGroupName(groupName);
		return this;
	}
	
	public SecurityGroupInfo withIpPermissionsEgress(List<IpPermissionDescribe> ipPermissionsEgress){
		setIpPermissions(ipPermissionsEgress);
		return this;
	}
	
	
	public String toString() {
		return new Gson().toJson(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupDescription == null) ? 0 : groupDescription.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		result = prime * result + ((ipPermissions == null) ? 0 : ipPermissions.hashCode());
		result = prime * result + ((ipPermissionsEgress == null) ? 0 : ipPermissionsEgress.hashCode());
		result = prime * result + ((vpcId == null) ? 0 : vpcId.hashCode());
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
		SecurityGroupInfo other = (SecurityGroupInfo) obj;
		if (groupDescription == null) {
			if (other.groupDescription != null)
				return false;
		} else if (!groupDescription.equals(other.groupDescription))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		if (ipPermissions == null) {
			if (other.ipPermissions != null)
				return false;
		} else if (!ipPermissions.equals(other.ipPermissions))
			return false;
		if (ipPermissionsEgress == null) {
			if (other.ipPermissionsEgress != null)
				return false;
		} else if (!ipPermissionsEgress.equals(other.ipPermissionsEgress))
			return false;
		if (vpcId == null) {
			if (other.vpcId != null)
				return false;
		} else if (!vpcId.equals(other.vpcId))
			return false;
		return true;
	}

	@Override
	public SecurityGroupInfo clone() {
		try {
			return (SecurityGroupInfo) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
	

}
