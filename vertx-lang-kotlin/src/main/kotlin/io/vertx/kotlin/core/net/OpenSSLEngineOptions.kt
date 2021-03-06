package io.vertx.kotlin.core.net

import io.vertx.core.net.OpenSSLEngineOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.OpenSSLEngineOptions] objects.
 *
 * Configures a [io.vertx.core.net.TCPSSLOptions] to use OpenSsl.
 *
 * @param sessionCacheEnabled  Set whether session cache is enabled in open SSL session server context
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.OpenSSLEngineOptions original] using Vert.x codegen.
 */
fun OpenSSLEngineOptions(
  sessionCacheEnabled: Boolean? = null): OpenSSLEngineOptions = io.vertx.core.net.OpenSSLEngineOptions().apply {

  if (sessionCacheEnabled != null) {
    this.setSessionCacheEnabled(sessionCacheEnabled)
  }
}

