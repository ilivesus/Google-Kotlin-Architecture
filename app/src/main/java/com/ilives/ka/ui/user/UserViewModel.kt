package com.ilives.ka.ui.user

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.ilives.ka.util.AbsentLiveData
import com.ilives.ka.vo.Resource
import com.ilives.ka.repository.UserRepository
import com.ilives.ka.vo.User
import javax.inject.Inject

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.ui.user
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 11:33
 * -------------^_^-------------
 **/
class UserViewModel
@Inject constructor(userRepository: UserRepository) : ViewModel() {
    private val _login = MutableLiveData<String>()
    val login: LiveData<String>
        get() = _login
    val user: LiveData<Resource<User>> = Transformations
            .switchMap(_login) { login ->
                if (login == null) {
                    AbsentLiveData.create()
                } else {
                    userRepository.loadUser(login)
                }
            }

    fun setLogin(login: String?) {
        if (_login.value != login) {
            _login.value = login
        }
    }

    fun retry() {
        _login.value?.let {
            _login.value = it
        }
    }
}