package com.ecodeup.mvc;

import com.ecodeup.model.Cliente;
import com.ecodeup.view.ClienteView;

public class MvcDemo {

	public static void main(String[] args) {
		// objeto vista, y modelo creado con el m�todo est�tico
		Cliente modelo = llenarDatosCliente();
		ClienteView vita = new ClienteView();

	}

	// m�todo est�tico que retorna el cliente con sus datos
	private static Cliente llenarDatosCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Manuel");
		cliente.setApellido("Mart�n");
		return cliente;
	}
}
