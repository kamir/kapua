/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.registry.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.kapua.commons.core.ComponentProvider;
import org.eclipse.kapua.commons.jpa.AbstractEntityManagerFactory;
import org.eclipse.kapua.locator.inject.Service;

/**
 * Entity manager factory for the device module.
 *
 * @since 1.0
 */
@ComponentProvider
@Service(provides=DeviceEntityManagerFactory.class)
public class DeviceEntityManagerFactoryImpl extends AbstractEntityManagerFactory implements DeviceEntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-device";
    private static final String DATASOURCE_NAME = "kapua-dbpool";
    private static final Map<String, String> UNIQUE_CONSTRAINTS = new HashMap<>();

    /**
     * Constructs a new entity manager factory and configure it to use the device persistence unit.
     */
    public DeviceEntityManagerFactoryImpl() {
        super(PERSISTENCE_UNIT_NAME,
                DATASOURCE_NAME,
                UNIQUE_CONSTRAINTS);
    }
}
