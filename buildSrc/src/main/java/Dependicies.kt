package com.hamuli.tutorial.buildsrc

import org.gradle.api.artifacts.dsl.DependencyHandler

object Retrofit {
    private const val version = "2.9.0"

    const val core = "com.squareup.retrofit2:retrofit:$version"
    const val moshi_converter = "com.squareup.retrofit2:converter-moshi:$version"
}

object Moshi {
    private const val version = "1.12.0"

    const val core = "com.squareup.moshi:moshi:$version"
    const val adapters = "com.squareup.moshi:moshi-adapters:$version"
    const val kotlin = "com.squareup.moshi:moshi-kotlin:$version"
    const val code_gen = "com.squareup.moshi:moshi-kotlin-codegen:$version"
}

fun DependencyHandler.useRetrofit() {
    implementation(Retrofit.core)
    implementation(Retrofit.moshi_converter)
}

fun DependencyHandler.useMoshi() {
    implementation(Moshi.core)
    implementation(Moshi.adapters)
    implementation(Moshi.kotlin)
    kapt(Moshi.code_gen)
}