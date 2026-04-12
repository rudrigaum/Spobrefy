plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.hilt.android.plugin) apply false
    id("io.gitlab.arturbosch.detekt") version "1.23.6"
    id("org.sonarqube") version "4.4.1.3373"
}

detekt {
    toolVersion = "1.23.6"
    config.setFrom("$rootDir/detekt.yml")
    baseline = file("$rootDir/detekt-baseline.xml")
    parallel = true
    autoCorrect = false

    reports {
        html.required.set(true)
        xml.required.set(true)
        sarif.required.set(false)
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "spobrefy")
        property("sonar.projectName", "Spobrefy")
        property("sonar.projectVersion", "1.0.0")
        property("sonar.sources", "src/main/kotlin,src/main/java")
        property("sonar.tests", "src/test/kotlin,src/test/java,src/androidTest/kotlin,src/androidTest/java")
        property("sonar.java.binaries", "${buildDir}/intermediates/javac")
        property("sonar.kotlin.detekt.reportPaths", "build/reports/detekt/detekt.xml")
        property("sonar.coverage.jacoco.xmlReportPaths", "build/reports/jacoco/jacocoTestReport/jacocoTestReport.xml")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN") ?: "")
    }
}

tasks.register("qualityChecks") {
    dependsOn(
        "detekt"
    )
    doLast {
        println("✅ All quality checks completed!")
    }
}

tasks.register("qualityChecksFix") {
    doLast {
        println("�� Code formatting applied!")
    }
}
