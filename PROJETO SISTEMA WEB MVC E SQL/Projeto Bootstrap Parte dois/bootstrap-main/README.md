# Bootstrap - Spring Boot Demo Application

Este é um projeto de demonstração desenvolvido com Spring Boot que exemplifica o uso do framework Bootstrap para estilização de páginas web.

## 📋 Descrição

Aplicação web Java que utiliza Spring Boot e Thymeleaf para renderizar uma página HTML sobre vegetais ("Wild & Wacky Vegetables"). O projeto serve como demonstração prática de integração entre Spring Boot, Thymeleaf e Bootstrap CSS framework.

## 🚀 Tecnologias Utilizadas

- **Java 11**: Linguagem de programação
- **Spring Boot 2.7.3**: Framework para desenvolvimento de aplicações Java
- **Spring Boot Starter Web**: Para desenvolvimento web
- **Spring Boot Starter Thymeleaf**: Engine de templates
- **Spring Boot Actuator**: Para monitoramento e métricas
- **Spring Boot DevTools**: Para desenvolvimento com hot reload
- **Maven**: Gerenciador de dependências e build
- **Lombok**: Para redução de boilerplate code

## 📦 Estrutura do Projeto

```
bootstrap/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/professorangoti/bootstrap/
│   │   │       ├── BootstrapApplication.java
│   │   │       └── HomeController.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   │           └── home.html
│   └── test/
│       └── java/
│           └── com/professorangoti/bootstrap/
│               └── BootstrapApplicationTests.java
├── pom.xml
└── README.md
```

## 🔧 Pré-requisitos

- Java 11 ou superior
- Maven 3.6+ (ou use o Maven Wrapper incluído no projeto)

## 💻 Como Executar

### Usando Maven Wrapper (recomendado)

```bash
# Linux/Mac
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

### Usando Maven instalado localmente

```bash
mvn spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

## 🧪 Executando os Testes

```bash
# Linux/Mac
./mvnw test

# Windows
mvnw.cmd test
```

## 📦 Build do Projeto

Para gerar o arquivo JAR executável:

```bash
# Linux/Mac
./mvnw clean package

# Windows
mvnw.cmd clean package
```

O arquivo JAR será gerado em: `target/bootstrap-0.0.1-SNAPSHOT.jar`

Para executar o JAR:

```bash
java -jar target/bootstrap-0.0.1-SNAPSHOT.jar
```

## 🔍 Endpoints Disponíveis

- **/** - Página principal (home.html)
- **/actuator** - Endpoints de monitoramento do Spring Boot Actuator

## 👨‍💻 Desenvolvimento

O projeto utiliza Spring Boot DevTools, que permite:
- Reinicialização automática da aplicação quando arquivos são modificados
- Desabilitar cache de templates para desenvolvimento

## 📝 Licença

Este projeto é uma demonstração educacional desenvolvida pelo Professor Angoti.

## 👤 Autor

**Professor Angoti**
- GitHub: [@angoti](https://github.com/angoti)

## 📚 Aprendizado

Este projeto é ideal para:
- Aprender os fundamentos do Spring Boot
- Entender a integração entre Spring MVC e Thymeleaf
- Explorar o uso do Bootstrap CSS framework em aplicações Spring Boot
- Praticar desenvolvimento de aplicações web Java

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para:
1. Fazer fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/NovaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/NovaFeature`)
5. Abrir um Pull Request
