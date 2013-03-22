package com.github.shaneedcm.asdb

import java.util.Date

trait Row {
  def columns: List[Column]

  def column(index: Int): Column

  def column(name: String): Column

  // get column at `index` as String
  def getAsString(index: Int): Option[String]
  def getAsInt(index: Int): Option[Int]
  def getAsLong(index: Int): Option[Long]
  def getAsFloat(index: Int): Option[Float]
  def getAsDouble(index: Int): Option[Double]
  def getAsDate(index: Int): Option[Date]
  
  // get column named `name` as String
  def getAsString(name: String): Option[String]
  def getAsInt(name: String): Option[Int]
  def getAsLong(name: String): Option[Long]
  def getAsFloat(name: String): Option[Float]
  def getAsDouble(name: String): Option[Double]
  def getAsDate(name: String): Option[Date]
}