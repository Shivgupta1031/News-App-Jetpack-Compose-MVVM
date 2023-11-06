object Dependencies{

    val coreKtx by lazy {"androidx.core:core-ktx:${Versions.coreKtx}"}
    val lifecycleRuntimeKtx by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"}
    val activityCompos by lazy {"androidx.activity:activity-compose:${Versions.activityCompos}"}
    val composeBom by lazy {"androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUI by lazy {"androidx.compose.ui:ui"}
    val composeUiGraphics by lazy {"androidx.compose.ui:ui-graphics"}
    val composeToolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial by lazy {"androidx.compose.material3:material3"}
    val junit by lazy {"junit:junit:${Versions.junit}"}
    val textJunit by lazy {"androidx.test.ext:junit:${Versions.textJunit}"}
    val composeJunit by lazy {"androidx.compose.ui:ui-test-junit4"}
    val espressoCore by lazy {"androidx.test.espresso:espresso-core:${Versions.espressoCore}"}
    val composeUiTooling by lazy {"androidx.compose.ui:ui-tooling"}
    val composeTextManifest by lazy {"androidx.compose.ui:ui-test-manifest"}

    val hiltAndroid by lazy {"com.google.dagger:hilt-android:${Versions.hilt}"}
    val hiltAndroidCompiler by lazy {"com.google.dagger:hilt-android-compiler:${Versions.hilt}"}
    val hiltCompiler by lazy {"androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"}

    val hiltNavigationCompose by lazy {"androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"}
    val androidxNavigation by lazy { "androidx.navigation:navigation-compose:${Versions.androidxNavigation}"}

    val retrofit by lazy {"com.squareup.retrofit2:retrofit:${Versions.retrofit}"}
    val okhttp by lazy {"com.squareup.okhttp3:okhttp:${Versions.okhttp}"}
    val gsonConverter by lazy {"com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}"}
    val moshi by lazy {"com.squareup.moshi:moshi-kotlin:${Versions.moshi}"}
    val moshiConverter by lazy {"com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}"}
    val loggingInterceptor by lazy {"com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"}

    val coroutinesCore by lazy {"org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"}
    val coroutinesAndroid by lazy {"org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"}

    val splashScreen by lazy {"androidx.core:core-splashscreen:${Versions.splashScreen}"}

    val coil by lazy {"io.coil-kt:coil-compose:${Versions.coil}"}

}

object Modules{
    const val utilities = ":utilities"
}