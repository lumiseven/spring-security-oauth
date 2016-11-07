/*
 * Copyright 2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.oauth.consumer;

/**
 * Thrown when a different realm appears to be the cause of the authorization failure.
 * 
 * @author Ryan Heaton
 */
@SuppressWarnings("serial")
public class InvalidOAuthRealmException extends OAuthRequestFailedException {

  private final String requiredRealm;

  public InvalidOAuthRealmException(String msg, String requiredRealm) {
    super(msg);
    this.requiredRealm = requiredRealm;
  }

  public String getRequiredRealm() {
    return requiredRealm;
  }
}