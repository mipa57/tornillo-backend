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

## 📂 Estructura del proyecto

```plaintext
tornillo-backend/
├── docs/                     → Documentación técnica y de API
├── src/
│   ├── main/
│   │   └── java/com/eltornillofeliz/backend/
│   │       ├── security/     → Seguridad, JWT, autenticación
│   │       ├── config/       → Configuración de seguridad
│   │       ├── user/         → Modelo y repositorio de usuarios
│   └── test/                 → Pruebas unitarias y de integración
├── pom.xml                   → Dependencias del proyecto
└── README.md                 → Este archivo
🔐 Endpoints de autenticación
Documentados en: docs/endpoints.md

Método	Endpoint	Descripción
POST	/api/auth/register	Registrar nuevo usuario
POST	/api/auth/login	Obtener token JWT

🧪 Pruebas
El proyecto cuenta con pruebas para:

Generación y validación de JWT (JwtServiceTest)

Flujo de login (AuthControllerTest)

Registro y autenticación de usuarios

Puedes ejecutar las pruebas con:

bash
Copiar
Editar
mvn test
🧠 Documentación adicional
Encuentra toda la documentación técnica en la carpeta docs/:

estructura.txt: organización de paquetes

configuracion.md: configuración JWT, Mongo y seguridad

migraciones.md: cambios realizados en el tiempo

flujo-login.md: flujo desde login hasta vista de inventario

notas-tecnicas.md: observaciones sobre el desarrollo

💡 Autor
Gustavo
Jardinero y programador apasionado por construir sistemas útiles y bien hechos.
💌 Contacto: canelitakids2025@gmail.com

🧱 Estado del proyecto
✅ Backend funcional
✅ Autenticación completa
✅ Sistema modular y extensible
🚧 Pendiente: conectar con frontend (dashboard, productos, stock)

🛡️ Licencia
Este proyecto está protegido bajo los valores de honestidad, trabajo bien hecho y amor por la programación 🇨🇴✨