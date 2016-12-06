package com.jcs.vpc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class RouteTable implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private List<Route> routeSet = new ArrayList<Route>();
	private String routeTableId;
	private String vpcId;
	
	public RouteTable(){
	}

	public RouteTable(List<Route> routeSet, String routeTableId, String vpcId) {
		super();
		this.routeSet = routeSet;
		this.routeTableId = routeTableId;
		this.vpcId = vpcId;
	}

	public List<Route> getRouteSet() {
		return routeSet;
	}

	public void setRouteSet(List<Route> routeSet) {
		this.routeSet = routeSet;
	}

	public String getRouteTableId() {
		return routeTableId;
	}

	public void setRouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}
	
	public RouteTable withRouteSet(List<Route> routeSet){
		setRouteSet(routeSet);
		return this;
	}
	
	public RouteTable withRouteTableId(String routetableId){
		setRouteTableId(routetableId);
		return this;
	}
	
	public RouteTable withVpcId(String vpcId){
		setVpcId(vpcId);
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
		result = prime * result + ((routeSet == null) ? 0 : routeSet.hashCode());
		result = prime * result + ((routeTableId == null) ? 0 : routeTableId.hashCode());
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
		RouteTable other = (RouteTable) obj;
		if (routeSet == null) {
			if (other.routeSet != null)
				return false;
		} else if (!routeSet.equals(other.routeSet))
			return false;
		if (routeTableId == null) {
			if (other.routeTableId != null)
				return false;
		} else if (!routeTableId.equals(other.routeTableId))
			return false;
		if (vpcId == null) {
			if (other.vpcId != null)
				return false;
		} else if (!vpcId.equals(other.vpcId))
			return false;
		return true;
	}
	
	@Override
	public RouteTable clone() {
		try {
			return (RouteTable) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
