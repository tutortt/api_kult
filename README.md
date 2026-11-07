# Ecommerce

API REST de ecommerce construida con Spring Boot. Actualmente permite consultar y administrar categorías almacenadas en MySQL.

## Tecnologías

- Java 25
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA / Hibernate
- MySQL
- Maven

## Requisitos

- JDK 25 o superior.
- Apache Maven instalado.
- MySQL en ejecución.
- Una base de datos llamada `kult` y las tablas compatibles con las entidades del proyecto.

Hibernate está configurado con `ddl-auto=validate`: comprueba que el esquema exista, pero no crea ni modifica tablas automáticamente.

## Configuración local

1. Copia la plantilla de variables:

   ```powershell
   Copy-Item .env.example .env
   ```

2. Edita `.env` y configura `DB_URL`, `DB_USERNAME` y `DB_PASSWORD` con los datos de tu instancia MySQL. La contraseña de ejemplo es solo un marcador; reemplázala por tu propia contraseña.

   El archivo `.env` se carga desde `application.properties` y está excluido de Git para no publicar credenciales. `.env.example` contiene únicamente valores de muestra y sí se versiona.

3. Ejecuta las pruebas:

   ```powershell
   mvn test
   ```

4. Inicia la aplicación:

   ```powershell
   mvn spring-boot:run
   ```

La API estará disponible en `http://localhost:8080`.

## Endpoints de categorías

La ruta base es `/api/categorias`.

| Método | Ruta | Descripción | Respuesta exitosa |
|---|---|---|---|
| `GET` | `/api/categorias` | Lista las categorías | `200 OK` |
| `GET` | `/api/categorias/{id}` | Obtiene una categoría | `200 OK` |
| `POST` | `/api/categorias` | Crea una categoría | `201 Created` |
| `PUT` | `/api/categorias/{id}` | Actualiza nombre y descripción | `200 OK` |
| `DELETE` | `/api/categorias/{id}` | Elimina una categoría | `204 No Content` |

Ejemplo del cuerpo para crear o actualizar:

```json
{
  "nombre": "Accesorios",
  "descripcion": "Productos complementarios"
}
```

El nombre es obligatorio. La API responde `400 Bad Request` si falta o está vacío y `404 Not Found` si el identificador solicitado no existe.

## Estructura principal

- `controller`: controladores REST.
- `service`: lógica y validaciones de negocio.
- `repository`: acceso a datos con Spring Data JPA.
- `model`: entidades persistentes.
- `src/main/resources/application.properties`: configuración de Spring y conexión a MySQL.
- `.env.example`: plantilla de variables de entorno para configurar el proyecto.
