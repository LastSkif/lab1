package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MinMax {

	fun min(a: Int, b: Int) =
		if(a <= b)
			a
		else
			b

	fun max(a: Int, b: Int) =
		if(a >= b)
			a
		else
			b
}