/*
 * $Id: CompleteAutoloadTilesListenerTest.java 799279 2009-07-30 14:25:12Z apetrelli $
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

package org.apache.tiles.extras.complete;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests {@link CompleteAutoloadTilesListener}.
 *
 * @version $Rev: 799279 $ $Date: 2009-07-30 16:25:12 +0200 (Thu, 30 Jul 2009) $
 */
public class CompleteAutoloadTilesListenerTest {

    /**
     * Test method for
     * {@link org.apache.tiles.extras.complete.CompleteAutoloadTilesListener#createTilesInitializer()}
     * .
     */
    @Test
    public void testCreateTilesInitializer() {
        CompleteAutoloadTilesListener listener = new CompleteAutoloadTilesListener();
        assertTrue(listener.createTilesInitializer() instanceof CompleteAutoloadTilesInitializer);
    }
}
