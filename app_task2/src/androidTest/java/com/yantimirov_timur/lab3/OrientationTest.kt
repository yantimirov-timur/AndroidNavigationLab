package com.yantimirov_timur.lab3

import android.content.pm.ActivityInfo
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.yantimirov_timur.app_task2.MainActivity
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Thread.sleep

@RunWith(AndroidJUnit4::class)
class OrientationTest {

    @Test
    fun changeOrientationOnEveryFragment() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        activityScenario.onActivity { activity ->
            activity.recreate()
        }
        onView(withId(R.id.fragment1)).check(matches(isDisplayed()))
        onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        activityScenario.onActivity { activity ->
            activity.recreate()
        }
        onView(withId(R.id.fragment2)).check(matches(isDisplayed()))

        onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        activityScenario.onActivity { activity ->
            activity.recreate()
        }
        onView(withId(R.id.fragment3)).check(matches(isDisplayed()))

    }
}