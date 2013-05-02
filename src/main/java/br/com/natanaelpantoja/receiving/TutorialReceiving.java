package br.com.natanaelpantoja.receiving;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class TutorialReceiving {

	public static void main(String[] args) throws IOException, KeyManagementException, NoSuchAlgorithmException, URISyntaxException, ShutdownSignalException, ConsumerCancelledException, InterruptedException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setUri("amqp://natanaelpantoja:1234@localhost/portal");
		Connection conn = factory.newConnection();

		Channel channel = conn.createChannel();

		QueueingConsumer consumer = new QueueingConsumer(channel);
	    channel.basicConsume("fila", true, consumer);

	    while (true) {
	      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
	      String message = new String(delivery.getBody());
	      System.out.println(" [x] Received '" + message + "'");
	    }
	}
}
