package com.gestao.festa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.festa.model.Convidado;
import com.gestao.festa.persistence.ConvidadosMapper;

@Service
public class ConvidadosService {
	
	@Autowired
	private ConvidadosMapper convidadosMapper;
	
	public int addConvidado(Convidado convidado) {
		return convidadosMapper.addConvidado(convidado);
	}
	
	public List<Convidado> findAllConvidados() {
		return convidadosMapper.findAllConvidados();
	}

}