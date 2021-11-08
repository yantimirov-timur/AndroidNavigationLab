package com.yantimirov_timur.app_task3


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.openContextualActionModeOverflowMenu
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText


private fun openAboutViaOptions() {
    openContextualActionModeOverflowMenu()
    onView(withText(R.string.run_activity_about))
        .perform(click())
}

fun openAbout() = openAboutViaOptions()