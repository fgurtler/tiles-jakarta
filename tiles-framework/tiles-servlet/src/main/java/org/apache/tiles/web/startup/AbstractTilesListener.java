/*
 * $Id: AbstractTilesListener.java 952763 2010-06-08 18:28:16Z apetrelli $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tiles.web.startup;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.tiles.request.servlet.ServletApplicationContext;
import org.apache.tiles.startup.TilesInitializer;

/**
 * Listener for the initialization of the Tiles container.
 *
 * @version $Rev: 952763 $ $Date: 2010-06-08 20:28:16 +0200 (Tue, 08 Jun 2010) $
 */
public abstract class AbstractTilesListener implements ServletContextListener {

    /**
     * The initializer object.
     *
     * @since 2.1.2
     */
    protected TilesInitializer initializer;

    /**
     * Initialize the TilesContainer and place it
     * into service.
     *
     * @param event The intercepted event.
     */
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        initializer = createTilesInitializer();
        initializer.initialize(new ServletApplicationContext(
                servletContext));
    }

    /**
     * Destroys the initializer.
     *
     * @param event The intercepted event.
     */
    public void contextDestroyed(ServletContextEvent event) {
        initializer.destroy();
    }

    /**
     * Creates a new instance of {@link TilesInitializer}. Implement it to use a
     * different initializer.
     *
     * @return The Tiles servlet-based initializer.
     * @since 2.2.0
     */
    protected abstract TilesInitializer createTilesInitializer();
}
