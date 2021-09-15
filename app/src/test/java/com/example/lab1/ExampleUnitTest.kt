package com.example.lab1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

	@Test
	fun minTest() {
		val a: Int = 4
		val b: Int = 8
		val expect = 4
		val minMax = MinMax()
		val actual = minMax.min(a, b)
		assertEquals(expect, actual)
	}

	@Test
	fun maxTest() {
		val a: Int = 4
		val b: Int = 8
		val expect = 8
		val minMax = MinMax()
		val actual = minMax.max(a, b)
		assertEquals(expect, actual)
	}

	@Test
	fun addition_isCorrect() {
		assertEquals(4, 2 + 2)
	}
}