package com.jcs.vpc.main;


import java.util.ArrayList;
import java.util.List;

import com.jcs.sbs.auth.DefaultJCSCredentialsProviderChain;
import com.jcs.sbs.auth.JCSCredentials;
import com.jcs.sbs.auth.JCSCredentialsProvider;
import com.jcs.sbs.exceptions.PropertyNotFoundException;
import com.jcs.vpc.model.CreateSubnetRequest;
import com.jcs.vpc.model.CreateSubnetResult;
import com.jcs.vpc.model.CreateVpcRequest;
import com.jcs.vpc.model.CreateVpcResult;
import com.jcs.vpc.model.DeleteSubnetRequest;
import com.jcs.vpc.model.DeleteSubnetResult;
import com.jcs.vpc.model.DeleteVpcRequest;
import com.jcs.vpc.model.DeleteVpcResult;
import com.jcs.vpc.model.DescribeVpcsRequest;
import com.jcs.vpc.model.DescribeVpcsResult;
import com.jcs.vpc.service.JCSCompute;
import com.jcs.vpc.service.impl.JCSComputeClient;

/**
 * Class containing main() method. This serves as an example code for using this
 * SDK.
 */
public class JCStry {

    static JCSCompute jcs;

    /**
     * Default constructor for this class.
     */
    public JCStry() {
    }

    /**
     * Method to initialize JCSCompute object with its implementation class.
     * 
     * @throws PropertyNotFoundException
     */
    private static void init() throws PropertyNotFoundException {

        JCSCredentialsProvider credentialsProviders = new DefaultJCSCredentialsProviderChain();
        JCSCredentials credentials = credentialsProviders.getCredentials();
        jcs = new JCSComputeClient(credentials);

    }

    /**
     * Main method from where SDK can run (to serve as a demo)
     * 
     * @param args
     *            Command line arguments (not required in the method)
     */
    public static void main(String[] args) {

        try {

            init();
            
            
            List<String> vpcIds = new ArrayList<String>();
            String vpcId;
            String cidrBlock;
            String subnetId;
            cidrBlock = "8.8.0.0/16";
            List<String> subnetIds = new ArrayList<String>();
     
            CreateVpcRequest createVpcRequest = new CreateVpcRequest();
            createVpcRequest.setCidrBlock(cidrBlock);
            CreateVpcResult createVpcResult;
            DeleteVpcRequest deleteVpcRequest = new DeleteVpcRequest();
            DeleteVpcResult deleteVpcResult;
            /*            
            createVpcResult = jcs.createVpc(createVpcRequest);
            System.out.println(createVpcResult.toString());
            vpcId = createVpcResult.getVpc().getVpcId();
            vpcIds.add(vpcId);
            
            
            deleteVpcRequest.setVpcId(vpcId);
            deleteVpcResult = jcs.deleteVpc(deleteVpcRequest);
            System.out.println(deleteVpcResult);
            
            DescribeVpcsRequest describeVpcsRequest = new DescribeVpcsRequest();
            DescribeVpcsResult describeVpcsResult = jcs.describeVpcs(describeVpcsRequest);
            System.out.println(describeVpcsResult);
            */
            
            createVpcResult = jcs.createVpc(createVpcRequest);
            System.out.println(createVpcResult.toString());
            vpcId = createVpcResult.getVpc().getVpcId();
            cidrBlock = "8.8.1.0/24";
            CreateSubnetRequest createSubnetRequest = new CreateSubnetRequest();
            createSubnetRequest.setVpcId(vpcId);
            createSubnetRequest.setCidrBlock(cidrBlock);
            CreateSubnetResult createSubnetResult = jcs.createSubnet(createSubnetRequest);
            subnetId = createSubnetResult.getSubnet().getSubnetId();
            subnetIds.add(subnetId);
            System.out.println(createSubnetResult);
          
            System.out.println("created subnet id"+subnetId);
            
            cidrBlock = "8.8.2.0/24";
            createSubnetRequest.setCidrBlock(cidrBlock);
            createSubnetResult = jcs.createSubnet(createSubnetRequest);
            subnetId = createSubnetResult.getSubnet().getSubnetId();
            subnetIds.add(subnetId);
            System.out.println(createSubnetResult);
          
            
            DeleteSubnetRequest deleteSubnetRequest = new DeleteSubnetRequest();
            deleteSubnetRequest.setSubnetId(subnetIds.get(0));
            DeleteSubnetResult deleteSubnetResult = jcs.deleteSubnet(deleteSubnetRequest);
            System.out.println(deleteSubnetResult);
            deleteSubnetRequest.setSubnetId(subnetIds.get(1));
            deleteSubnetResult = jcs.deleteSubnet(deleteSubnetRequest);
            System.out.println(deleteSubnetResult);

            
            deleteVpcRequest.setVpcId(vpcId);
            deleteVpcResult = jcs.deleteVpc(deleteVpcRequest);
            System.out.println(deleteVpcResult);
            
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
