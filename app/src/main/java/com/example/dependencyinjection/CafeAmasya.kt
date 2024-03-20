package com.example.dependencyinjection

import javax.inject.Inject
import javax.inject.Singleton


class CafeAmasya @Inject constructor(@CookerImplementor val cookerImplementor: Person,@BarmenImplementor val barmenImplementor: Person

) {

   fun myFunction():String{
       return "working ${cookerImplementor.preparedProduct()}"
   }
    fun secondfunciton():String{
        return "working ${barmenImplementor.preparedProduct()}"
    }


}