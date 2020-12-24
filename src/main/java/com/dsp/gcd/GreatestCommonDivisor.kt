package com.dsp.gcd

class GreatestCommonDivisor {
    companion object {
        fun gcd(a: Int, b: Int): Int {
            var aa = a
            var bb = b
            while (bb != 0) {
                val remainder = aa % bb
                aa -= bb
                bb -= remainder
            }
            return aa
        }
    }
}