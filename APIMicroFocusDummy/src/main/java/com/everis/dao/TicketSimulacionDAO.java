package com.everis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.everis.domain.Update;

@Repository
public class TicketSimulacionDAO {

	private Connection connection;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String user;

	@Value("${spring.datasource.password}")
	private String password;

	public TicketSimulacionDAO() {

	}

	public List<Update> findTicketsByQuery(String conditions) throws ClassNotFoundException, SQLException {

		if (connection == null) {
			connection = new ConnectionFactory().getConnection(url, user, password);
		}

		List<Update> listTicketSimulacion = new ArrayList<>();

		try {

			Update ticketSimulacion = new Update();

			String query = "SELECT * FROM UPDATE WHERE " + conditions + " order by time";

			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ticketSimulacion = new Update();
				ticketSimulacion.setId(rs.getInt("id"));
				ticketSimulacion.setAbertoPor(rs.getString("aberto_por"));
				ticketSimulacion.setAcao(rs.getString("acao"));
				ticketSimulacion.setAmbito(rs.getString("ambito"));
				ticketSimulacion.setAmbitoInicial(rs.getString("ambito_inicial"));
				ticketSimulacion.setCiTicket(rs.getString("ci_ticket"));
				ticketSimulacion.setContato(rs.getString("contato"));
				ticketSimulacion.setDataProcessamento(rs.getDate("data_processamento"));
				ticketSimulacion.setDescricaoTicket(rs.getString("descricao_ticket"));
				ticketSimulacion.setDestinatario(rs.getString("destinatario"));
				ticketSimulacion.setEntorno(rs.getString("entorno"));
				ticketSimulacion.setIdCatTicket(rs.getString("id_cat_ticket"));
				ticketSimulacion.setIdIncidenteTicket(rs.getString("id_incidente_ticket"));
				ticketSimulacion.setImpactoUsuarioTicket(rs.getString("impacto_usuario_ticket"));
				ticketSimulacion.setLocalizacao(rs.getString("localizacao"));
				ticketSimulacion.setStatusTicket(rs.getString("status_ticket"));
				ticketSimulacion.setTime(rs.getLong("time"));
				ticketSimulacion.setTituloTicket(rs.getString("titulo_ticket"));
				ticketSimulacion.setUrgenciaTicket(rs.getString("urgencia_ticket"));

				listTicketSimulacion.add(ticketSimulacion);

			}

			ps.close();

		} catch (Exception e) {

		}

		return listTicketSimulacion;

	}

}
