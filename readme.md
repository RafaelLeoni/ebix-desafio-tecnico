# Oportunidade Ebix Consulting :: Desafio Técnico - RJ

## Descrição do projeto

Este projeto foi desenvolvido visando o desafio técnico lançado pela [Ebix](https://www.ebix.com/) para seu processo seletivo. O projeto foi construído usando [spring boot](https://spring.io/projects/spring-boot) em conjunto com o banco de dados [H2](https://www.h2database.com) para facilitar o uso do mesmo, já que assim o projeto fica independente de um servidor de aplicação e de um banco de dados instalado na máquina.

## Atividades

1) Criar o server-side de um CRUD utilizando RowMapper para a obtenção dos dados
    - A solução para esta atividade se encontra sob o pacote src/main/java/br/com/ebix/oportunidade/dasafiotecnico/repository/

2) Expor o CRUD como webservice SOAP
    - A solução para esta atividade se encontra sob o pacote src/main/java/br/com/ebix/oportunidade/dasafiotecnico/webservice

3) Consumir o serviço consultaCEP do WSDL [AtendeCliente](https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl) utilizando CXF para geração do client
    - A solução para esta atividade se encontra sob o pacote src/main/java/br/com/ebix/oportunidade/dasafiotecnico/correios/client

4) Expor o serviço do passo 3 como REST (utilizando JAX-RS)
    - A solução para esta atividade se encontra sob o pacote src/main/java/br/com/ebix/oportunidade/dasafiotecnico/correios/rest

Obs: Os artefatos gerados pelo consumo do WSDL do item 3 estão sob a pasta src/generated/cxf

## Construindo

Para construir o projeto faça o clone ou o download e execute o seguinte comando.

```bash
    mvn clean install
```

## Rodando

Para rodar o projeto execute o comando a seguir.

```bash
    java -jar target/dasafio-tecnico-1.0.jar
```

## Endpoints

- Para executar o serviço CRUD de usuários basta usar o WSDL fornecido em [http://localhost:8080/ws/userService?wsdl](http://localhost:8080/ws/userService?wsdl) e chamar seus métodos.

- Para executar o serviço rest para consulta de CEP basta chamar o endpoint GET [http://localhost:8080/rest/cep/20090908](http://localhost:8080/rest/cep/20090908), sendo o último paramêtro o CEP que deseja consultar.