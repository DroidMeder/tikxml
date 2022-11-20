plugins {
    java
}

apply (plugin = "com.vanniktech.maven.publish")

dependencies {
    compile(project(":core"))
    compile(project(":annotation"))
    compile(Deps.retrofit)
    compile(Deps.kotlinStdLib)
    implementation(project(":processor-common"))
}
