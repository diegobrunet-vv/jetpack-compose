package br.com.jetpack.compose.data.model

data class User(
    val name: String,
    val username: String,
    val job: String,
    val url: String? = null
)