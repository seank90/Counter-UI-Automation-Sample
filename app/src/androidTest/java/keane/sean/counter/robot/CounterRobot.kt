package keane.sean.counter.robot

import keane.sean.counter.R.id.*

fun counter(func: CounterRobot.() -> Unit) = CounterRobot().apply { func() }

class CounterRobot : BaseTestRobot() {

    fun pressPlus() {
        clickButton(plusButton)
    }

    fun pressMinus() {
        clickButton(minusButton)
    }

    fun pressPlusThisManyPresses(presses: Int) {
        for (i in presses downTo 0) {
            pressPlus()
        }
    }

    fun pressMinusThisManyPresses(presses: Int) {
        for (i in presses downTo 0) {
            pressMinus()
        }
    }

    infix fun result(func: ResultRobot.() -> Unit): ResultRobot {
        return ResultRobot().apply { func() }
    }

}

class ResultRobot : BaseTestRobot() {

    fun isTheCountEqualTo(value: Int) {
        matchText(counterTextView, value.toString())
    }

}