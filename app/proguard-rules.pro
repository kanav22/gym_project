# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keep class androidx.compose.runtime.** { *; }
-keep class kotlin.reflect.** { *; }
-keepclasseswithmembers class * {
    @androidx.compose.runtime.Composable *;
}

# Keep ViewModel classes
-keep class * extends androidx.lifecycle.ViewModel {
    <init>(...);
}

# Keep ViewModel and LiveData classes from being stripped out
-keep class androidx.lifecycle.** { *; }
-keep class * extends androidx.lifecycle.ViewModel {
    <init>(...);
}

# Keep all classes that might be stored in ViewModel
-keep class your.package.name.viewmodels.** { *; }

# If you're using reflection, keep class members from being renamed
-keepclassmembers class * {
    @com.google.gson.annotations.SerializedName <fields>;
}

# Keep custom LiveData and observers
-keep class * extends androidx.lifecycle.Observer {
    <init>(...);
}

# Keep all your activities and fragments if you're not explicitly using them via reflection
-keep public class * extends androidx.fragment.app.Fragment
-keep public class * extends androidx.appcompat.app.AppCompatActivity {
    public <init>(...);
}

# Additional rules for AndroidX if used
-keep class androidx.** { *; }
-dontwarn androidx.**
-keep class * extends androidx.** { *; }
-keep interface androidx.** { *; }


# Keep Hilt annotated classes and all their members from being stripped out
-keep @dagger.hilt.android.HiltAndroidApp class *
-keep @dagger.hilt.InstallIn class *
-keep @dagger.hilt.android.qualifiers.ApplicationContext class *
-keep @dagger.hilt.components.SingletonComponent class *
-keepclasseswithmembernames class * {
    @dagger.hilt.* <fields>;
    @dagger.hilt.* <methods>;
}

# Keep all classes and members that might be used via dependency injection
-keep @dagger.hilt.android.lifecycle.HiltViewModel class *
-keepclassmembers class * {
    @dagger.hilt.android.lifecycle.HiltViewModel <fields>;
    @dagger.hilt.android.lifecycle.HiltViewModel <methods>;
}

# Keep entries of Hilt modules
-keep class dagger.hilt.** { *; }
-keep class dagger.hilt.* { *; }
-keep class * extends dagger.hilt.android.HiltAndroidApp
-keep class * extends dagger.hilt.android.lifecycle.HiltViewModel

# Prevent Hilt from getting stripped
-keep class * {
    @dagger.hilt.InstallIn <fields>;
    @dagger.hilt.InstallIn <methods>;
}

# Keep annotations
-keepattributes *Annotation*
-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations

# General rule to prevent obfuscation of classes with injectable members
-keepclasseswithmembers class * {
    @javax.inject.Inject <init>(...);
}

# Keep all public classes that use @Inject
-keepclasseswithmembers class * {
    @javax.inject.Inject <fields>;
    @javax.inject.Inject <methods>;
}


# Remove all log statements in the release build
-assumenosideeffects class android.util.Log {
    public static *** v(...);
    public static *** d(...);
    public static *** i(...);
}