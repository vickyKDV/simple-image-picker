package com.lesehankoding.simpleimagepicker

import androidx.core.content.*


class EIPConfig (
	var isCropAspectRatio : Boolean = true,
	var cropRatio: RATIO = RATIO.DEFAULT,
	var compressMaxWeight : Int = 680,
	var compressMaxHeight : Int = 680,
	var imageCompression : Int = 80,
	var setTitleCrop : String = "Edit",
	var setWidgetToolbarColor:Int = com.yalantis.ucrop.R.color.ucrop_color_black,
	var setToolbarColor:Int = R.color.SIPcolorPrimary,
	var titleDialog: Int = R.string.sip_choice_selected
)
sealed class RATIO {
	object DEFAULT : RATIO()
	object WIDE : RATIO()
}