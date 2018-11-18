package keane.sean.counter.presentation.counter

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CounterPresenterTest {

    private val view: CounterViewMVP.View = mock()

    private val counterPresenter: CounterViewMVP.Presenter = CounterPresenter(view)

    /**
     * Given:   A user has freshly started the app
     * When:    The user presses the plus button
     * Then:    One should be added to the current count
     */
    @Test
    fun `when plus is pressed view is incremented by one`() {
        counterPresenter.plusPressed()
        verify(view).updateCounter("1")
    }

    /**
     * Given:   A user has freshly started the app
     * When:    The user presses the plus button
     * Then:    One should be subtracted from the current count
     */
    @Test
    fun `when minus is pressed view is decremented by one`() {
        counterPresenter.minusPressed()
        verify(view).updateCounter("-1")
    }



}