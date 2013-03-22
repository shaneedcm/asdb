package com.github.shaneedcm.asdb

import java.util.Date

trait Column {
  def getAsString: Option[String]
  def getAsInt: Option[Int]
  def getAsLong: Option[Long]
  def getAsFloat: Option[Float]
  def getAsDouble: Option[Double]
  def getAsDate: Option[Date]
}