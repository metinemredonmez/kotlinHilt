package com.metinemre.hiltkotlinpro

import javax.inject.Inject


class InterfaceImplemantor
    @Inject constructor()
    : MyInterface {
    override fun MyPrintFunc(): String {

        return "my ınterface ımplemation"

    }
}