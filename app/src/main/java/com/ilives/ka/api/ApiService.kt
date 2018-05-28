package com.ilives.ka.api

import android.arch.lifecycle.LiveData
import com.ilives.ka.vo.User
import retrofit2.http.Path

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.api
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 09:33
 * -------------^_^-------------
 **/
interface ApiService{
    fun getUser(@Path("login") login: String): LiveData<ApiResponse<User>>
}