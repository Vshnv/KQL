package com.github.vshnv.kql.schema

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

data class ColumnSchema<R,T>(val columnName: String)