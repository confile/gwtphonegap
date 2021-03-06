/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtphonegap.client.file.browser.dto;

import java.io.Serializable;

import com.googlecode.gwtphonegap.client.file.Flags;


/**
 * @author Daniel Kurka
 * 
 */
public class FlagsDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2163117515521586650L;
	private boolean create;

	/**
	 * 
	 */
	//GWT
	@SuppressWarnings("unused")
	private FlagsDTO() {

	}

	public FlagsDTO(Flags flags) {
		this.create = flags.isCreate();
	}

	public boolean isCreate() {
		return create;
	}
}
