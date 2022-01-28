package com.microsservico.consumerpreco.consumer;

import constantes.RabbitmqConstantes;
import dto.PrecoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PrecoConsumer {

    @RabbitListener(queues = RabbitmqConstantes.FILA_PRECO)
    private void consumidor(PrecoDTO precoDTO){
        System.out.println(precoDTO.codigoproduto);
        System.out.println(precoDTO.preco);
        System.out.println("----------------------------");
    }
}
