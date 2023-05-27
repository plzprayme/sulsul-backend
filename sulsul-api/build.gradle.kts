dependencies {
    implementation(project(":sulsul-domain"))

    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
//    implementation("org.springframework.boot:spring-boot-starter-security")
}

tasks {
    bootJar {
        enabled = true
        archiveFileName.set("application.jar")
    }

    jar {
        enabled = false
    }
}
