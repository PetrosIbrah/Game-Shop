FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .
RUN chmod +x gradlew
RUN ./gradlew clean build -x test
CMD ["java", "-jar", "build/libs/GameShop-1.0-SNAPSHOT.jar", "--spring.profiles.active=docker"]