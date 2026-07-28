
User Management API 🚀API RESTful desarrollada en Java con Spring Boot para la gestión básica de usuarios y configuración inicial de autenticación con Spring Security.

🛠️ Tecnologías y Librerías UtilizadasLenguaje:

Java 17+Framework 
Backend: Spring Boot
Seguridad: Spring Security (HTTP Basic Auth & BCrypt)
Persistencia: Spring Data JPA / Hibernate
Herramientas de Código: Project Lombok (Getters, Setters, Builders)
Validaciones: Jakarta Bean Validation (@NotBlank, @Email)
Gestor de Dependencias: Maven

📁 Estructura del Proyecto

src/main/java/com/proyect/usermanagement/
├── config/
│   └── SecurityConfig.java         # Configuración de Spring Security y PasswordEncoder
├── controller/
│   ├── AuthController.java         # Endpoints de autenticación (/auth)
│   └── UserController.java         # Endpoints de administración de usuarios (/users)
├── dto/
│   ├── request/
│   │   └── CreateUserRequest.java  # DTO para recepción y validación de datos de usuario
│   └── response/
│       └── UserResponse.java       # DTO para respuesta estructurada sin datos sensibles
├── model/
│   └── entity/
│       └── UserEntity.java         # Entidad JPA correspondiente a la tabla 'users'
├── repository/
│   └── UserRepository.java         # Interfaz JPA Repository (consultas por username/email)
├── security/
│   └── UserDetailsServiceImpl.java # Servicio de carga de usuarios para Spring Security
├── service/
│   ├── UserService.java            # Interfaz del servicio de negocio
│   └── impl/
│       └── UserServiceImpl.java    # Implementación de la lógica de creación de usuarios
└── UsermanagementApplication.java  # Clase principal (Bootstrap de Spring Boot)

⚙️ Funcionalidades Actuales
Creación de usuarios (POST /users):

Validación de datos de entrada (username, email y password).

Comprobación de nombres de usuario duplicados.

Encriptación automática de contraseñas mediante BCryptPasswordEncoder.

Retorno de información en formato seguro DTO (UserResponse).

Seguridad y Accesos:

Rutas públicas configuradas para /auth/** y /users (POST).

Resto de los endpoints protegidos mediante autenticación HTTP Basic.

Adaptación del modelo de datos a la interfaz UserDetails de Spring Security para el control de acceso.
