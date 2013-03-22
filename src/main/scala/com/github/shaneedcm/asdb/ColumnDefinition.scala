package com.github.shaneedcm.asdb

/**
 * definition of a column
 */
trait ColumnDefinition {
  def table: String
  def tableAlias: String
  def name: String
  def nameAlias: String
  def schema: String
  def dataType: DataType.Value
  def defaultValue: Option[String]
  
  //TODO what is this length
  def length: Long
}