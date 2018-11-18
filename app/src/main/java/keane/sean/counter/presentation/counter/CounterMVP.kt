package keane.sean.counter.presentation.counter

interface CounterMVP {

    interface Presenter {

        fun plusPressed()

        fun minusPressed()

    }

    interface View {

        fun updateCounter(count: String)

    }

}