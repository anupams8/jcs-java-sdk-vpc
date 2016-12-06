package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateSecurityGroupResult extends JCSResult implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private boolean _return;
	private String groupId;
	
	public CreateSecurityGroupResult() {
	}

	public CreateSecurityGroupResult(boolean _return, String groupId) {
		super();
		this._return = _return;
		this.groupId = groupId;
	}

	public boolean isReturn() {
		return _return;
	}

	public void setReturn(boolean _return) {
		this._return = _return;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	public CreateSecurityGroupResult withReturn(boolean _return){
		setReturn(_return);
		return this;
	}
	
	public CreateSecurityGroupResult withGroupId(String groupId){
		setGroupId(groupId);
		return this;
	}
	
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (_return ? 1231 : 1237);
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
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
		CreateSecurityGroupResult other = (CreateSecurityGroupResult) obj;
		if (_return != other._return)
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		return true;
	}
	
	@Override
	public CreateSecurityGroupResult clone() {
		try {
			return (CreateSecurityGroupResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
	

}
