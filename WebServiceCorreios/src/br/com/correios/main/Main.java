package br.com.correios.main;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

public class Main {

	public static void main(String[] args) throws SQLException_Exception, SigepClienteException {

		AtendeClienteService service = new AtendeClienteService();
		AtendeCliente cliente = service.getAtendeClientePort();

		EnderecoERP e = cliente.consultaCEP("06867480");

		System.out.println(e.getBairro());
		System.out.println(e.getCep());
		System.out.println(e.getCidade());
		System.out.println(e.getEnd());
		System.out.println(e.getUf());

	}

}
