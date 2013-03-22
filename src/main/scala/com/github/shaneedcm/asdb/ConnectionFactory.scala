package com.github.shaneedcm.asdb

/**
 * Connection Factory creates connection
 */
trait ConnectionFactory {
	def getConnection : Connection
}