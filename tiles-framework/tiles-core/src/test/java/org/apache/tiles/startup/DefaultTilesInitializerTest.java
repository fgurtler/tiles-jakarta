/*
 * $Id: DefaultTilesInitializerTest.java 833737 2009-11-07 19:17:09Z apetrelli $
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

package org.apache.tiles.startup;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

import org.apache.tiles.factory.BasicTilesContainerFactory;
import org.apache.tiles.request.ApplicationContext;
import org.junit.Test;

/**
 * Tests {@link DefaultTilesInitializer}.
 *
 * @version $Rev: 833737 $ $Date: 2009-11-07 20:17:09 +0100 (Sat, 07 Nov 2009) $
 */
public class DefaultTilesInitializerTest {

    /**
     * Test method for {@link DefaultTilesInitializer#createContainerFactory(ApplicationContext)}.
     */
    @Test
    public void testCreateContainerFactory() {
        ApplicationContext context = createMock(ApplicationContext.class);

        replay(context);
        DefaultTilesInitializer initializer = new DefaultTilesInitializer();
        assertTrue(initializer.createContainerFactory(context) instanceof BasicTilesContainerFactory);
        verify(context);
    }
}
