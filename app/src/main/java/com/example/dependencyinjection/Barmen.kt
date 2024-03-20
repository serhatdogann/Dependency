package com.example.dependencyinjection

import javax.inject.Inject

class Barmen @Inject constructor():Person {
    override fun preparedProduct():String {

        return "barmen "
    }

}