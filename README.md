# tornillo-backend
Sistema de Gestión para Ferretería “El Tornillo Feliz” con Spring Boot, MongoDB y JWT.
# Tornillo Backend 🔧

Sistema de gestión para ferretería “El Tornillo Feliz”.  
Backend desarrollado con **Spring Boot 3.3.13**, **MongoDB Atlas** y **JWT** para autenticación.

---

## 🚀 Contenido del proyecto

- 🧩 `pom.xml` — Dependencias de Spring Boot, MongoDB, Security, etc.
- 📂 `src/main/java/com/eltornillofeliz/backend`:
  - `TornilloBackendApplication.java` — Punto de entrada del sistema.
  - `security/config/SecurityConfig.java` — Configuración de Spring Security + JWT.
  - `security/auth` — Controlador y DTOs para registro y login.
  - `security/jwt` — Lógica para generar/validar tokens y filtro de autenticación.
  - `security/user` — Modelo `User`, roles, repositorio y servicio.

---

## ⚙️ Requisitos

- Java 17+
- Maven 3.8+
- Clúster MongoDB Atlas (URI en `application.properties`)
- Postman u otro cliente HTTP para pruebas

---

## 🧑‍💻 Cómo ejecutarlo

1. Clona el repo:
   ```bash
   git clone https://github.com/tuUsuario/tornillo-backend.git
   cd tornillo-backend
