package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MinMax {

	/**
	 * Ищет минимальное число из двух переданных значений типа Int
	**/
	fun min(a: Int, b: Int) =
		if(a <= b)
			a
		else
			b

	/**
	 * Ищет максимальное число из двух переданных значений типа Int
	 **/
	fun max(a: Int, b: Int) =
		if(a >= b)
			a
		else
			b
}