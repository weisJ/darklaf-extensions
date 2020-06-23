pluginManagement {
    plugins {
        fun String.v() = extra["$this.version"].toString()
        fun PluginDependenciesSpec.idv(id: String, key: String = id) = id(id) version key.v()

        idv("com.github.autostyle")
        idv("com.github.vlsi.crlf", "com.github.vlsi.vlsi-release-plugins")
        idv("com.github.vlsi.gradle-extensions", "com.github.vlsi.vlsi-release-plugins")
        idv("com.github.vlsi.license-gather", "com.github.vlsi.vlsi-release-plugins")
        idv("com.github.vlsi.stage-vote-release", "com.github.vlsi.vlsi-release-plugins")
        idv("org.jetbrains.kotlin.jvm", "kotlin")
    }
}

rootProject.name = "darklaf-extensions"

include(
    "dependencies-bom",
    "rsyntaxarea",
    "kotlin"
)

for (p in rootProject.children) {
    if (p.children.isEmpty()) {
        // Rename leaf projects only
        // E.g. we don't expect to publish examples as a Maven module
        p.name = "${rootProject.name}-${p.name}"
    }
}

fun property(name: String) =
    when (extra.has(name)) {
        true -> extra.get(name) as? String
        else -> null
    }

property("localDarklaf")?.ifBlank { "../darklaf" }?.let {
    println("Importing project '$it'")
    includeBuild(it)
}
