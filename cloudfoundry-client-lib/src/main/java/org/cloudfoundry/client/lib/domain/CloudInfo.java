/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.lib.domain;

public class CloudInfo {

	private String name;
	private String support;
	private String build;
	private String version;
	private String description;
	private String authorizationEndpoint;
    private String loggingEndpoint;

	public CloudInfo() {
	}

	public CloudInfo(String name, String support, String build, String version, String description,
	                 String authorizationEndpoint, String loggingEndpoint) {
		this.name = name;
		this.support = support;
		this.authorizationEndpoint = authorizationEndpoint;
		this.loggingEndpoint = loggingEndpoint;
		this.build = build;
		this.version = version;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getSupport() {
		return support;
	}

	public String getAuthorizationEndpoint() {
		return authorizationEndpoint;
	}
	
	public String getLoggingEndpoint() {
	    return loggingEndpoint;
	}

	public String getBuild() {
		return build;
	}

	public String getDescription() {
		return description;
	}

	public String getVersion() {
		return version;
	}
}
