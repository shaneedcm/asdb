package com.github.shaneedcm.asdb

/**
 * create a connection factory
 */
trait ConnectionFactoryMethod {
  
  def supportedDBs: Set[String]
  /**
   * check if specified db is supported by this ConnectionFactoryMethod
   */
  def supportsDB(db: String): Boolean

  /**
   * if given db is supported, create ConnectionFactory.  if not supported returns None
   */
  def apply(url: String): Option[ConnectionFactory]

  /**
   * if given db is supported, create ConnectionFactory.  if not supported returns None
   */
  def apply(url: String, parameters: Map[String, Any]): Option[ConnectionFactory]
}