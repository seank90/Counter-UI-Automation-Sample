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
    fun counterValueIncrementsByOneWhenPlusPressedOnce() {
        counter {
            pressPlus()
        } result {
            isTheCountEqualTo(1)
        }
    }

    /**
     * Given:   A user has pressed the minus button
     * When:    The value was originally 0
     * Then:    The value should decrement by 1
     **/
    @Test
    fun counterValueDecrementsByOneWhenMinusPressedOnce() {
        counter {
            pressMinus()
        } result {
            isTheCountEqualTo(-1)
        }
    }

    /**
     * Given:   A user has pressed the plus button 5 times
     * When:    The value was originally 0
     * Then:    The value should increment by 5
     **/
    @Test
    fun counterValueIncrementsByFiveWhenPlusPressedFiveTimes() {
        counter {
            pressPlusThisManyPresses(5)
        } result {
            isTheCountEqualTo(5)
        }
    }

    /**
     * Given:   A user has pressed the minus button 5 times
     * When:    The value was originally 0
     * Then:    The value should decrement by 5
     **/
    @Test
    fun counterValueDecrementsByFiveWhenMinusPressedFiveTimes() {
        counter {
            pressMinusThisManyPresses(5)
        } result {
            isTheCountEqualTo(-5)
        }
    }

    /**
     * Given:   A user has just launched the app
     * When:    The value set to be originally 0
     * Then:    The value should be 0
     **/
    @Test
    fun counterValueStartsAtZero() {
        counter {
        } result {
            isTheCountEqualTo(0)
        }
    }
}