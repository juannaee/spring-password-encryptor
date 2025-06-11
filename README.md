
# 🔐 Spring Password Encryptor

API REST simples em **Spring Boot 3.5** para criptografar senhas usando o algoritmo **BCrypt**, muito usado em autenticação segura de usuários.

---

## 🚀 O que este projeto faz?

- 🔒 Recebe uma senha em texto plano e retorna ela criptografada com BCrypt
- 🧪 Ideal para testes de segurança, simulações de login e estudos sobre criptografia
- 🔁 Pode ser reutilizado como módulo em sistemas maiores com autenticação

---

## ⚙️ Tecnologias utilizadas

- ✅ Java 21
- ✅ Spring Boot 3.5
- ✅ Spring Security
- ✅ BCrypt (`PasswordEncoder`)
- ✅ Maven

---

## 🔁 Estrutura da API

### 📥 POST `/api/encrypt`

#### Requisição:
```json
{
  "password": "minhaSenha123"
}
```

#### Resposta:
```json
{
  "encryptedPassword": "$2a$10$..."
}
```

---

## 📁 Estrutura do Projeto

```
src/
├── config/
│   ├── AppConfig.java           # Bean do PasswordEncoder
│   └── SecurityConfig.java      # Libera acesso e desativa CSRF
├── controllers/
│   └── EncryptController.java   # Controller principal com o endpoint
├── dto/
│   ├── PasswordRequestDTO.java  # Objeto de entrada (senha)
│   └── PasswordResponseDTO.java # Objeto de resposta (senha criptografada)
└── ProjetoSpringSecurityApplication.java
```

---

## ▶️ Como rodar localmente

```bash
git clone https://github.com/seu-usuario/spring-password-encryptor.git
cd spring-password-encryptor
./mvnw spring-boot:run
```

📫 Acesse em:
```
POST http://localhost:8080/api/encrypt
```

---

## ✅ Observações

- 🚨 CSRF e autenticação estão desativados apenas para testes locais!
- 🔐 Em ambiente real, ative autenticação adequada com Spring Security

---

## ✍️ Autor

Desenvolvido por **[Juan Guilherme Silva Lemos](https://www.linkedin.com/in/juan-guilherme-silva-lemos-40b516244/)**

---

## 📄 Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais detalhes.
