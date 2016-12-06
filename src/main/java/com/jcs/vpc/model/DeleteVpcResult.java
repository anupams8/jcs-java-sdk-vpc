package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DeleteVpcResult extends JCSResult implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private boolean _return;

	public DeleteVpcResult() {

	}

	public DeleteVpcResult(Boolean _return) {
		super();
		this._return = _return;
	}

	public Boolean isReturn() {
		return _return;
	}

	public void setReturn(Boolean _return) {
		this._return = _return;
	}

	public DeleteVpcResult withReturn(boolean _return) {
    	setReturn(_return);
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
		result = prime * result + (_return ? 1231 : 1237);
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
		DeleteVpcResult other = (DeleteVpcResult) obj;
		if (_return != other._return)
			return false;
		return true;
	}

	@Override
	public DeleteVpcResult clone() {
		try {
			return (DeleteVpcResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}