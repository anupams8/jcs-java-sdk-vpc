package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DescribeAddressesRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	
	public DescribeAddressesRequest() {
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	@Override
	public DescribeAddressesRequest clone() {
		try {
			return (DescribeAddressesRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
