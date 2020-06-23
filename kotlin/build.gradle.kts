plugins {
    `java-library`
    kotlin("jvm")
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("com.github.weisj:darklaf-core")
    compileOnly("com.github.weisj:darklaf-property-loader")
    testImplementation("com.github.weisj:darklaf-property-loader")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}
