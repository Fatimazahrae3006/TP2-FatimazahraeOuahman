package com.example.devops

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 1) // Test qui échoue volontairement !
    }
    
    @Test  
    fun substract_isCorrect() {
        assertEquals(4, 8 - 3) // Test qui échoue volontairement !
    }
}