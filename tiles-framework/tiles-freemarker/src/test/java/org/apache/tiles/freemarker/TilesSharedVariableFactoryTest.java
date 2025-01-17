/*
 * $Id: TilesSharedVariableFactoryTest.java 1049683 2010-12-15 19:55:45Z apetrelli $
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
package org.apache.tiles.freemarker;

import static org.junit.Assert.*;

import org.junit.Test;

import freemarker.ext.beans.BeanModel;

/**
 * Tests {@link SharedVariableFactory}.
 *
 * @version $Rev: 1049683 $ $Date: 2010-12-15 20:55:45 +0100 (Wed, 15 Dec 2010) $
 */
public class TilesSharedVariableFactoryTest {

    /**
     * Test method for {@link org.apache.tiles.freemarker.TilesSharedVariableFactory#create()}.
     */
    @Test
    public void testCreate() {
        TilesSharedVariableFactory factory = new TilesSharedVariableFactory();
        assertTrue(factory.create() instanceof BeanModel);
    }

}
