```
tornillo-backend/
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/eltornillofeliz/backend/
│   │   │       ├── TornilloBackendApplication.java
│   │   │       ├── config/
│   │   │       │   └── SecurityConfig.java
│   │   │       ├── security/
│   │   │       │   ├── auth/
│   │   │       │   │   ├── AuthController.java
│   │   │       │   │   ├── AuthRequest.java
│   │   │       │   │   ├── AuthResponse.java
│   │   │       │   │   └── RegisterRequest.java
│   │   │       │   ├── jwt/
│   │   │       │   │   ├── JwtAuthenticationFilter.java
│   │   │       │   │   └── JwtService.java
│   │   │       │   └── user/
│   │   │       │       ├── Role.java
│   │   │       │       ├── User.java
│   │   │       │       ├── UserRepository.java
│   │   │       │       └── UserService.java
│   ├── test/
│   │   └── java/
│   │       └── com/eltornillofeliz/backend/
│   │           ├── TornilloBackendApplicationTests.java
│   │           └── security/
│   │               ├── auth/
│   │               │   ├── AuthControllerTest.java
│   │               │   └── AuthRequest.java
│   │               ├── jwt/
│   │               │   └── JwtServiceTest.java
│   │               └── TestController.java
└── target/

```