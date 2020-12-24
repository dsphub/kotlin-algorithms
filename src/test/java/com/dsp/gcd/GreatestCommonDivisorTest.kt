package com.dsp.gcd

import org.junit.Assert.assertEquals
import org.junit.Test

class GreatestCommonDivisorTest {
    @Test
    fun `gcd`() {
        val gcd = GreatestCommonDivisor.gcd(4851, 3003);

        assertEquals(231, gcd)
    }
}
