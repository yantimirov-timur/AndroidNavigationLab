package com.yantimirov_timur.app_task5

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.Assert
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class ActivityStatesTest {

    @get:Rule
    var rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun launch() {
        launchActivity<MainActivity>()
    }

    @Test
    fun testForDestroyed() {
        val scenario = rule.scenario
        Espresso.pressBackUnconditionally()
        assertEquals(scenario.state, Lifecycle.State.DESTROYED)
    }

    @Test
    fun testForDestroyedBackStack() {
        runThroughBackStack()
        val scenario = rule.scenario
        Espresso.pressBackUnconditionally()
        assertEquals(scenario.state, Lifecycle.State.DESTROYED)
    }
}