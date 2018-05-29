package com.asesoftware.cuentasbancarias.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-28T15:43:56.038-0500")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ {
	public static volatile SingularAttribute<Cuenta, Long> numeroCuenta;
	public static volatile SingularAttribute<Cuenta, BigDecimal> saldo;
	public static volatile ListAttribute<Cuenta, Movimiento> movimientos;
}
