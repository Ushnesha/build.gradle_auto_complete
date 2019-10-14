
object Versions{
    val kotlin = "1.3.50"
    val appcompat = "1.1.0"
    val core = "1.1.0"
    val constraints_layout = "1.1.3"
    val junit = "4.12"
    val test_ext = "1.1.1"
    val test_espresso_core = "3.2.0"
    val build_gradle = "3.5.1"
    val compile_sdk = 28
    val min_sdk = 15
    val target_sdk = 28
    val build_tool = "28.0.3"
    val version_code = 1
    val version_name = "1.0"
}

object Deps{
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core}"
    val constraints_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraints_layout}"
    val junit_ext = "androidx.test.ext:junit:${Versions.test_ext}"
    val test_espresso = "androidx.test.espresso:espresso-core:${Versions.test_espresso_core}"
    val junit = "junit:junit:${Versions.junit}"
    val gradle_tool = "com.android.tools.build:gradle:${Versions.build_gradle}"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}
