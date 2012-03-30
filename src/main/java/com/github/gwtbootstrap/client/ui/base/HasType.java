/*
 *  Copyright 2012 GWT Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui.base;

/**
 * Interface for widgets that have a type.
 * 
 * @since 2.0.2.0
 * 
 * @author Dominik Mayer
 */
public interface HasType<T extends Style> {

	/**
	 * Sets the type of the widget.
	 * 
	 * @param style
	 */
	void setType(T style);

	/**
	 * Sets the type of the widget based on the Bootstrap class name.
	 * 
	 * @param typeName
	 *            name of the class to add without the prefix. (Example: "error"
	 *            instead of "alert-error".)
	 */
	void setType(String typeName);
}