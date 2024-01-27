# Projeto de Pagamento de Estudos

Bem-vindo ao Projeto de Pagamento de Estudos! Este é um sistema dedicado a facilitar os processos de pagamento relacionados à educação. Este README fornecerá uma visão geral do projeto, sua finalidade, configuração e como começar.

## Visão Geral

O Projeto de Pagamento de Estudos é uma aplicação web desenvolvida para simplificar o processo de pagamento de taxas e mensalidades educacionais. Com uma interface intuitiva e recursos robustos, este projeto visa melhorar a experiência tanto para os alunos quanto para as instituições educacionais.

## Recursos Principais

- **Gestão de Pagamentos:** Permita que os alunos visualizem e efetuem pagamentos de taxas escolares de forma conveniente.

- **Histórico de Pagamentos:** Mantenha um registro detalhado dos pagamentos passados, oferecendo transparência aos alunos e às instituições.

- **Notificações Automáticas:** Configure notificações automáticas para lembretes de pagamento e confirmações.

- **Segurança:** Implemente práticas de segurança robustas para proteger as informações financeiras dos usuários.

## Configuração do Ambiente

### Pré-requisitos

- Java Development Kit (JDK)
- Apache Maven
- Banco de Dados MySQL
- Node.js e npm (para o frontend, se aplicável)

### Configuração do Banco de Dados

1. Crie um banco de dados MySQL usando o docker, com o arquivo docker-compose.yml.
2. Configure as credenciais no arquivo `application.properties`.

### Configuração do Projeto

1. Clone o repositório: `git clone https://github.com/MatheusMed/payment-system`.
2. Navegue até o diretório do projeto: `cd payment-system`.

### Build e Execução

1. Compile o projeto: `mvn clean install`.
2. Execute o aplicativo: `java -jar target/payment-system.jar`.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias, correções de bugs ou novos recursos. Abra uma issue para discussões e envie pull requests.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).

