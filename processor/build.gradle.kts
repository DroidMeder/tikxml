plugins {
    java
    id("kotlin")
}

// apply(from = "$rootDir/maven-push-java-lib.gradle")
apply (plugin = "com.vanniktech.maven.publish")


dependencies {
    api(project(":core"))
    api(project(":annotation"))
    api(project(":processor-common"))

    compileOnly(Deps.incrementalAnnotation)

    implementation(Deps.guava)
    implementation(Deps.javaPoet)
    implementation(Deps.kotlinStdLib)
    implementation(Deps.kotlinReflect)
    implementation(Deps.autoServiceAnnotation)

    annotationProcessor(Deps.autoServiceProcessor)
    annotationProcessor(Deps.incrementalProcessor)
}
