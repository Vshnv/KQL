package com.github.vshnv.kql

import com.github.vshnv.kql.schema.ColumnSchema
import com.github.vshnv.kql.schema.RowSchema
import javax.sql.DataSource

object MyRow: RowSchema<MyRow>() {
    val id = column<Int>("id_pk")
    val row = column<Int>("rrrr")
}

class Table<R: RowSchema<R>>(val source: DataSource, val name: String) {
    fun select(vararg columns: ColumnSchema<R,*>) {

    }
}