package com.example.servicemasterandroidpro

class Executer{
    fun stepen(b:Int):MutableList<Int>
    {
        val a = mutableListOf(1)
        for (i in 1..b)
        {
            var y = 0
            var x = a.size
            var j = 0
            while (j<x) {
                a[j] = a[j]*3 + y
                y = 0
                    if (a[j] >= 10) {
                        if (j + 1 == x) {
                            a.add(0)
                            x++
                        }
                        y = a[j] / 10
                        a[j] %= 10
                    }
                j++
                }
            }
        return a
    }
}