/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.config.internal.source;

import ratpack.server.ServerConfigBuilder;

public final class SystemPropertiesConfigurationSource extends PropertiesConfigurationSource {

  public SystemPropertiesConfigurationSource() {
    this(ServerConfigBuilder.DEFAULT_PROP_PREFIX);
  }

  public SystemPropertiesConfigurationSource(String prefix) {
    super(prefix, System.getProperties());
  }
}