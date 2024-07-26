plugins {
    alias(libs.plugins.runify.android.library)
    alias(libs.plugins.runify.jvm.ktor)
}

android {
    namespace = "com.example.auth.data"
//        compileSdk = 34

}

dependencies {

    implementation(libs.bundles.koin)

    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)

//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
}