package jlin2.examples.localtesting

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.Intents.init
import androidx.test.espresso.intent.Intents.release

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @JvmField
    @Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun testChangeTextButtonWith123() {
        // Launch the MainActivity
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        // Type "123" into the input field and close the keyboard
        onView(withId(R.id.userNameInput)).perform(typeText("123"), closeSoftKeyboard())

        // Click the Change Text button
        onView(withId(R.id.changeTextBt)).perform(click())

        // Check if the TextView text is updated to "123"
        onView(withId(R.id.textToBeChanged)).check(matches(withText("123")))

        // Close the activity scenario
        activityScenario.close()
    }

    @Test
    fun testOpenActivityAndChangeTextButtonWith123() {
        // Initialize Espresso Intents
        init()

        // Launch the MainActivity
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        // Type "123" into the input field and close the keyboard
        onView(withId(R.id.userNameInput)).perform(typeText("123"), closeSoftKeyboard())

        // Click the Open Activity and Change Text button
        onView(withId(R.id.activityChangeTextBtn)).perform(click())  // Corrected ID

        // Verify that the new activity was started
        intended(IntentMatchers.hasComponent(ShowTextActivity::class.java.name))

        // Check if the TextView in ShowTextActivity is updated to "123"
        onView(withId(R.id.showTextView)).check(matches(withText("123")))

        // Release Espresso Intents
        release()

        // Close the activity scenario
        activityScenario.close()
    }

    @Test
    fun testChangeTextButtonWithEmptyInput() {
        // Launch the MainActivity
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        // Click the Change Text button without typing anything
        onView(withId(R.id.changeTextBt)).perform(click())

        // Check if the TextView text is updated to an empty string
        onView(withId(R.id.textToBeChanged)).check(matches(withText("")))

        // Close the activity scenario
        activityScenario.close()
    }

    @Test
    fun testOpenActivityAndChangeTextButtonWithEmptyInput() {
        // Initialize Espresso Intents
        init()

        // Launch the MainActivity
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        // Click the Open Activity and Change Text button without typing anything
        onView(withId(R.id.activityChangeTextBtn)).perform(click())  // Corrected ID

        // Verify that the new activity was started
        intended(IntentMatchers.hasComponent(ShowTextActivity::class.java.name))

        // Check if the TextView in ShowTextActivity is updated to an empty string
        onView(withId(R.id.showTextView)).check(matches(withText("")))

        // Release Espresso Intents
        release()

        // Close the activity scenario
        activityScenario.close()
    }

    @Test
    fun testChangeTextButtonWithAbcdef() {
        // Launch the MainActivity
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        // Type "abcdef" into the input field and close the keyboard
        onView(withId(R.id.userNameInput)).perform(typeText("abcdef"), closeSoftKeyboard())

        // Click the Change Text button
        onView(withId(R.id.changeTextBt)).perform(click())

        // Check if the TextView text is updated to "abcdef"
        onView(withId(R.id.textToBeChanged)).check(matches(withText("abcdef")))

        // Close the activity scenario
        activityScenario.close()
    }

    @Test
    fun testOpenActivityAndChangeTextButtonWithAbcdef() {
        // Initialize Espresso Intents
        init()

        // Launch the MainActivity
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        // Type "abcdef" into the input field and close the keyboard
        onView(withId(R.id.userNameInput)).perform(typeText("abcdef"), closeSoftKeyboard())

        // Click the Open Activity and Change Text button
        onView(withId(R.id.activityChangeTextBtn)).perform(click())  // Corrected ID

        // Verify that the new activity was started
        intended(IntentMatchers.hasComponent(ShowTextActivity::class.java.name))

        // Check if the TextView in ShowTextActivity is updated to "abcdef"
        onView(withId(R.id.showTextView)).check(matches(withText("abcdef")))

        // Release Espresso Intents
        release()

        // Close the activity scenario
        activityScenario.close()
    }
}
