/*
 * $Id: RegexpDefinitionPatternMatcherFactoryTest.java 795343 2009-07-18 11:26:09Z apetrelli $
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

package org.apache.tiles.definition.pattern.regexp;

import static org.junit.Assert.*;

import org.apache.tiles.Definition;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests {@link RegexpDefinitionPatternMatcherFactory}.
 *
 * @version $Rev: 795343 $ $Date: 2009-07-18 13:26:09 +0200 (Sat, 18 Jul 2009) $
 */
public class RegexpDefinitionPatternMatcherFactoryTest {

    /**
     * The object to test.
     */
    private RegexpDefinitionPatternMatcherFactory factory;

    /**
     * Sets up the object to test.
     */
    @Before
    public void setUp() {
        factory = new RegexpDefinitionPatternMatcherFactory();
    }

    /**
     * Test method for
     * {@link RegexpDefinitionPatternMatcherFactory#createDefinitionPatternMatcher(String, Definition)}
     * .
     */
    @Test
    public void testCreateDefinitionPatternMatcher() {
        assertTrue(factory.createDefinitionPatternMatcher("myPattern",
                new Definition()) instanceof RegexpDefinitionPatternMatcher);
    }
}
