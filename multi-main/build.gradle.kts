plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.fasterxml.jackson.module", "jackson-module-kotlin")
    implementation("org.springframework.boot", "spring-boot-starter-web")
    implementation("org.springframework.boot", "spring-boot-starter-actuator")
    implementation("org.springframework.boot", "spring-boot-devtools")
    testImplementation("org.springframework.boot", "spring-boot-starter-test")
    implementation(project(":multi-child"))
}
