# Etapa 1: Construcción (Build)
FROM eclipse-temurin:25-jdk-alpine AS build
WORKDIR /workspace/app

# Copiamos los archivos del wrapper de Maven y el código fuente
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Damos permisos de ejecución al wrapper de Maven y construimos el .jar omitiendo los tests
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Etapa 2: Ejecución (Run)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copiamos el archivo .jar generado en la etapa de construcción
COPY --from=build /workspace/app/target/*.jar app.jar

# Exponemos el puerto que usa Spring Boot por defecto
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]