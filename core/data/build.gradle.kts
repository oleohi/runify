plugins {
    alias(libs.plugins.runify.android.library)
    alias(libs.plugins.runify.jvm.ktor)
}

android {
    namespace = "com.example.core.data"
}


dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.database)

    implementation(libs.timber)
}