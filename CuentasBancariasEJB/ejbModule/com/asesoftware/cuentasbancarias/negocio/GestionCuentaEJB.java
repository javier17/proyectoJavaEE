package com.asesoftware.cuentasbancarias.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.asesoftware.cuentasbancarias.entidades.Cuenta;
import com.asesoftware.cuentasbancarias.integracion.GestionCuentaDB;

/**
 * Session Bean implementation class GestionCuentaEJB
 */
@Stateless
@LocalBean
public class GestionCuentaEJB {
	
	@EJB
	private GestionCuentaDB gestionCuentaDB;

    /**
     * Default constructor. 
     */
    public GestionCuentaEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void guardarCuenta(Cuenta cuenta) {
    	gestionCuentaDB.guardarCuenta(cuenta);
    }
    
    public List<Cuenta> listarCuentas(){
    	return gestionCuentaDB.listaCuentas();
    }

}
