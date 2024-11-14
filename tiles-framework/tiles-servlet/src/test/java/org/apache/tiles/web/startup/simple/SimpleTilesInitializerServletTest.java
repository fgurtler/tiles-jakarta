/*
 * $Id: SimpleTilesInitializerServletTest.java 1058093 2011-01-12 11:49:02Z apetrelli $
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
package org.apache.tiles.web.startup.simple;

import static org.junit.Assert.*;

import org.apache.tiles.startup.DefaultTilesInitializer;
import org.junit.Test;

/**
 * Tests {@link SimpleTilesInitializerServlet}.
 *
 * @version $Rev: 1058093 $ $Date: 2011-01-12 12:49:02 +0100 (Wed, 12 Jan 2011) $
 */
public class SimpleTilesInitializerServletTest {

    /**
     * Test method for {@link SimpleTilesInitializerServlet#createTilesInitializer()}.
     */
    @Test
    public void testCreateTilesInitializer() {
        SimpleTilesInitializerServlet servlet = new SimpleTilesInitializerServlet();
        assertTrue(servlet.createTilesInitializer() instanceof DefaultTilesInitializer);
    }

}
