/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.waveprotocol.wave.client.account.impl;

import org.waveprotocol.wave.client.account.Profile;
import org.waveprotocol.wave.client.account.ProfileManager;
import org.waveprotocol.wave.model.wave.ParticipantId;

/**
 * A {@link ProfileManager} that returns vacuous profiles.
 *
 * @author kalman@google.com (Benjamin Kalman)
 */
public final class ProfileManagerImpl extends AbstractProfileManager {

  @Override
  protected void requestProfile(ParticipantId participantId, RequestProfileCallback callback) {
    // Nothing to do
  }

  @Override
  public String getCurrentSessionId() {
    return "nosessionid";
  }

  @Override
  public ParticipantId getCurrentParticipantId() {
    return ParticipantId.ofUnsafe("dummy@example.com");
  }

  @Override
  protected void storeProfile(Profile profile) {

  }


}
