# NPM peer dependency

This sets out a minimal reproduction of the unexpected errors of Gradle Kotlin plugin.

Specifically, building a Kotlin/JS project in a Gradle multi-module project emits unexpected unmet peer dependency warnings when a module's peer dependencies are provided by a dependent sub-project.

This reproduction was produced for the purposes of making a [report](https://youtrack.jetbrains.com/issue/KT-53850/KJS-Gradle-emits-unexpected-unmet-peer-dependency-warning-in-multi-module-build) to the Kotlin team.