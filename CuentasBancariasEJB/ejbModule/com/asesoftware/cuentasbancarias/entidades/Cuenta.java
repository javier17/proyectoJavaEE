package com.asesoftware.cuentasbancarias.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CUENTAS database table.
 * 
 */
@Entity
@Table(name="CUENTAS")
@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NUMERO_CUENTA")
	private long numeroCuenta;

	private BigDecimal saldo;

	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="cuenta")
	private List<Movimiento> movimientos;

	public Cuenta() {
	}

	public long getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public List<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Movimiento addMovimiento(Movimiento movimiento) {
		getMovimientos().add(movimiento);
		movimiento.setCuenta(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setCuenta(null);

		return movimiento;
	}

}