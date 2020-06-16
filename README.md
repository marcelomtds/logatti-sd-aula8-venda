Configuração e acesso do RabbitMQ para Windows:

1 - Baixar e instalar o Erlang: https://www.erlang.org/downloads

2 - Baixar e instalar o RabbitMQ: https://www.rabbitmq.com/install-windows.html

3 - Iniciar o Rabbit:
  - Executar o arquivo "RabbitMQ Command Prompt (sbin dir)" 
  disponível em C:\Users\SEU_NOME_DE_USUARIO\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\RabbitMQ Server
  ou procurar por "sbin" na cortana do windowns
  - Executar no console que foi aberto o comando "rabbitmq-plugins.bat enable rabbitmq_management"

4 - Para acessar o RabbitMQ Management: http://localhost:15672
  Usuário: guest
  Senha: guest
