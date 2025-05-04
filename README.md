# 🧪 Backend - Mi Pequeña Joya (Spring Boot)

Este backend es parte del proyecto técnico **Mi Pequeña Joya**, una mini tienda de joyería. Permite gestionar productos desde un panel administrador.

---

## ⚙️ Tecnologías usadas

- **Java 21+**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA**
- **Base de datos en memoria H2**

---

## 📁 Estructura del proyecto

```
src/
├── controller/        # Maneja las rutas HTTP
├── service/           # Lógica de negocio
├── repository/        # Acceso a base de datos
├── model/             # Modelo @Entity para la tabla
├── dto/               # DTO para recibir cantidad de venta
└── resources/
    └── application.properties  # Configuración del proyecto
```

---

## 🚀 Cómo ejecutar el backend

1. Clona el proyecto o descomprime el zip
2. Abre con IntelliJ o VS Code
3. Ejecuta la clase `MiPequenaJoyaApplication.java`

El backend corre en `http://localhost:8080/api/v1`

---

## 🗂️ Endpoints disponibles

### 📦 Obtener productos
**GET /products**

Retorna una lista de todos los productos registrados.

---

### ➕ Agregar un nuevo producto
**POST /products**

```json
{
  "name": "Anillo de plata",
  "description": "Hecho a mano",
  "category": "Anillos",
  "price": 19990,
  "stock": 10
}
```

---

### 💸 Vender un producto
**POST /products/{id}/sell**

Body:

```json
{
  "quantity": 2
}
```

---

## 💾 Acceso a base de datos H2

- URL: `http://localhost:8080/h2-console`
- JDBC: `jdbc:h2:mem:joyadb`
- Usuario: `sa`
- Contraseña: *(vacía)*

---

## 📝 Notas

- Los datos se pierden al cerrar la app (BD en memoria)
- Usa `@Entity` para generar la tabla `Product` automáticamente
- El backend permite Cross-Origin para conexión con frontend (CORS)

---

## 👨‍💻 Autor

Test técnico generado por Felipe Rodríguez. Desarrollado en Spring Boot como prueba de habilidades backend.