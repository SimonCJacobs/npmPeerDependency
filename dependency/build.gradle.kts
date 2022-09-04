repositories {
    mavenCentral()
}

plugins {
    kotlin("js") version  "1.7.10"
}

kotlin {
    js {
        browser()
    }
}

dependencies {
    api(npm("react", "16.8.0"))
    api(npm("react-dom", "16.8.0"))
}