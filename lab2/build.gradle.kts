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
    kotlinOptions.jvmTarget = "14"
}

application {
    mainClass.set("MainKt")
}

dependencies {
    // https://mavenlibs.com/maven/dependency/guru.nidi/graphviz-kotlin
    implementation("guru.nidi:graphviz-kotlin:0.18.1")
    // https://mavenlibs.com/maven/dependency/guru.nidi/graphviz-java
    implementation("guru.nidi:graphviz-java:0.18.1")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}
