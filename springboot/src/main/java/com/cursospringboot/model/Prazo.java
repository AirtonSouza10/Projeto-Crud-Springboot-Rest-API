package com.cursospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prazo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String descricao;
	
	private int diasprazo;
	
	private int qtdeparcelas;
	
	private int inicioprazo;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDiasprazo() {
		return diasprazo;
	}

	public void setDiasprazo(int diasprazo) {
		this.diasprazo = diasprazo;
	}

	public int getQtdeparcelas() {
		return qtdeparcelas;
	}

	public void setQtdeparcelas(int qtdeparcelas) {
		this.qtdeparcelas = qtdeparcelas;
	}

	public int getInicioprazo() {
		return inicioprazo;
	}

	public void setInicioprazo(int inicioprazo) {
		this.inicioprazo = inicioprazo;
	}
	

	
	
}
