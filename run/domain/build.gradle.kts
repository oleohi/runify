plugins {
    alias(libs.plugins.runify.jvm.library)
}


dependencies {
    implementation(libs.kotlinx.coroutines.core)

    implementation(projects.core.domain)
//    implementation(projects.core.connectivity.domain)
}