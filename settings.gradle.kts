pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "multiple-module-android"
include(":app")
include(":data:user")
include(":features:login")
include(":core:ui")
include(":core:utils")
include(":core:language")
include(":core:navigation")
include(":core:network")
include(":domain:local")
include(":domain:api")
