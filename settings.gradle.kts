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
        maven ("https://jcenter.bintray.com")
        maven ("https://jitpack.io")}
    }

rootProject.name = "Location_View_Booking"
include(":app")
 