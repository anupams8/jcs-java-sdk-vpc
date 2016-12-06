package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DescribeRouteTablesResult extends JCSResult implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private List<RouteTable> routeTableSet = new ArrayList<RouteTable>();
	
	public DescribeRouteTablesResult() {
	}

	public DescribeRouteTablesResult(List<RouteTable> routeTableSet) {
		super();
		this.routeTableSet = routeTableSet;
	}

	public List<RouteTable> getRouteTableSet() {
		return routeTableSet;
	}

	public void setRouteTableSet(List<RouteTable> routeTableSet) {
		this.routeTableSet = routeTableSet;
	}
	
	public DescribeRouteTablesResult withRouteTableSet(List<RouteTable> routeTableSet) {
		setRouteTableSet(routeTableSet);
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
		result = prime * result + ((routeTableSet == null) ? 0 : routeTableSet.hashCode());
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
		DescribeRouteTablesResult other = (DescribeRouteTablesResult) obj;
		if (routeTableSet == null) {
			if (other.routeTableSet != null)
				return false;
		} else if (!routeTableSet.equals(other.routeTableSet))
			return false;
		return true;
	}

	@Override
	public DescribeRouteTablesResult clone() {
		try {
			return (DescribeRouteTablesResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
