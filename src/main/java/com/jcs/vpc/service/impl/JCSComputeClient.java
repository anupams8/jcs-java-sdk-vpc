package com.jcs.vpc.service.impl;

import java.io.IOException;
import java.io.StringReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.xml.sax.InputSource;

import com.jcs.sbs.auth.DefaultJCSCredentialsProviderChain;
import com.jcs.sbs.auth.JCSCredentials;
import com.jcs.sbs.auth.JCSCredentialsProvider;
import com.jcs.sbs.auth.StaticCredentialsProvider;
import com.jcs.sbs.common.Constants;
import com.jcs.sbs.common.JCSHttpClient;
import com.jcs.sbs.common.PropertiesReader;
import com.jcs.sbs.exceptions.PropertyNotFoundException;

import com.jcs.vpc.model.*;

import com.jcs.vpc.service.JCSCompute;

import xmlParser.CreateSubnetResponse;
import xmlParser.CreateVpcResponse;
import xmlParser.DeleteSubnetResponse;
import xmlParser.DeleteVpcResponse;
import xmlParser.DescribeSubnetsResponse;
import xmlParser.DescribeVpcsResponse;

/**
 * Implements create, describe and delete methods for volumes and snapshots.
 */
@ThreadSafe
public class JCSComputeClient extends JCSHttpClient implements JCSCompute {

	private static final Log log = LogFactory.getLog(JCSComputeClient.class);
	private JCSCredentialsProvider jcsCredentialsProvider;

	/**
	 * Constructs a new client to invoke service methods on JCS Client. A
	 * credentials provider chain will be used that searches for credentials in
	 * this order: <br>
	 * Environment Variables - ACCESS_KEY and SECRET_KEY <br>
	 * Java System Properties - ACCESS_KEY and SECRET_KEY <br>
	 * Properties File (config.properties) - ACCESS_KEY and SECRET_KEY <br>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @throws PropertyNotFoundException
	 */

	public JCSComputeClient() throws PropertyNotFoundException {
		this(new DefaultJCSCredentialsProviderChain());
	}

	/**
	 * Constructs a new client to invoke service methods on JCS Client using the
	 * specified JCS account credentials. All service calls made using this new
	 * client object are blocking, and will not return until the service call
	 * completes.
	 * 
	 * @param jcsCredentials
	 *            The JCS credentials (access key ID and secret key) to use when
	 *            authenticating with JCS services.
	 * @throws PropertyNotFoundException
	 */

	public JCSComputeClient(JCSCredentials jcsCredentials) throws PropertyNotFoundException {
		this.jcsCredentialsProvider = new StaticCredentialsProvider(jcsCredentials);
		init();
	}

	/**
	 * Constructs a new client to invoke service methods on JCS Client using the
	 * specified JCS account credentials provider. All service calls made using
	 * this new client object are blocking, and will not return until the
	 * service call completes. Parameters: jcsCredentialsProvider- The JCS
	 * credentials provider which will provide credentials to authenticate
	 * requests with JCS services.
	 * 
	 * @param jcsCredentialsProvider
	 *            Object of class that implements JCSCredentialsProvider
	 *            interface.
	 * 
	 * @throws PropertyNotFoundException
	 */

	public JCSComputeClient(JCSCredentialsProvider jcsCredentialsProvider) throws PropertyNotFoundException {
		this.jcsCredentialsProvider = jcsCredentialsProvider;
		init();
	}

	/**
	 * Initializes the end-points of the APIs with the BASE_URL as in
	 * config.properties file
	 */
	private void init() throws PropertyNotFoundException {
		if (StringUtils.isNotBlank(PropertiesReader.getProperty("BASE_URL"))) {
			this.setEndpoint(PropertiesReader.getProperty("BASE_URL"));
			log.info("Using BASE_URL from " + Constants.PROPERTIES_FILE_NAME);
			return;
		} else {
			log.warn("Unable to read BASE_URL property from " + Constants.PROPERTIES_FILE_NAME);
		}
		if (StringUtils.isNotBlank(System.getenv("BASE_URL"))) {
			this.setEndpoint(System.getenv("BASE_URL"));
			log.info("Using BASE_URL from environment variables");
			return;
		} else {
			log.warn("Unable to read BASE_URL property from environment variables");
		}
		if (StringUtils.isNotBlank(System.getProperty("BASE_URL"))) {
			this.setEndpoint(System.getProperty("BASE_URL"));
			log.info("Using BASE_URL from java system properties");
			return;
		} else {
			log.warn("Unable to read BASE_URL property from Java system properties");
		}
		throw new PropertyNotFoundException("BASE_URL property must be set in " + Constants.PROPERTIES_FILE_NAME
				+ ", environment variables or java system properties");
	}

	@Override
	public CreateVpcResult createVpc(CreateVpcRequest createVpcRequest)
			throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, ClientProtocolException,
			IOException, JAXBException, HttpException, PropertyNotFoundException, IllegalArgumentException {

		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "CreateVpc");
		params.put("cidrBlock", createVpcRequest.getCidrBlock());

		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), params,
				createVpcRequest.getCustomRequestHeaders());
		try {
			if (response.getStatusLine().getStatusCode() == 200) {
				log.debug(response.getStatusLine());
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				JAXBContext jaxbContext = JAXBContext.newInstance(CreateVpcResponse.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				CreateVpcResponse createVpcResponse = (CreateVpcResponse) jaxbUnmarshaller
						.unmarshal(new InputSource(new StringReader(content)));

				Vpc vpc = new Vpc().withVpcId(createVpcResponse.getVpc().getVpcId())
						.withCidrBlock(createVpcResponse.getVpc().getCidrBlock());

				EntityUtils.consume(entity);
				CreateVpcResult createVpcResult = new CreateVpcResult().withVpc(vpc);
				createVpcResult.setRequestId(createVpcResponse.getRequestId());
				createVpcResult.setXml(content);
				return createVpcResult;

			} else {
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				throw new HttpException(content);
			}
		} finally {
			response.close();
		}

	}

	@Override
	public DeleteVpcResult deleteVpc(DeleteVpcRequest deleteVpcRequest)
			throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, ClientProtocolException,
			IOException, JAXBException, HttpException, PropertyNotFoundException, IllegalArgumentException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DeleteVpc");
		params.put("VpcId", deleteVpcRequest.getVpcId());

		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), params,
				deleteVpcRequest.getCustomRequestHeaders());
		try {
			if (response.getStatusLine().getStatusCode() == 200) {
				log.debug(response.getStatusLine());
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				JAXBContext jaxbContext = JAXBContext.newInstance(DeleteVpcResponse.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				DeleteVpcResponse deleteVpcResponse = (DeleteVpcResponse) jaxbUnmarshaller
						.unmarshal(new InputSource(new StringReader(content)));

				EntityUtils.consume(entity);
				DeleteVpcResult deleteVpcResult = new DeleteVpcResult();
				deleteVpcResult.setRequestId(deleteVpcResponse.getRequestId());
				deleteVpcResult.setReturn(deleteVpcResponse.isReturn());

				deleteVpcResult.setXml(content);
				return deleteVpcResult;

			} else {
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				throw new HttpException(content);
			}
		} finally {
			response.close();
		}

	}

	@Override
	public DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest)
			throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, ClientProtocolException,
			IOException, JAXBException, HttpException, PropertyNotFoundException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DescribeVpcs");

		if (describeVpcsRequest.getVpcIds() != null) {
			int i = 1;
			for (String vpcId : describeVpcsRequest.getVpcIds()) {
				params.put("VpcId." + i, vpcId);
				i++;
			}
		}
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), params,
				describeVpcsRequest.getCustomRequestHeaders());

		try {
			if (response.getStatusLine().getStatusCode() == 200) {
				log.debug(response.getStatusLine());
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);

				JAXBContext jaxbContext = JAXBContext.newInstance(DescribeVpcsResponse.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				DescribeVpcsResponse describeVpcsResponse = (DescribeVpcsResponse) jaxbUnmarshaller
						.unmarshal(new InputSource(new StringReader(content)));

				List<Vpc> vpcs = new ArrayList<Vpc>();

				for (DescribeVpcsResponse.VpcSet.Item item : describeVpcsResponse.getVpcSet().getItem()) {
					vpcs.add(new Vpc().withVpcId(item.getVpcId()).withCidrBlock(item.getCidrBlock()));
				}
				EntityUtils.consume(entity);
				DescribeVpcsResult describeVpcsResult = new DescribeVpcsResult();
				describeVpcsResult.setVpcSet(vpcs);
				describeVpcsResult.setRequestId(describeVpcsResponse.getRequestId());
				describeVpcsResult.setXml(content);
				return describeVpcsResult;

			} else
				throw new HttpException(response.getStatusLine().toString());
		} finally {
			response.close();
		}
	}

	@Override
	public CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest)
			throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, ClientProtocolException,
			IOException, JAXBException, HttpException, PropertyNotFoundException, IllegalArgumentException {

		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "CreateSubnet");
		params.put("vpcId", createSubnetRequest.getVpcId());
		params.put("cidrBlock", createSubnetRequest.getCidrBlock());

		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), params,
				createSubnetRequest.getCustomRequestHeaders());
		try {
			if (response.getStatusLine().getStatusCode() == 200) {
				log.debug(response.getStatusLine());
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				JAXBContext jaxbContext = JAXBContext.newInstance(CreateSubnetResponse.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				CreateSubnetResponse createSubnetResponse = (CreateSubnetResponse) jaxbUnmarshaller
						.unmarshal(new InputSource(new StringReader(content)));

				Subnet subnet = new Subnet().withSubnetId(createSubnetResponse.getSubnet().getSubnetId())
						.withCidrBlock(createSubnetResponse.getSubnet().getCidrBlock())
						.withVpcId(createSubnetResponse.getSubnet().getVpcId())
						.withAvailableIpAddressCount(createSubnetResponse.getSubnet().getAvailableIpAddressCount());

				EntityUtils.consume(entity);
				CreateSubnetResult createSubnetResult = new CreateSubnetResult().withSubnet(subnet);
				createSubnetResult.setRequestId(createSubnetResponse.getRequestId());
				createSubnetResult.setXml(content);
				return createSubnetResult;

			} else {
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				throw new HttpException(content);
			}
		} finally {
			response.close();
		}

	}

	@Override
	public DeleteSubnetResult deleteSubnet(DeleteSubnetRequest deleteSubnetRequest) throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, ClientProtocolException,
	IOException, JAXBException, HttpException, PropertyNotFoundException, IllegalArgumentException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DeleteSubnet");
		params.put("SubnetId", deleteSubnetRequest.getSubnetId());

		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), params,
				deleteSubnetRequest.getCustomRequestHeaders());
		try {
			if (response.getStatusLine().getStatusCode() == 200) {
				log.debug(response.getStatusLine());
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				JAXBContext jaxbContext = JAXBContext.newInstance(DeleteSubnetResponse.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				DeleteSubnetResponse deleteSubnetResponse = (DeleteSubnetResponse) jaxbUnmarshaller
						.unmarshal(new InputSource(new StringReader(content)));

				EntityUtils.consume(entity);
				DeleteSubnetResult deleteSubnetResult = new DeleteSubnetResult();
				deleteSubnetResult.setRequestId(deleteSubnetResponse.getRequestId());
				deleteSubnetResult.setReturn(deleteSubnetResponse.isReturn());

				deleteSubnetResult.setXml(content);
				return deleteSubnetResult;

			} else {
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				throw new HttpException(content);
			}
		} finally {
			response.close();
		}
	}

	@Override
	public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest) throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, ClientProtocolException,
	IOException, JAXBException, HttpException, PropertyNotFoundException{
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DescribeSubnets");

		if (describeSubnetsRequest.getSubnetIds() != null) {
			int i = 1;
			for (String subnetId : describeSubnetsRequest.getSubnetIds()) {
				params.put("SubnetId." + i, subnetId);
				i++;
			}
		}
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), params,
				describeSubnetsRequest.getCustomRequestHeaders());

		try {
			if (response.getStatusLine().getStatusCode() == 200) {
				log.debug(response.getStatusLine());
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);

				JAXBContext jaxbContext = JAXBContext.newInstance(DescribeSubnetsResponse.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				DescribeSubnetsResponse describeSubnetsResponse = (DescribeSubnetsResponse) jaxbUnmarshaller
						.unmarshal(new InputSource(new StringReader(content)));

				List<Subnet> subnets = new ArrayList<Subnet>();

				for (DescribeSubnetsResponse.SubnetSet.Item item : describeSubnetsResponse.getSubnetSet().getItem()) {
					subnets.add(new Subnet().withSubnetId(item.getVpcId()).withCidrBlock(item.getCidrBlock()));
				}
				EntityUtils.consume(entity);
				DescribeSubnetsResult describeSubnetsResult = new DescribeSubnetsResult();
				describeSubnetsResult.setSubnetSet(subnets);
				describeSubnetsResult.setRequestId(describeSubnetsResponse.getRequestId());
				describeSubnetsResult.setXml(content);
				return describeSubnetsResult;

			} else
				throw new HttpException(response.getStatusLine().toString());
		} finally {
			response.close();
		}
	}

}
