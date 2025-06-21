# 🔐 Google Auth com Java + Spring Boot

Este projeto demonstra como implementar autenticação com o Google utilizando Java 21 e Spring Boot. Ele é ideal como ponto de partida para aplicações seguras com login social via OAuth2.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Security
- OAuth2 Client
- Thymeleaf (para views)
- Maven Wrapper (`./mvnw`)

---

## 💡 Funcionalidades

- Login com conta Google via OAuth2
- Logout com redirecionamento
- Exibição do nome do usuário autenticado
- Proteção de rotas por autenticação

---

## 📦 Como Rodar o Projeto

### ✅ 1. Clone o repositório

```bash
git clone https://github.com/seunome/google-auth-java-spring.git
cd google-auth-java-spring
```

### ✅ 2. Crie uma credencial OAuth no Google

```bash
Acesse o [Google Cloud Console](https://console.cloud.google.com/apis/credentials)

- Vá em **APIs e serviços > Credenciais**
- Clique em **Criar credenciais > ID do cliente OAuth**
- Escolha o tipo de app: **Aplicativo da Web**
- Em **URIs de redirecionamento autorizados**, adicione:

http://localhost:8080/login/oauth2/code/google



- Copie o **Client ID** e o **Client Secret** e cole no seu application.yml

cp src/main/resources/application-example.yml src/main/resources/application.yml
```