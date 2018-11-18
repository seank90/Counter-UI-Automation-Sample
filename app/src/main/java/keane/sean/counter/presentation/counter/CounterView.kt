package keane.sean.counter.presentation.counter

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import keane.sean.counter.R
import kotlinx.android.synthetic.main.view_counter.view.*

class CounterView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), CounterMVP.View {

    private val presenter: CounterMVP.Presenter by lazy { CounterPresenter(this) }

    init {
        inflate(context, R.layout.view_counter, this)
        setListeners()
    }

    private fun setListeners() {
        plusButton.setOnClickListener { presenter.plusPressed() }
        minusButton.setOnClickListener { presenter.minusPressed() }
    }

    override fun updateCounter(count: String) {
        counterTextView.text = count
    }
}