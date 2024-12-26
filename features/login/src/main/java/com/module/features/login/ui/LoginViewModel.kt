package com.module.features.login.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.module.core.network.model.Status
import com.module.core.ui.base.BaseViewModel
import com.module.core.utils.extensions.constants.PreferenceKey
import com.module.core.utils.extensions.shared_preferences.AppPreferences
import com.module.domain.api.model.Login
import com.module.domain.api.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: AuthRepository,
    private val appPreferences: AppPreferences
) : BaseViewModel() {

    val uiState = MutableLiveData<LoginState>()

    fun login(username: String, password: String) {
        isLoading.value = true
        viewModelScope.launch(Dispatchers.IO) {
            repository.login(Login.Request(username, password)).collect {
                when (it.status) {
                    Status.SUCCESS -> {
                        val response = it.data
                        response?.let {
                            appPreferences.put(PreferenceKey.ACCESS_TOKEN, it.accessToken)
                            withContext(Dispatchers.Main) {
                                uiState.value = LoginState.LoginSuccess
                            }
                        } ?: {
                            uiState.value = LoginState.LoginFailed(it.exception)
                        }
                    }

                    Status.ERROR -> {
                        withContext(Dispatchers.Main) {
                            uiState.value = LoginState.LoginFailed(it.exception)
                        }
                    }

                    else -> {

                    }
                }
            }
        }
    }

}

sealed class LoginState {
    data object LoginSuccess : LoginState()
    data class LoginFailed(val e: Throwable?) : LoginState()
}