plugins {
    java
}

group = "net.envinet.prototyp"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}

dependencies {

    compile ( "org.swinglabs.swingx", "swingx-all", "1.6.4")
    testCompile("org.junit.jupiter", "junit-jupiter-api", "5.4.2")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.4.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}


