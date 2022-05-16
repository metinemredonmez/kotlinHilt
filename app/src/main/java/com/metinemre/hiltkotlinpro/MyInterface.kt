package com.metinemre.hiltkotlinpro

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun MyPrintFunc(): String

}

//yontem 2 bence daha mantklı daha kolay !

@InstallIn(ApplicationComponent::class)
@Module
class myModule {

    @FirstImplemantor   //-> aslında su anda bırıbırında ayrıstırdık ! ama sınıf ıcınde kullan example ınject da soyelemeız lazm
    @Singleton
    @Provides
    fun provideFunc() : MyInterface {
        return InterfaceImplemantor()
    }
}


@SecondImplemantor
@Singleton
@Provides
fun SecondProviderFunc() :MyInterface {
    return SecondInterfaceImplemantor()
}

// dısarıdan kutuphan adlıgımıda gson ıcınornek

@Singleton
@Provides
fun gsonProvider() :Gson {
    return Gson()
}

// Annotation yapmak qualifier ve retention kullanmmaız lazım ! ımplamntorlerı ayrıdık ! bunlarla !

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplemantor


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplemantor




// yontem 1
//@InstallIn(ActivityComponent::class)
//@Module
//abstract class myModule {
//
//    @ActivityScoped
//    @Binds
//    abstract fun bindingFunction(myImplemantor: InterfaceImplemantor):MyInterface
//}