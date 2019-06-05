package com.everis.endpoint;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.everis.dao.TicketSimulacionDAO;
import com.everis.domain.Update;
import com.everis.services.UpdateService;
import com.everis.ticket.ArrayOfIncidentInstanceType;
import com.everis.ticket.CreateIncidentRequest;
import com.everis.ticket.CreateIncidentResponse;
import com.everis.ticket.IncidentInstanceType;
import com.everis.ticket.RetrieveDeviceRequest;
import com.everis.ticket.RetrieveDeviceResponse;
import com.everis.ticket.RetrieveIncidentListRequest;
import com.everis.ticket.RetrieveIncidentListResponse;
import com.everis.ticket.UpdateIncidentRequest;
import com.everis.ticket.UpdateIncidentResponse;

@Endpoint
public class TicketEndPoint {

	@Autowired
	UpdateService ticketSimulacionService;

	@Autowired
	TicketSimulacionDAO ticketSimulacionDAO;

	@Autowired
	RetrieveDeviceResponse response;

	@PayloadRoot(namespace = "http://everis.com/ticket", localPart = "CreateIncidentRequest")
	@ResponsePayload
	public CreateIncidentResponse processCourseDetailsRequest(@RequestPayload CreateIncidentRequest request) {
		CreateIncidentResponse response = new CreateIncidentResponse();

		System.out.println("Start CREATE INCIDENTE REQUEST");
		Random random = new Random();
		String idTicket = "A" + Integer.toString(random.nextInt(1000000000));

		System.out.println("ABERTURA DE TICKET REALIZADA COM SUCESSO ID: " + idTicket);
		// ID TICKET
		response.setNumber(idTicket);
		System.out.println("End Application");

		return response;

	}

	@PayloadRoot(namespace = "http://everis.com/ticket", localPart = "UpdateIncidentRequest")
	@ResponsePayload
	public UpdateIncidentResponse processCourseDetailsRequest(@RequestPayload UpdateIncidentRequest request) {
		UpdateIncidentResponse response = new UpdateIncidentResponse();

		System.out.println("Start UPDATE INCIDENTE REQUEST");
		System.out.println("TICKET ATUALIZADO COM SUCESSO ID: " + request.getNumber());
		response.setNumber(request.getNumber());
		System.out.println("End Application");

		return response;

	}

	@PayloadRoot(namespace = "http://everis.com/ticket", localPart = "RetrieveIncidentListRequest")
	@ResponsePayload
	public RetrieveIncidentListResponse retrieveIncidentListRequest(@RequestPayload RetrieveIncidentListRequest request)
			throws ClassNotFoundException, SQLException {
		RetrieveIncidentListResponse response = new RetrieveIncidentListResponse();

		List<Update> tickets = ticketSimulacionDAO.findTicketsByQuery(request.getQuery());

		ArrayOfIncidentInstanceType arrayIncidentInstanceType = new ArrayOfIncidentInstanceType();
		IncidentInstanceType instance = new IncidentInstanceType();

		for (Update ticket : tickets) {
			instance = new IncidentInstanceType();
 
			// ID TICKET
			instance.setNumber(ticket.getIdIncidenteTicket());

			instance.setAffectedCI(ticket.getCiTicket());
			instance.setAssignee(ticket.getAbertoPor());
			instance.setAssignmentGroup(ticket.getLocalizacao());

			// instance.setAttachmentData();
			// instance.setAttachmentInfo(value);
			// instance.setAttachments(value);
			// instance.setBusinessImpact(value);
			// instance.setCategory(value);
			// instance.setCompany(value);
			instance.setContactPerson(ticket.getContato());
			// instance.setCoordinatorGroup(value);
			instance.setCurrentAmbit(ticket.getAmbito());
			instance.setDescription(ticket.getDescricaoTicket());
			instance.setMapfreIdcat(ticket.getIdCatTicket());
			// instance.setIgnoreEmptyElements(value);
			instance.setInitialAmbit(ticket.getAmbitoInicial());
			instance.setMapfreEnvironment(ticket.getEntorno());
			instance.setServiceRecipient(ticket.getDestinatario());
			instance.setStatus(ticket.getStatusTicket());
			instance.setTitle(ticket.getTituloTicket());
			instance.setUrgency(ticket.getUrgenciaTicket());
			instance.setUserImpact(ticket.getImpactoUsuarioTicket());

			instance.setTimeStamp(ticket.getTime());

			arrayIncidentInstanceType.getIncidentInstanceType().add(instance);

		}

		response.setArrayOfIncidentInstanceType(arrayIncidentInstanceType);

		return response;

	}

	@PayloadRoot(namespace = "http://everis.com/ticket", localPart = "RetrieveDeviceRequest")
	@ResponsePayload
	public RetrieveDeviceResponse retrieveDeviceRequest(@RequestPayload RetrieveDeviceRequest request) {

		System.out.println("Start Consulta CMDB");

		String query = request.getModel().getQuery();

		System.out.println(query);

		response.getModel().getInstance().getFileDevice().setLogicalName("CI120679");
		response.getModel().getInstance().getFileDevice().setLocationComments("Mexico");
		response.getModel().getInstance().getFileNode().setMapfreOsPlatform("Linux");
		response.getModel().getInstance().getFileDevice().setType("Hardware");
		response.getModel().getInstance().getFileDevice().setSubtype("Blade Enclousure");
		System.out.println("End Consulta CMDB");

		return response;

	}

}
