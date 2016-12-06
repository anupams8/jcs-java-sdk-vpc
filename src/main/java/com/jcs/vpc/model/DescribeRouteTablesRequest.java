package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DescribeRouteTablesRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	public DescribeRouteTablesRequest() {
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public DescribeRouteTablesRequest clone() {
		try {
			return (DescribeRouteTablesRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
