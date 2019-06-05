package com.everis.wrapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.connector.SOAPConnector;
import com.everis.wsdl.ArrayOfIncidentInstanceType;
import com.everis.wsdl.CreateIncidentRequest;
import com.everis.wsdl.CreateIncidentResponse;
import com.everis.wsdl.DeviceModelType;
import com.everis.wsdl.IncidentInstanceType;
import com.everis.wsdl.RetrieveDeviceRequest;
import com.everis.wsdl.RetrieveDeviceResponse;
import com.everis.wsdl.RetrieveIncidentListRequest;
import com.everis.wsdl.RetrieveIncidentListResponse;
import com.everis.wsdl.UpdateIncidentRequest;
import com.everis.wsdl.UpdateIncidentResponse;

@Component
public class CallSoapTicket {

	@Autowired
	private SOAPConnector soapConnector;

	public void createIncidentRequest() {
		CreateIncidentRequest request = new CreateIncidentRequest();
		System.out.println("CLIENT INCIDENT REQUEST");
		request.setDescription("CLIENT INCIDENT REQUEST");
		CreateIncidentResponse response = (CreateIncidentResponse) soapConnector
				.callWebService("http://localhost:8099/ws/ticket", request);
		System.out.println("Got Response As below ========= : ");
		System.out.println("Response : " + response.getNumber());
	}

	public void updateIncidentRequest() {
		UpdateIncidentRequest request = new UpdateIncidentRequest();
		System.out.println("CLIENT UPDATE REQUEST");
		request.setDescription("CLIENT UPDATE REQUEST");
		request.setNumber("AAA3399");
		UpdateIncidentResponse response = (UpdateIncidentResponse) soapConnector
				.callWebService("http://localhost:8099/ws/ticket", request);
		System.out.println("Got Response As below ========= : ");
		System.out.println("Response : " + response.getNumber());
	}

	public List<IncidentInstanceType> getList() {

		RetrieveIncidentListRequest request = new RetrieveIncidentListRequest();
		request.setQuery("time_stamp > 1551382835154");
		RetrieveIncidentListResponse response = (RetrieveIncidentListResponse) soapConnector
				.callWebService("http://localhost:8099/ws/ticket", request);

		ArrayOfIncidentInstanceType arrayIncidentInstanceType = response.getArrayOfIncidentInstanceType();

		for (IncidentInstanceType incidentInstanceType : arrayIncidentInstanceType.getIncidentInstanceType()) {
			System.out.println("Got Response As below ========= : " + incidentInstanceType.getNumber());

		}

		return arrayIncidentInstanceType.getIncidentInstanceType();

	}

	public void getCmdb() {

		RetrieveDeviceRequest request = new RetrieveDeviceRequest();

		DeviceModelType model = new DeviceModelType();
		request.setModel(model);
		request.getModel().setQuery("mapfre_hostname = Zeus");

		RetrieveDeviceResponse response = (RetrieveDeviceResponse) soapConnector
				.callWebService("http://localhost:8099/ws/ticket", request);

		System.out.println(response.getModel().getInstance().getFileDevice().getLocationComments());
		System.out.println(response.getModel().getInstance().getFileNode().getMapfreOsPlatform());
		System.out.println(response.getModel().getInstance().getFileDevice().getType());
		System.out.println(response.getModel().getInstance().getFileDevice().getSubtype());

	}

}
