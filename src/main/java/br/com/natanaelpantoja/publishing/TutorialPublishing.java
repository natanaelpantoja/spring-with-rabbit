package br.com.natanaelpantoja.publishing;


import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class TutorialPublishing {

	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setUri("amqp://natanaelpantoja:1234@localhost/portal");
		Connection conn = factory.newConnection();
		
		Channel channel = conn.createChannel();
		
		channel.queueDeclare("fila", true, false, false, null);
		
		for(int i = 0; i < 10000000; i++) {
			String messageBodyBytes = "Teste de MSG Pantoja "+i;
			channel.basicPublish("", "fila", null, messageBodyBytes.getBytes());
		}
	}

}
