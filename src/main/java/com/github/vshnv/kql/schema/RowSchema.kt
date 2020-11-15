package com.github.vshnv.kql.schema

open class RowSchema<S: RowSchema<S>> {
    protected fun <T> column(fieldName: String): ColumnSchema<S,T> = ColumnSchema(fieldName)
}