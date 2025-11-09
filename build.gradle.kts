plugins {
    java
    id("org.springframework.boot") version "3.5.4"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "web.app"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-web-services")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    runtimeOnly ("com.h2database:h2")

    implementation("org.hibernate.orm:hibernate-core:7.1.4.Final")

    implementation("jakarta.persistence:jakarta.persistence-api:3.2.0")

    implementation("com.mysql:mysql-connector-j:9.4.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}

springBoot {
    mainClass = "web.app.Main"
}
