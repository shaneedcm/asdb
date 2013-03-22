package com.github.shaneedcm.asdb

/**
 * result of database operations
 */
trait ResultSet {
  def columnDefinitions: Seq[ColumnDefinition]
  def rows: Seq[Row]
  def affectedRows: Option[Long]
  def lastInsertId: Option[Long]
  def statusFlags: Int
  def warningCount: Int
}