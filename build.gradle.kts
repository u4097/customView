plugins {
  id("com.gradle.build-scan") version "2.1"
}

buildScan {
  termsOfServiceUrl = "https://gradle.com/terms-of-service"
  termsOfServiceAgree = "yes"
  publishAlways()
}

buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:3.5.0-alpha03")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.20")

  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

tasks.register("clean",  Delete::class.java) {
  delete (rootProject.buildDir)
}
