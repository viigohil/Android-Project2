package jlin2.examples.localtesting

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmailAddress() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun testValidSubdomainEmail(){
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))

    }

    @Test
    fun testInvalidEmailIncorrectDomain(){
        assertFalse(EmailValidator.isValidEmail("123@abc"))
      }
}