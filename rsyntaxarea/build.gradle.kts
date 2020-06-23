plugins {
    `java-library`
}

dependencies {
    compileOnly("com.github.weisj:darklaf-core")
    compileOnly("com.fifesoft:rsyntaxtextarea")
    testImplementation("com.github.weisj:darklaf-core")
    testImplementation("com.fifesoft:rsyntaxtextarea")
}
