package com.everis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

import com.everis.ticket.DeviceInstanceType;
import com.everis.ticket.DeviceModelType;
import com.everis.ticket.RetrieveDeviceResponse;

@EnableWs
@Configuration
public class RetrieveDeviceConfig {

	@Bean
	public RetrieveDeviceResponse buildRetrieveDeviceResponse() {

		RetrieveDeviceResponse response = new RetrieveDeviceResponse();
		DeviceModelType model = new DeviceModelType();
		DeviceInstanceType instance = new DeviceInstanceType();
		DeviceInstanceType.FileDevice fileDevice = new DeviceInstanceType.FileDevice();
		DeviceInstanceType.FileNode fileNode = new DeviceInstanceType.FileNode();

		response.setModel(model);
		response.getModel().setInstance(instance);
		response.getModel().getInstance().setFileDevice(fileDevice);
		response.getModel().getInstance().setFileNode(fileNode);

		return response;

	}
}