/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.osgi.web.wab.generator.internal.introspection;

import java.io.InputStream;

/**
 * @author Miguel Pastor
 * @author Raymond Augé
 */
public class ClassLoaderSource implements Source {

	public ClassLoaderSource(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	@Override
	public InputStream getResourceAsStream(String name) {
		return _classLoader.getResourceAsStream(name);
	}

	private final ClassLoader _classLoader;

}