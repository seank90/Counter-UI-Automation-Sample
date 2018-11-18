package keane.sean.counter.presentation.counter

import keane.sean.counter.presentation.common.BasePresenter

class CounterPresenter(counterView: CounterViewMVP.View)
    : BasePresenter<CounterViewMVP.View>(), CounterViewMVP.Presenter {

    private var currentCount = 0

    init {
        attachView(counterView)
    }

    override fun plusPressed() {
        currentCount += 1
        view?.updateCounter(currentCount.toString())
    }

    override fun minusPressed() {
        currentCount -= 1
        view?.updateCounter(currentCount.toString())
    }
}