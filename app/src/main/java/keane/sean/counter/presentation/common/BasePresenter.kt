package keane.sean.counter.presentation.common

import java.lang.ref.WeakReference

abstract class BasePresenter<V> protected constructor() {

    private var viewReference: WeakReference<V>? = null

    val view: V?
        get() = if (viewReference == null) null else viewReference!!.get()

    fun attachView(view: V) {
        viewReference = WeakReference(view)
    }

    fun detachView() {
        if (viewReference != null) {
            viewReference!!.clear()
            viewReference = null
        }
    }

    protected fun viewIsAttached(): Boolean {
        return viewReference != null && viewReference!!.get() != null
    }

}