package com.yantimirov_timur.lab3


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

/**
 * Run through all fragments and activity about
 */
fun runThroughBackStack() {
    onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
    onView(withId(R.id.bnToThird)).perform(ViewActions.click())
    openAbout()
    onView(withId(R.id.activity_about)).check(matches(isDisplayed()))
    onView(withId(R.id.activity_about)).perform(ViewActions.pressBack())
    onView(withId(R.id.fragment3)).check(matches(isDisplayed()))
    onView(withId(R.id.fragment3)).perform(ViewActions.pressBack())
    onView(withId(R.id.fragment2)).check(matches(isDisplayed()))
    onView(withId(R.id.fragment2)).perform(ViewActions.pressBack())
    onView(withId(R.id.fragment1)).check(matches(isDisplayed()))
}

