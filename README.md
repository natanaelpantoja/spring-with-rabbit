Para esse exemplo funcionar você precisa instalar o Erlang em sua máquina e o rabbitMQ: Segue o link para instalação.

Erlang Language
	http://www.erlang.org/download.html
	
RabbitMQ Instalation
	http://www.rabbitmq.com/download.html
	
mvn eclipse:eclipse

Protocolo - amqp
User no RabbitMQ - natanaelpantoja
Password - 1234
virtual host - portal (Eu criei um usuário e um virtual host para testar mas o default do RabbitMQ é guest guest) 
url: factory.setUri("amqp://natanaelpantoja:1234@localhost/portal");

