package keane.sean.counter.presentation.counter

interface CounterViewMVP {

    interface Presenter {

        fun plusPressed()

        fun minusPressed()

    }

    interface View {

        fun updateCounter(count: String)

    }

}