package com.metinemre.hiltkotlinpro

import javax.inject.Inject
import javax.inject.Singleton


// conts Injectıon

@Singleton // kapsam scope ! bunlar onemlı !
class Musicians
    @Inject
    constructor(instrument: Instrument, band: Band) {

      fun sing() {
          println("workıng")
      }


}