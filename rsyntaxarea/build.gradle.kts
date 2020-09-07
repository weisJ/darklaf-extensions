plugins {
    `java-library`
}

dependencies {
    compileOnly("com.github.weisj:darklaf-core")
    compileOnly("com.github.weisj:darklaf-property-loader")
    compileOnly("com.fifesoft:rsyntaxtextarea")
    testImplementation("com.github.weisj:darklaf-core")
    testImplementation("com.github.weisj:darklaf-property-loader")
    testImplementation("com.fifesoft:rsyntaxtextarea")
}
