package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DeleteRouteRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String RouteTableId;
	private String DestinationCidrBlock;
	
	public DeleteRouteRequest(){
		
	}
	
	public DeleteRouteRequest(String routeTableId, String destinationCidrBlock) {
		super();
		RouteTableId = routeTableId;
		DestinationCidrBlock = destinationCidrBlock;
	}
	
	public String getRouteTableId() {
		return RouteTableId;
	}

	public void setRouteTableId(String routeTableId) {
		RouteTableId = routeTableId;
	}

	public String getDestinationCidrBlock() {
		return DestinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		DestinationCidrBlock = destinationCidrBlock;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((DestinationCidrBlock == null) ? 0 : DestinationCidrBlock.hashCode());
		result = prime * result + ((RouteTableId == null) ? 0 : RouteTableId.hashCode());
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
		DeleteRouteRequest other = (DeleteRouteRequest) obj;
		if (DestinationCidrBlock == null) {
			if (other.DestinationCidrBlock != null)
				return false;
		} else if (!DestinationCidrBlock.equals(other.DestinationCidrBlock))
			return false;
		if (RouteTableId == null) {
			if (other.RouteTableId != null)
				return false;
		} else if (!RouteTableId.equals(other.RouteTableId))
			return false;
		return true;
	}

	@Override
	public DeleteRouteRequest clone() {
		try {
			return (DeleteRouteRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
