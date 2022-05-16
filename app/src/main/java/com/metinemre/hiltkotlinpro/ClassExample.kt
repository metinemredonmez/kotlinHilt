package com.metinemre.hiltkotlinpro

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject
constructor(

    @FirstImplemantor private val myInterfaceImplemantor: MyInterface,
    private val gson: Gson,
    @SecondImplemantor private val mySecondInterfaceImplemantor: MyInterface


) //-> boyle durumda ıse  dıs kutuphan alındıgında

{
    fun myFunc(): String {
        return "working: ${myInterfaceImplemantor.MyPrintFunc()}"
    }

    fun secondFunc(): String {
        return "working : ${mySecondInterfaceImplemantor.MyPrintFunc()}"
    }


}