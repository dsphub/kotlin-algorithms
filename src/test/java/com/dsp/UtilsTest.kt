package com.dsp

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import raiseToPower
import randomizeArray
import java.util.*

class UtilsTest {
    @Test
    fun `test randomize array`() {
        val origin = arrayOf(1, 2, 3, 4, 5)
        val actual = origin.copyOf()

        randomizeArray(actual)

        println(origin.contentToString())
        println(actual.contentToString())
        assertNotEquals(origin, actual)
    }

    @Test
    fun raise1ToPower0() {
        val actual = raiseToPower(1F, 0)

        assertEquals(1F, actual)
    }

    @Test
    fun raise1ToPower2() {
        val actual = raiseToPower(1F, 2)

        assertEquals(1F, actual)
    }

    @Test
    fun raise2ToPower1() {
        val actual = raiseToPower(2F, 1)

        assertEquals(2F, actual)
    }

    @Test
    fun raise2ToPower2() {
        val actual = raiseToPower(2F, 2)

        assertEquals(4F, actual)
    }

    @Test
    fun raise2ToPower3() {
        val actual = raiseToPower(2F, 3)

        assertEquals(8F, actual)
    }

    @Test
    fun raise2ToPower4() {
        val actual = raiseToPower(2F, 4)

        assertEquals(16F, actual)
    }

    @Test
    fun raise2ToPower5() {
        val actual = raiseToPower(2F, 5)

        assertEquals(32F, actual)
    }

    @Test
    fun raise2oPower6() {
        val actual = raiseToPower(2F, 6)

        assertEquals(64F, actual)
    }

    @Test
    fun raise2ToPower7() {
        val actual = raiseToPower(2F, 7)

        assertEquals(128F, actual)
    }

    @Test
    fun raise2ToPower8() {
        val actual = raiseToPower(2F, 8)

        assertEquals(256F, actual)
    }

    @Test
    fun raise2ToPower9() {
        val actual = raiseToPower(2F, 9)

        assertEquals(512F, actual)
    }

    @Test
    fun raise2ToPower10() {
        val actual = raiseToPower(2F, 10)

        assertEquals(1024F, actual)
    }

    @Test
    fun raise7ToPower6() {
        val actual = raiseToPower(7F, 6)

        assertEquals(117649F, actual)
    }
}