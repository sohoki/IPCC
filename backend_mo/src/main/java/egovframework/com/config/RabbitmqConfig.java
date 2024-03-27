package egovframework.com.config;

import java.util.List;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

	@Value("${spring.rabbitmq.host}")
    private String host;
    
    @Value("${spring.rabbitmq.username}")
    private String username;
    
    @Value("${spring.rabbitmq.password}")
    private String password;
    
    @Value("${spring.rabbitmq.port}")
    private int port;
    
    @Value("${rabbitmq.queue.name}")
    private String queueName;

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;
    
    @Value("${rabbitmq.routing.key}")
    private String routingKey;
    
    @Value("${rabbitmq.topic.key}")
    private String topicRoutingKey;
    /**
     * 지정된 큐 이름으로 Queue 빈을 생성
     *
     * @return Queue 빈 객체
     */
    @Bean
    Queue queue() {
        return new Queue(queueName, false);
    }
    
    /**
     * 지정된 익스체인지 이름으로 DirectExchange 빈을 생성
     *
     * @return TopicExchange 빈 객체
     */
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(exchangeName);
    }
    
    @Bean 
    public Declarables fanoutExchange(@Value("${rabbitmq.topic.name}") final String exchangeName,
    								Queue queue) {	
    	FanoutExchange fanoutExchange = new FanoutExchange("notification-fanout-exchange");
    	
    	Queue fanoutQueue1 = new Queue("display.queue", false);
    	Queue fanoutQueue2 = new Queue("ipcc.queue", false);
    	    
    	    
    	return new Declarables(
    				queue,
    				fanoutExchange,
    				BindingBuilder.bind(fanoutQueue1).to(fanoutExchange),
    			    BindingBuilder.bind(fanoutQueue2).to(fanoutExchange)
    			);
    }
    /*
     *  
     * 
     */
    @Bean
    public Declarables topicExchange (@Value("${rabbitmq.topic.name}") final String exchangeName, 
    								Queue queue){
    	
    	TopicExchange topicExchange = new TopicExchange(exchangeName);
    	return  new Declarables(
    				queue,	
	    			topicExchange,
					BindingBuilder
						.bind(queue)
						.to(topicExchange)
						.with("*.manager.solved")
    			/*
    			for (Queue queue : queues) {
    				queue,	
        			topicExchange,
    				BindingBuilder
    					.bind(queue)
    					.to(topicExchange)
    					.with("ipcc.manager.*");
    				}
    			*/
    			);
    	//return new TopicExchange(exchangeName);
    }
    
    /**
     * 주어진 큐와 익스체인지를 바인딩하고 라우팅 키를 사용하여 Binding 빈을 생성
     *
     * @param queue    바인딩할 Queue
     * @param exchange 바인딩할 TopicExchange
     * @return Binding 빈 객체
     
    @Bean
    Binding binding(TopicExchange topicExchange, Queue queue) {
        return BindingBuilder.bind(queue).to(topicExchange).with("*.manager.solved");
    }
    */
    /**
     * RabbitTemplate을 생성하여 반환
     *
     * @param connectionFactory RabbitMQ와의 연결을 위한 ConnectionFactory 객체
     * @return RabbitTemplate 객체
     */
    @Bean
    RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory, MessageConverter messageConverter) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter);
        return rabbitTemplate;
    }
    /**
     * RabbitMQ 연결을 위한 ConnectionFactory 빈을 생성하여 반환
     *
     * @return ConnectionFactory 객체
     */
    @Bean
    ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        return connectionFactory;
    }
    /**
     * Jackson 라이브러리를 사용하여 메시지를 JSON 형식으로 변환하는 MessageConverter 빈을 생성
     *
     * @return MessageConverter 객체
     */
    @Bean
    MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
