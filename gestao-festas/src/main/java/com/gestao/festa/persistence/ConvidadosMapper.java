package com.gestao.festa.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.gestao.festa.model.Convidado;

@Mapper
public interface ConvidadosMapper {
	
	@Select("SELECT * FROM gestaofestas.convidado")
    List<Convidado> findAllConvidados();

	@Insert("insert into gestaofestas.convidado (nome, acompanhantes) values(#{nome}, #{acompanhantes})")
	int addConvidado(Convidado convidado);
	
	

}
