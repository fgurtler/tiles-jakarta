/*
 * $Id: CompatibilityPreparerFactoryTest.java 949253 2010-05-28 18:29:59Z apetrelli $
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

package org.apache.tiles.compat.preparer;

import junit.framework.TestCase;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;

/**
 * Tests {@link CompatibilityPreparerFactory}.
 *
 * @version $Rev: 949253 $ $Date: 2010-05-28 20:29:59 +0200 (Fri, 28 May 2010) $
 */
public class CompatibilityPreparerFactoryTest extends TestCase {

    /**
     * The factory to test.
     */
    private CompatibilityPreparerFactory factory;

    /** {@inheritDoc} */
    @Override
    protected void setUp() {
        factory = new CompatibilityPreparerFactory();
    }

    /**
     * Test method for
     * {@link org.apache.tiles.compat.preparer.CompatibilityPreparerFactory#createPreparer(java.lang.String)}
     * .
     */
    public void testCreatePreparer() {
        ViewPreparer preparer = factory.createPreparer("/my/url.do");
        assertTrue("The preparer is not an UrlPreparer",
                preparer instanceof UrlPreparer);
        preparer = factory.createPreparer(MockViewPreparer.class.getName());
        assertTrue("The preparer is not an class ViewPreparer",
                preparer instanceof MockViewPreparer);
    }

    /**
     * Mock view preparer to test preparer instantiation.
     */
    public static final class MockViewPreparer implements ViewPreparer {
        /** {@inheritDoc} */
        public void execute(Request tilesContext,
                AttributeContext attributeContext) {
            // Nothing here.
        }
    }
}
