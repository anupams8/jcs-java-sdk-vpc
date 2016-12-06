package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * Request class for create snapshot operation.
 */
public class CreateVpcRequest extends JCSRequest implements Serializable, Cloneable {

	private static final long serialVersionUID = 6961306238384964459L;

	private String cidrBlock;

	/**
	 * Default constructor for CreateVpcRequest object.
	 */
	public CreateVpcRequest() {
	}

	/**
	 * Creates CreateVpcRequest object from cidrBlock
	 * 
	 * @param cidrBlock
	 *            uses cidr
	 */
	public CreateVpcRequest(String cidrBlock) {
		setCidrBlock(cidrBlock);
	}

	/**
	 * Documentation
	 * 
	 * @param cidrBlock
	 */
	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	/**
	* 
	*/
	public String getCidrBlock() {
		return this.cidrBlock;
	}

	/**
	 * 
	 * @param cidrBlock
	 * @return
	 */
	public CreateVpcRequest withCidrBlock(String cidrBlock) {
		setCidrBlock(cidrBlock);
		return this;
	}

	/**
	 * 
	 */

	public String toString() {
		return new Gson().toJson(this);
	}

	/**
	 * 
	 */
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cidrBlock == null) ? 0 : cidrBlock.hashCode());
		return result;
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateVpcRequest other = (CreateVpcRequest) obj;
		if (cidrBlock == null) {
			if (other.cidrBlock != null)
				return false;
		} else if (!cidrBlock.equals(other.cidrBlock))
			return false;
		return true;
	}

	@Override
	public CreateVpcRequest clone() {
		try {
			return (CreateVpcRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}