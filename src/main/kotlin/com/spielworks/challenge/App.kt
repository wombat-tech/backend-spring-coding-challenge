package com.spielworks.challenge

import org.jooq.impl.DSL

fun main() {
  /*
   * This is just an example to test out the database connection.
   */
  val create = DSL.using("jdbc:h2:file:./db/main", "sa", "")
}
