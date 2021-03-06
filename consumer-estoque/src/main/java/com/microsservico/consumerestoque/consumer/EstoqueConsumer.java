package com.microsservico.consumerestoque.consumer;

import constantes.RabbitmqConstantes;
import dto.EstoqueDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitmqConstantes.FILA_ESTOQUE)
    private void consumidor(EstoqueDTO estoqueDto){
        System.out.println(estoqueDto.codigoproduto);
        System.out.println(estoqueDto.quantidade);
        System.out.println("-----------------------------");
    }
}