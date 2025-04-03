# Barber API

Uma API RESTful para gerenciar clientes de um sistema de barbearia.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Gradle** como ferramenta de build
- **Jakarta Validation** para validação de dados
- **Lombok** para reduzir boilerplate no código
- **RESTful APIs** com Spring Web

## Endpoints Disponíveis

### Clientes

- **POST /clients**  
  Cria um novo cliente.  
  **Request Body:** `SaveClientRequest`  
  **Response:** `SaveClientResponse`

- **PUT /clients/{id}**  
  Atualiza os dados de um cliente existente.  
  **Request Body:** `UpdateClientRequest`  
  **Response:** `UpdateClientResponse`

- **DELETE /clients/{id}**  
  Remove um cliente pelo ID.  
  **Response:** `204 No Content`

- **GET /clients/{id}**  
  Retorna os detalhes de um cliente pelo ID.  
  **Response:** `ClientDetailResponse`

- **GET /clients**  
  Lista todos os clientes.  
  **Response:** `List<ListClientResponse>`

## Como Executar o Projeto

1. **Pré-requisitos**:
   - Java 17 ou superior
   - Gradle instalado (ou use o wrapper `./gradlew`)
  
   ## Acesse a API:

      A API estará disponível em: http://localhost:8080
