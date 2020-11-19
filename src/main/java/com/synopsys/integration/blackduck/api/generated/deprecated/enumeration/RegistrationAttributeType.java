/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* RegistrationAttributeType is now called RegistrationAttributesAttributeType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RegistrationAttributeType {
	CODEBASE_MANAGED_LINES_OF_CODE,
	INDEXED_LINES_OF_CODE,
	MANAGED_CODEBASE_BYTES_NEW,
	USER_LIMIT,
	CUSTOM_PROJECT_LIMIT,
	PROJECT_RELEASE_LIMIT,
	CODE_LOCATION_LIMIT,
	CODE_LOCATION_BYTES_LIMIT;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}