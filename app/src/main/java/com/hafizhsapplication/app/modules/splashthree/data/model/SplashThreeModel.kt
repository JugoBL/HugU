package com.hafizhsapplication.app.modules.splashthree.`data`.model

import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHUGU: String? = MyApp.getInstance().resources.getString(R.string.lbl_hug_u)

)
