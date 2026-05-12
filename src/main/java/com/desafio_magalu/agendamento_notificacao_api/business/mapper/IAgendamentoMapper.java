package com.desafio_magalu.agendamento_notificacao_api.business.mapper;

import com.desafio_magalu.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.desafio_magalu.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.desafio_magalu.agendamento_notificacao_api.infrastructure.entity.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);
    AgendamentoRecordOut paraOut(Agendamento agendamento);
    @Mapping(target = "dataHoraModificacao", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "statusNotificacao", expression = "java(com.desafio_magalu.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum.CANCELADO)")
    Agendamento paraEntityCancelamento(Agendamento agendamento);
}
