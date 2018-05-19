plugins {
    java
    kotlin("jvm") version "1.2.41"
    application
}

application {
    mainClassName = "App"
}

dependencies {
    compile("com.google.guava:guava:23.0")
    testCompile("junit:junit:4.12")
}

repositories {
    jcenter()
    google()
}
