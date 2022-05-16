package com.metinemre.hiltkotlinpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //field Injection
     @Inject
     lateinit var emre: Musicians

     @Inject
     lateinit var myClass: ClassExample




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // depen ->  ıcın otomatık hılt kullanıyoruz kutuphane ! -> bunun dışında bu ıslemı dagger yerıne artı hilt e bıraktı !
//        val instrument = Instrument()
//        val band =  Band()
//        val james = Musicians(instrument,band)
//
//        james.sing()



        println(myClass.myFunc())






    }

}

class fragmentExample() : Fragment() {
    
}