# Utilizar una imagen base con Maven y Java 17
FROM maven:3.9.6-amazoncorretto-17 as build

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo pom.xml
COPY pom.xml .

# Descargar las dependencias de Maven (separado para aprovechar la caché)
RUN mvn dependency:go-offline -B

# Copiar los archivos fuente de la aplicación
COPY src ./src

# Empaquetar la aplicación con Maven
RUN mvn package -DskipTests

# Crear una imagen ligera basada en una JRE
FROM amazoncorretto:17-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el JAR construido desde la imagen de compilación al contenedor
COPY --from=build /app/target/purchase-1.0.0-SNAPSHOT.jar .

# Especificar el comando predeterminado para ejecutar la aplicación
CMD ["java", "-jar", "purchase-1.0.0-SNAPSHOT.jar"]
