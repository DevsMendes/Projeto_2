# Prática 2 - Tabela FIPE API

Este é um projeto de exemplo para consumir a Tabela FIPE usando uma API RESTful desenvolvida com Spring Boot.

## Descrição

O projeto implementa uma API REST que consulta as informações de marcas, modelos, anos e valores de veículos utilizando a API FIPE. A API é capaz de retornar dados sobre os veículos, como marcas, modelos disponíveis e seus respectivos valores com base no ano de fabricação.

## Funcionalidades

- **Consultar Marcas**: Obtém uma lista de marcas de carros disponíveis.
- **Consultar Modelos**: Obtém os modelos de uma marca específica.
- **Consultar Anos**: Obtém os anos de fabricação de um modelo de carro.
- **Consultar Valor**: Obtém o valor de um carro com base na marca, modelo e ano.

## Tecnologias Utilizadas

- **Spring Boot**: Framework Java para desenvolvimento de aplicações web.
- **RestTemplate**: Para realizar requisições HTTP para consumir a API externa da FIPE.
- **Maven**: Para gerenciamento de dependências.

## Como Rodar o Projeto

1. **Clonar o Repositório**:
   Clone este repositório para a sua máquina local:
   ```bash
   git clone https://github.com/DevsMendes/Pratica_2.git
