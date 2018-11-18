package keane.sean.counter.test

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import keane.sean.counter.presentation.counter.CounterActivity
import keane.sean.counter.robot.counter
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CounterTests {

    @get:Rule
    val activityRule: ActivityTestRule<CounterActivity> =
            ActivityTestRule(CounterActivity::class.java)

    /**
     * Given:   A user has pressed the plus button
     * When:    The value was originally 0
     * Then:    The value should increment by 1
     **/
    @Test
    fun counterValueIncrementsByOneWhenPressedOnce() {
        counter {
            pressPlus()
        } result {
            isTheCountEqualTo(1)
        }
    }

}