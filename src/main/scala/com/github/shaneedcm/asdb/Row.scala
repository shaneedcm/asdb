package com.github.shaneedcm.asdb

import java.util.Date

trait Row {
  def columns: List[Column]

  def column(index: Int): Column

  def column(name: String): Column

  // get column at `index` as String
  def getAsString(index: Int): Option[String] = column(index).getAsString
  def getAsInt(index: Int): Option[Int] = column(index).getAsInt
  def getAsLong(index: Int): Option[Long] = column(index).getAsLong
  def getAsFloat(index: Int): Option[Float] = column(index).getAsFloat
  def getAsDouble(index: Int): Option[Double] = column(index).getAsDouble
  def getAsDate(index: Int): Option[Date] = column(index).getAsDate

  // get column named `name` as String
  def getAsString(name: String): Option[String] = column(name).getAsString
  def getAsInt(name: String): Option[Int] = column(name).getAsInt
  def getAsLong(name: String): Option[Long] = column(name).getAsLong
  def getAsFloat(name: String): Option[Float] = column(name).getAsFloat
  def getAsDouble(name: String): Option[Double] = column(name).getAsDouble
  def getAsDate(name: String): Option[Date] = column(name).getAsDate
}