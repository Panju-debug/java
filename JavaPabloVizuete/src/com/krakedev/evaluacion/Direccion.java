package com.krakedev.evaluacion;

public class Direccion {
	private String CallePrincipal;
	private String CalleSecundaria;

	public Direccion(String callePrincipal, String calleSecundaria) {

		CallePrincipal = callePrincipal;
		CalleSecundaria = calleSecundaria;
	}

	public String getCallePrincipal() {
		return CallePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		CallePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return CalleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		CalleSecundaria = calleSecundaria;
	}

}
