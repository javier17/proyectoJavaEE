package com.asesoftware.cuentasbancarias.integracion;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.asesoftware.cuentasbancarias.entidades.Cuenta;

/**
 * Session Bean implementation class GestionCuentaDB
 */
@Stateless
@LocalBean
public class GestionCuentaDB {
	
	@PersistenceContext
	private EntityManager em;
	
	public static final String CONSULTA_CUENTAS = "Select c from Cuenta c";

    /**
     * Default constructor. 
     */
    public GestionCuentaDB() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * 
     * @param cuenta
     */
   public void guardarCuenta(Cuenta cuenta) {
	   em.persist(cuenta);
   }
   
   public void actualizaCuenta(Cuenta cuenta) {
	   em.merge(cuenta);
   }
   
   public void eliminarCuenta(Cuenta cuenta) {
	   em.remove(cuenta);
   }
   
   public Cuenta buscarCuenta(int idCuenta) {
	   return em.find(Cuenta.class, idCuenta);
   }
   
   @SuppressWarnings("unchecked")
   public List<Cuenta> listaCuentas(){
	   Query consultaCuentas = em.createQuery(CONSULTA_CUENTAS);
	   return consultaCuentas.getResultList();
   }
    
    

}
