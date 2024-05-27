plugins {
    alias(libs.plugins.runify.android.library)
    alias(libs.plugins.runify.android.room)
}

android {
    namespace = "com.example.core.database"
}

dependencies {

    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)

}