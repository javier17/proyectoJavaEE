package com.asesoftware.cuentasbancarias.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.asesoftware.cuentasbancarias.entidades.Cuenta;
import com.asesoftware.cuentasbancarias.negocio.GestionCuentaEJB;

/**
 * Session Bean implementation class RegistroCuentaMB
 */
@ViewScoped
@ManagedBean
public class RegistroCuentaMB {
	
	private Cuenta cuenta;
	
	private List<Cuenta> listaCuentas;
	
	@EJB
	private GestionCuentaEJB gestionCuentaEJB;

    /**
     * Default constructor. 
     */
    public RegistroCuentaMB() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    public void inicializar() {
    	this.cuenta = new Cuenta();
    	this.listarCuentas();
    }
    
    public void listarCuentas() {
    	this.listaCuentas = gestionCuentaEJB.listarCuentas();
    }

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public List<Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(List<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
    
    

}
