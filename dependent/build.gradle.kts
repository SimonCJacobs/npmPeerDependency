repositories {
    mavenCentral()
}

plugins {
    kotlin("js") version  "1.7.10"
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
}

dependencies {
    project(":dependency")
    implementation(npm("@material-ui/core", "4.4.0"))
}