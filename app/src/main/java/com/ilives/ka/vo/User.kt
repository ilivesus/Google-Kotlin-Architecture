package com.ilives.ka.vo

import android.arch.persistence.room.Entity
import com.google.gson.annotations.SerializedName

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.vo
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 09:35
 * -------------^_^-------------
 **/

@Entity(primaryKeys = ["login"])
data class User(
        @field:SerializedName("login")
        val login: String,
        @field:SerializedName("avatar_url")
        val avatarUrl: String?,
        @field:SerializedName("name")
        val name: String?,
        @field:SerializedName("company")
        val company: String?,
        @field:SerializedName("repos_url")
        val repoUrl: String?,
        @field:SerializedName("blog")
        val blog: String?
)