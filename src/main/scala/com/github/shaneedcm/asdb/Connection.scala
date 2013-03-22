/**
 *
 */
package com.github.shaneedcm.asdb

import scala.concurrent.Future

/**
 * @author shaneed
 * represents a connection to database
 */
trait Connection {
  def executeQuery(query: String): Future[ResultSet]

  /*def use(db: String): Future[Result]

  def describe(table: String): Future[Seq[ColumnDefinition]]*/

}