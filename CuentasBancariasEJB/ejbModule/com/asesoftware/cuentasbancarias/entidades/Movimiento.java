package com.asesoftware.cuentasbancarias.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MOVIMIENTOS database table.
 * 
 */
@Entity
@Table(name="MOVIMIENTOS")
@NamedQuery(name="Movimiento.findAll", query="SELECT m FROM Movimiento m")
public class Movimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOVIMIENTOS_CODIGO_GENERATOR", sequenceName="MOVIMIENTOS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOVIMIENTOS_CODIGO_GENERATOR")
	private long codigo;

	@Column(name="CODIGO_TIPO_MOV")
	private String codigoTipoMov;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String valor;

	//bi-directional many-to-one association to Cuenta
	@ManyToOne
	@JoinColumn(name="NUMERO_CUENTA")
	private Cuenta cuenta;

	public Movimiento() {
	}

	public long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getCodigoTipoMov() {
		return this.codigoTipoMov;
	}

	public void setCodigoTipoMov(String codigoTipoMov) {
		this.codigoTipoMov = codigoTipoMov;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}