pluginManagement {
    repositories {
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

rootProject.name = "Lesson6"
include(":app")
include(":getsharedpreferences")
include(":internalfilestorage")
include(":notebook")
include(":task_2_1")
include(":securesharedpreferences")
include(":employeedb")
