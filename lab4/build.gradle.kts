import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "me.milka"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}

dependencies {
    // https://mvnrepository.com/artifact/org.antlr/antlr4-runtime
    implementation("org.antlr:antlr4-runtime:4.10.1")

    // https://mavenlibs.com/maven/dependency/guru.nidi/graphviz-kotlin
    implementation("guru.nidi:graphviz-kotlin:0.18.1")
    // https://mavenlibs.com/maven/dependency/guru.nidi/graphviz-java
    implementation("guru.nidi:graphviz-java:0.18.1")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}