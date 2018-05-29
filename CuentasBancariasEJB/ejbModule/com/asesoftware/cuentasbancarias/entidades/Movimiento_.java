package com.asesoftware.cuentasbancarias.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-28T15:43:56.169-0500")
@StaticMetamodel(Movimiento.class)
public class Movimiento_ {
	public static volatile SingularAttribute<Movimiento, Long> codigo;
	public static volatile SingularAttribute<Movimiento, String> codigoTipoMov;
	public static volatile SingularAttribute<Movimiento, Date> fecha;
	public static volatile SingularAttribute<Movimiento, String> valor;
	public static volatile SingularAttribute<Movimiento, Cuenta> cuenta;
}
