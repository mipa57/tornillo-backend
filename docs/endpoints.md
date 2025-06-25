# 📡 Endpoints de la API

## 🔐 Autenticación

### POST /api/auth/register
- 📥 Body: `{ "username": "admin", "password": "1234" }`
- 📤 Respuesta: `{ "token": "..." }`

### POST /api/auth/login
- 📥 Body: `{ "username": "admin", "password": "1234" }`
- 📤 Respuesta: `{ "token": "..." }`

## 📦 Productos

### GET /api/productos
- 🔐 Requiere token
- 📤 Lista todos los productos del inventario
