package com.jcs.vpc.service;

import com.jcs.vpc.model.CreateSubnetRequest;
import com.jcs.vpc.model.CreateSubnetResult;
import com.jcs.vpc.model.CreateVpcRequest;
import com.jcs.vpc.model.CreateVpcResult;
import com.jcs.vpc.model.DeleteSubnetRequest;
import com.jcs.vpc.model.DeleteSubnetResult;
import com.jcs.vpc.model.DeleteVpcRequest;
import com.jcs.vpc.model.DeleteVpcResult;
import com.jcs.vpc.model.DescribeSubnetsRequest;
import com.jcs.vpc.model.DescribeSubnetsResult;
import com.jcs.vpc.model.DescribeVpcsRequest;
import com.jcs.vpc.model.DescribeVpcsResult;


/**
 * Interface containing methods that provides access to the operations supported
 * by JCS SBS. The supported operations are create, describe and delete on
 * volume and snapshot.
 */
public interface JCSCompute {
	
	public void setEndpoint(String endpoint);

    public CreateVpcResult createVpc(CreateVpcRequest createVpcRequest) throws Exception;
    public DeleteVpcResult deleteVpc(DeleteVpcRequest deleteVpcRequest) throws Exception;
    public DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest) throws Exception;
    public CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest) throws Exception;
    public DeleteSubnetResult deleteSubnet(DeleteSubnetRequest deleteSubnetRequest) throws Exception;
    public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest) throws Exception;
}
