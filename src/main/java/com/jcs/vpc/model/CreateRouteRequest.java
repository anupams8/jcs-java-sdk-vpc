package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateRouteRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String destinationCidrBlock;
	private String routeTableId;
    private String instanceId;
    
    public CreateRouteRequest() {
	}

	public CreateRouteRequest(String destinationCidrBlock, String routeTableId, String instanceId) {
		super();
		this.destinationCidrBlock = destinationCidrBlock;
		this.routeTableId = routeTableId;
		this.instanceId = instanceId;
	}

	public String getDestinationCidrBlock() {
		return destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
	}

	public String getRouteTableId() {
		return routeTableId;
	}

	public void setRouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
    
	public CreateRouteRequest withDestinationCidrBlock(String destinationCidrBlock){
		setDestinationCidrBlock(destinationCidrBlock);
		return this;
	}
	
	public CreateRouteRequest withRouteTableId(String routeTableId){
		setRouteTableId(routeTableId);
		return this;
	}
	
	public CreateRouteRequest withInstanceId(String instanceId){
		setInstanceId(instanceId);
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
		result = prime * result + ((destinationCidrBlock == null) ? 0 : destinationCidrBlock.hashCode());
		result = prime * result + ((instanceId == null) ? 0 : instanceId.hashCode());
		result = prime * result + ((routeTableId == null) ? 0 : routeTableId.hashCode());
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
		CreateRouteRequest other = (CreateRouteRequest) obj;
		if (destinationCidrBlock == null) {
			if (other.destinationCidrBlock != null)
				return false;
		} else if (!destinationCidrBlock.equals(other.destinationCidrBlock))
			return false;
		if (instanceId == null) {
			if (other.instanceId != null)
				return false;
		} else if (!instanceId.equals(other.instanceId))
			return false;
		if (routeTableId == null) {
			if (other.routeTableId != null)
				return false;
		} else if (!routeTableId.equals(other.routeTableId))
			return false;
		return true;
	}

	@Override
	public CreateRouteRequest clone() {
		try {
			return (CreateRouteRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
