package com.example.dependencyinjection

import javax.inject.Inject

class Cooker @Inject constructor():Person{
    override fun preparedProduct(): String {
        return "coooker "
    }



}
