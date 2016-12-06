package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class Route implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private String origin;
	private String destinationCidrBlock;
	
	public Route(){
	}

	public Route(String origin, String destinationCidrBlock) {
		super();
		this.origin = origin;
		this.destinationCidrBlock = destinationCidrBlock;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestinationCidrBlock() {
		return destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
	}
	
	public Route withOrigin(String origin){
		setOrigin(origin);
		return this;
	}
	
	public Route withDestinationCidrBlock(String destinationCidrBlock){
		setDestinationCidrBlock(destinationCidrBlock);
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
		result = prime * result + ((destinationCidrBlock == null) ? 0 : destinationCidrBlock.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
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
		Route other = (Route) obj;
		if (destinationCidrBlock == null) {
			if (other.destinationCidrBlock != null)
				return false;
		} else if (!destinationCidrBlock.equals(other.destinationCidrBlock))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

	@Override
	public Route clone() {
		try {
			return (Route) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
	
	

}
