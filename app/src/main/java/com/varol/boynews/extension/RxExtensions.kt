package com.varol.boynews.extension

import io.reactivex.Single
import io.reactivex.exceptions.CompositeException

fun <T> Single<T>.dropBreadcrumb(): Single<T> {
    val breadcrumb = BreadcrumbException()
    return this.onErrorResumeNext { error: Throwable ->
        throw CompositeException(error, breadcrumb)
    }
}

class BreadcrumbException : Exception()