package br.com.jetpack.compose.data.repository.user

import br.com.jetpack.compose.data.model.User
import br.com.jetpack.compose.data.repository.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun getUser(): Flow<DataState<User>> = flow {
        try {
            emit(DataState.loading())
            delay(1000)
            emit(DataState.success(user))
        } catch (e: Exception) {
            emit(DataState.error<User>(e.message ?: "Unknown Error"))
        }
    }
}