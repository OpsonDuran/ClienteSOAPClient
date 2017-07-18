package com.beeva.ClienteSOAP;


import java.rmi.RemoteException;
import java.util.Scanner;

import com.beeva.ClienteSOAP.ws.Cliente;
import com.beeva.ClienteSOAP.ws.Clientews;
import com.beeva.ClienteSOAP.ws.ClientewsProxy;

public class Client {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Clientews clientews= new ClientewsProxy();
	while(true){
	try {
		System.out.print("Solicita cliente con su id:");
		int id= scan.nextInt();
		Cliente cliente = clientews.obtendatos(id);
		System.out.println("id: "+cliente.getIdCliente()+"| Nombre: "+cliente.getNombre()+"| Apellido: "+cliente.getApellido());
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
	
}
}
