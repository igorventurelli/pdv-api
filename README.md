# Ponto de Venda - API

[![Maintainability](https://api.codeclimate.com/v1/badges/5f1fc3f98d90ac61868a/maintainability)](https://codeclimate.com/github/igorventurelli/pdv-api/maintainability)

### Para o que esse projeto serve?

Esse projeto é a API back-end para o aplicativo mobile (Android) de Ponto de Venda.

### Como usar?

As rotas dos serviços REST estão disponíveis para consulta pelo [Swagger](https://pdv-api.herokuapp.com/swagger-ui.html).

### Como o projeto está estruturado?

O projeto é subdividido em módulos Maven:

- `application`: é a raiz da aplicação [Spring Boot](https://projects.spring.io/spring-boot/)

- `business`: onde as regras de negócio ficam

- `controller`: módulo que recebe e trata as requisições HTTP

- `dto`: abstração e _lightweight objects_ para a camada de modelo

- `model`: camada de modelo e repositórios de acesso ao banco de dados

- `service`: módulo de abstração entre o `controller` e o `business`

### Integração Contínua

Esse projeto está sob a [Integração Contínua do Heroku](https://devcenter.heroku.com/articles/heroku-ci).

### Qualidade de Código

Esse projeto está sob análise de qualidade de código do [Code Climate](https://codeclimate.com/github/igorventurelli/pdv-api).

### Deploy

Seguindo a integração contínua, o deploy é feito no [Heroku](https://www.heroku.com/).