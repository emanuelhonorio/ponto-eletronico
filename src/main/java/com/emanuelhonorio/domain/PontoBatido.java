package com.emanuelhonorio.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_PONTO_BATIDO")
public class PontoBatido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate dia;

	@Column(name = "horario_bateu")
	private LocalTime horarioBateu;

	@Column(name = "horario_saiu")
	private LocalTime horarioSaiu;

	@ManyToOne
	@JoinColumn(name = "usuario_fk")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "ponto_fk")
	private Ponto ponto;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PontoBatido other = (PontoBatido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public LocalTime getHorarioBateu() {
		return horarioBateu;
	}

	public void setHorarioBateu(LocalTime horarioBateu) {
		this.horarioBateu = horarioBateu;
	}

	public LocalTime getHorarioSaiu() {
		return horarioSaiu;
	}

	public void setHorarioSaiu(LocalTime horarioSaiu) {
		this.horarioSaiu = horarioSaiu;
	}

}
