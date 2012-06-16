// Module script for production
import kotlin.modules.*
fun project() {
    module("Kotlin-Artemis") {
        sources += "F:/GitHub/GitHub/Kotlin-Artemis/src/artemis/Component.kt"
        // Boot classpath
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/alt-rt.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/charsets.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/deploy.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/javaws.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/jce.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/jsse.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/management-agent.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/plugin.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/resources.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/rt.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/dnsns.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/localedata.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/sunjce_provider.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/sunmscapi.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/sunpkcs11.jar"
        // Compilation classpath
        // Output directory, commented out
        //         classpath += "F:/GitHub/GitHub/Kotlin-Artemis/out/test/Kotlin-Artemis"
        // Output directory, commented out
        //         classpath += "F:/GitHub/GitHub/Kotlin-Artemis/out/production/Kotlin-Artemis"
        classpath += "F:/GitHub/GitHub/Kotlin-Artemis/lib/kotlin-runtime.jar"
        // Java classpath (for Java sources)
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_Maven_Resources_Compiler/Kotlin-Artemis.e5cc464e/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_Maven_Resources_Compiler/Kotlin-Artemis.e5cc464e/test"
        classpath += "F:/GitHub/GitHub/Kotlin-Artemis/src"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_PNG_files_caching_compiler/Kotlin-Artemis.e5cc464e/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_PNG_files_caching_compiler/Kotlin-Artemis.e5cc464e/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/aidl/Kotlin-Artemis.e5cc464e/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/aidl/Kotlin-Artemis.e5cc464e/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/aapt/Kotlin-Artemis.e5cc464e/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/aapt/Kotlin-Artemis.e5cc464e/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_BuildConfig_Generator/Kotlin-Artemis.e5cc464e/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_BuildConfig_Generator/Kotlin-Artemis.e5cc464e/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_Renderscript_Compiler/Kotlin-Artemis.e5cc464e/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_Renderscript_Compiler/Kotlin-Artemis.e5cc464e/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_Including_Compiler/Kotlin-Artemis.e5cc464e/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_Including_Compiler/Kotlin-Artemis.e5cc464e/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_External_Apklib_Extracting_Compiler/Kotlin-Artemis.e5cc464e/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin-artemis.b55273f1/.generated/Android_External_Apklib_Extracting_Compiler/Kotlin-Artemis.e5cc464e/production"
        // Main output
    }
}