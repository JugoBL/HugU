package com.hafizhsapplication.app.modules.akunlogindata.`data`.model

import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AkunLoginDataModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAKUNMU: String? = MyApp.getInstance().resources.getString(R.string.lbl_akunmu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEMAIL: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPASSWORD: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)

)
