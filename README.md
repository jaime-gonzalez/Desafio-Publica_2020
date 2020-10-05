# Desafio-Publica_2020
<h3>Frameworks, jdk, bancos de dados e sistema operacional utilizados:</h3>
- Backend: Spring Boot 2.3.4
- Frontend: Angular 10.1.3
- MYSQL 8.0.21
- JDK 15
- VM Linux Ubuntu 20.04

<h3>Como Rodar este App?</h3>
- Este programa funciona com uma API Rest desenvolvida em Spring Boot, na qual um aplicação frontend feita em Angular faz o consumo desta API e gera a interface para interação com o banco de dados.
- Para rodar, basta executar a API Rest no Backend e no Frontend executar com 'ng serve', acessando via localhost:4200.
- Esquema de criação das tabelas está disponível na pasta "backend/src/main/resources/tabelas.ddl", porém basta a criação do banco de dados tal qual referenciado na pasta resources, as tabelas são geradas automaticamente pelo Hibernate.
- Adaptar a senha da pasta "backend/src/main/resources/application.properties" conforme a senha de acesso do banco de dados da sua máquina.
