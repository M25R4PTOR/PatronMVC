package com.ecodeup.mvc;

import com.ecodeup.model.Cliente;
import com.ecodeup.view.ClienteView;

public class MvcDemo {

	public static void main(String[] args) {
		// objeto vista, y modelo creado con el método estático
		Cliente modelo = llenarDatosCliente();
		ClienteView vita = new ClienteView();

	}

	// método estático que retorna el cliente con sus datos
	private static Cliente llenarDatosCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Manuel");
		cliente.setApellido("Martín");
		return cliente;
	}
}
