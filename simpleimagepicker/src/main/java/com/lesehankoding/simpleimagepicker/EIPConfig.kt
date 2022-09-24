package com.lesehankoding.simpleimagepicker


class EIPConfig (
	var isCropAspectRatio : Boolean = true,
	var cropRatio: RATIO = RATIO.DEFAULT,
	var compressMaxWeight : Int = 680,
	var compressMaxHeight : Int = 680,
	var imageCompression : Int = 80,
	var setTitleCrop : String = "Edit",
	var setWidgetToolbarColor:Int = com.yalantis.ucrop.R.color.ucrop_color_black,
	var setToolbarColor:Int = R.color.colorPrimaryEIP,
)
sealed class RATIO {
	object DEFAULT : RATIO()
	object WIDE : RATIO()
}