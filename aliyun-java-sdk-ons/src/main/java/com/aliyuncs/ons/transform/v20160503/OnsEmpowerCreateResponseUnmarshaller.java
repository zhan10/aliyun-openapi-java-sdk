/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ons.transform.v20160503;

import com.aliyuncs.ons.model.v20160503.OnsEmpowerCreateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsEmpowerCreateResponseUnmarshaller {

	public static OnsEmpowerCreateResponse unmarshall(OnsEmpowerCreateResponse onsEmpowerCreateResponse, UnmarshallerContext context) {
		
		onsEmpowerCreateResponse.setRequestId(context.stringValue("OnsEmpowerCreateResponse.RequestId"));
		onsEmpowerCreateResponse.setHelpUrl(context.stringValue("OnsEmpowerCreateResponse.HelpUrl"));
	 
	 	return onsEmpowerCreateResponse;
	}
}