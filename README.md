Para esse exemplo funcionar você precisa instalar o Erlang em sua máquina e o rabbitMQ: Segue o link para instalação.

Erlang Language
	http://www.erlang.org/download.html
	
RabbitMQ Instalation
	http://www.rabbitmq.com/download.html
	
mvn eclipse:eclipse

Protocolo - amqp (Para entender melhor do protocolo - http://en.wikipedia.org/wiki/Advanced_Message_Queuing_Protocol)
User no RabbitMQ - natanaelpantoja
Password - 1234
virtual host - portal (Eu criei um usuário e um virtual host para testar mas o default do RabbitMQ é guest guest) 
url: factory.setUri("amqp://natanaelpantoja:1234@localhost/portal");

URL do admin do RabbitMQ http://localhost:15672/

CTRL Panel Documentation: http://www.rabbitmq.com/man/rabbitmqctl.1.man.html

http://www.rabbitmq.com/install-standalone-mac.html

install dir: /usr/local/Cellar/rabbitmq/3.2.2/sbin]
