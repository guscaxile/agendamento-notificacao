package com.desafio_magalu.agendamento_notificacao_api.business.mapper;

import com.desafio_magalu.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.desafio_magalu.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.desafio_magalu.agendamento_notificacao_api.infrastructure.entity.Agendamento;
import com.desafio_magalu.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-14T16:25:20-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Ubuntu)"
)
@Component
public class IAgendamentoMapperImpl implements IAgendamentoMapper {

    @Override
    public Agendamento paraEntity(AgendamentoRecord agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Agendamento.AgendamentoBuilder agendamento1 = Agendamento.builder();

        agendamento1.emailDestinatario( agendamento.emailDestinatario() );
        agendamento1.telefoneDestinatario( agendamento.telefoneDestinatario() );
        agendamento1.dataHoraEnvio( agendamento.dataHoraEnvio() );
        agendamento1.mensagem( agendamento.mensagem() );

        return agendamento1.build();
    }

    @Override
    public AgendamentoRecordOut paraOut(Agendamento agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Long id = null;
        String emailDestinatario = null;
        String telefoneDestinatario = null;
        String mensagem = null;
        LocalDateTime dataHoraEnvio = null;
        StatusNotificacaoEnum statusNotificacao = null;

        id = agendamento.getId();
        emailDestinatario = agendamento.getEmailDestinatario();
        telefoneDestinatario = agendamento.getTelefoneDestinatario();
        mensagem = agendamento.getMensagem();
        dataHoraEnvio = agendamento.getDataHoraEnvio();
        statusNotificacao = agendamento.getStatusNotificacao();

        AgendamentoRecordOut agendamentoRecordOut = new AgendamentoRecordOut( id, emailDestinatario, telefoneDestinatario, mensagem, dataHoraEnvio, statusNotificacao );

        return agendamentoRecordOut;
    }

    @Override
    public Agendamento paraEntityCancelamento(Agendamento agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Agendamento.AgendamentoBuilder agendamento1 = Agendamento.builder();

        agendamento1.id( agendamento.getId() );
        agendamento1.emailDestinatario( agendamento.getEmailDestinatario() );
        agendamento1.telefoneDestinatario( agendamento.getTelefoneDestinatario() );
        agendamento1.dataHoraEnvio( agendamento.getDataHoraEnvio() );
        agendamento1.dataHoraAgendamento( agendamento.getDataHoraAgendamento() );
        agendamento1.mensagem( agendamento.getMensagem() );

        agendamento1.dataHoraModificacao( java.time.LocalDateTime.now() );
        agendamento1.statusNotificacao( com.desafio_magalu.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum.CANCELADO );

        return agendamento1.build();
    }
}
