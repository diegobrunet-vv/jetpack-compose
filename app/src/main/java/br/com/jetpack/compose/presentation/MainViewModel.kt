package br.com.jetpack.compose.presentation

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.jetpack.compose.data.model.User
import br.com.jetpack.compose.data.repository.user.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val user: MutableState<User?> = mutableStateOf(null)

    init {
        getUser()
    }

    private fun getUser() {
        viewModelScope.launch {
            userRepository.getUser().collect { dataState ->
                dataState.data?.let { data ->
                    user.value = data
                }
                dataState.error?.let { error ->
                    Log.e(TAG, "error: $error")
                }
            }
        }
    }
}