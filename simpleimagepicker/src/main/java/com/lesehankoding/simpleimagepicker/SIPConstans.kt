package com.lesehankoding.simpleimagepicker

import android.annotation.*
import android.graphics.*


object SIPConstans {
	val TAG = "EIP-LOG"
	const val INTENT_IMAGE_PICKER_OPTION = "image_picker_option"
	const val INTENT_ASPECT_RATIO_X = "aspect_ratio_x"
	const val INTENT_ASPECT_RATIO_Y = "aspect_ratio_Y"
	const val INTENT_LOCK_ASPECT_RATIO = "lock_aspect_ratio"
	const val TITLE_TOOLBAR = "toolbar_crop_title"
	const val WIDGET_TOOLBAR_COLOR = "widget_crop_color"
	const val TOOLBAR_COLOR = "toolbar_crop_color"
	const val INTENT_IMAGE_COMPRESSION_QUALITY = "compression_quality"
	const val INTENT_SET_BITMAP_MAX_WIDTH_HEIGHT = "set_bitmap_max_width_height"
	const val INTENT_BITMAP_MAX_WIDTH = "max_width"
	const val INTENT_BITMAP_MAX_HEIGHT = "max_height"
	const val TITLE_DIALOG = "TITLE_DIALOG"
	const val REQUEST_IMAGE_CAPTURE = 0
	const val REQUEST_GALLERY_IMAGE = 1
	var fileName : String? = null
	const val DEFAULT_MAX_WIDTH = 480
	const val DEFAULT_MAX_HEIGHT = 480
	const val DEFAULT_COMPRESSION_QTY = 80
	const val DEFAULT_ASPECT_RATIO_X  = 16
	const val DEFAULT_ASPECT_RATIO_Y  = 9


}