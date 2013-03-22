package com.github.shaneedcm.asdb

/**
 * data type of a column
 */
object DataType extends Enumeration {
  val Decimal = Value(0x0)
  val TinyInt = Value(0x1)
  val ShortInt = Value(0x2)
  val LongInt = Value(0x3)
  val Float = Value(0x4)
  val Double = Value(0x5)
  val Null = Value(0x6)
  val Timestamp = Value(0x7)
  val LongLong = Value(0x8)
  val Int24 = Value(0x9)
  val Date = Value(0xa)
  val Time = Value(0xb)
  val DateTime = Value(0xc)
  val Year = Value(0xd)
  val NewDate = Value(0xe)
  val Varchar = Value(0xf)
  val Bit = Value(0x10)
  val NewDecimal = Value(0xf6)
  val Enum = Value(0xf7)
  val Set = Value(0xf8)
  val TinyBlob = Value(0xf9)
  val MediumBlob = Value(0xfa)
  val LongBlob = Value(0xfb)
  val Blob = Value(0xfc)
  val VarString = Value(0xfd)
  val String = Value(0xfe)
  val Geometry = Value(0xff)
}