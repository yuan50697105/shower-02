package com.idea.shower.amqp.config;

import com.idea.shower.amqp.constants.BindingConstants;
import com.idea.shower.amqp.constants.ExchangeConstants;
import com.idea.shower.amqp.constants.QueueConstants;
import com.idea.shower.amqp.constants.RouteConstants;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-18 21:41
 */
@Configuration
public class AmqpConfiguration {

    @Bean(QueueConstants.ADD_ORDER_QUEUE)
    public Queue addOrderQueue() {
        return new Queue(QueueConstants.ADD_ORDER_QUEUE);
    }

    @Bean(QueueConstants.STOP_ORDER_QUEUE)
    public Queue stopOrderQueue() {
        return new Queue(QueueConstants.STOP_ORDER_QUEUE);
    }

    @Bean(ExchangeConstants.ADD_ORDER_EXCHANGE)
    public Exchange addOrderExchange() {
        return new DirectExchange(ExchangeConstants.ADD_ORDER_EXCHANGE);
    }

    @Bean(ExchangeConstants.STOP_ORDER_EXCHANGE)
    public Exchange stopOrderExchange() {
        return new DirectExchange(ExchangeConstants.STOP_ORDER_EXCHANGE);
    }

    @Bean(BindingConstants.ADD_ORDER_BINDING)
    public Binding addOrder() {
        return BindingBuilder.bind(addOrderQueue()).to(addOrderExchange()).with(RouteConstants.ADD_ORDER_ROUTE).noargs();
    }

    @Bean(BindingConstants.STOP_ORDER_BINDING)
    public Binding stopOrder() {
        return BindingBuilder.bind(addOrderQueue()).to(addOrderExchange()).with(RouteConstants.STOP_ORDER_ROUTE).noargs();
    }
}