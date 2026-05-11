package com.desafio_magalu.agendamento_notificacao_api.business.mapper;

import com.desafio_magalu.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.desafio_magalu.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.desafio_magalu.agendamento_notificacao_api.infrastructure.entity.Agendamento;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);
    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
