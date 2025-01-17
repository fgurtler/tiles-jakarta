/*
 * $Id: FactoryNotFoundExceptitonTest.java 942880 2010-05-10 19:58:07Z apetrelli $
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

package org.apache.tiles.definition;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests {@link FactoryNotFoundException}.
 *
 * @version $Rev: 942880 $ $Date: 2010-05-10 21:58:07 +0200 (Mon, 10 May 2010) $
 */
public class FactoryNotFoundExceptitonTest {

    /**
     * Test method for {@link FactoryNotFoundException#FactoryNotFoundException()}.
     */
    @Test
    public void testFactoryNotFoundException() {
        FactoryNotFoundException exception = new FactoryNotFoundException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link FactoryNotFoundException#FactoryNotFoundException(java.lang.String)}.
     */
    @Test
    public void testFactoryNotFoundExceptionString() {
        FactoryNotFoundException exception = new FactoryNotFoundException("my message");
        assertEquals("my message", exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link FactoryNotFoundException#FactoryNotFoundException(java.lang.Throwable)}.
     */
    @Test
    public void testFactoryNotFoundExceptionThrowable() {
        Throwable cause = new Throwable();
        FactoryNotFoundException exception = new FactoryNotFoundException(cause);
        assertEquals(cause.toString(), exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    /**
     * Test method for {@link FactoryNotFoundException#FactoryNotFoundException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testFactoryNotFoundExceptionStringThrowable() {
        Throwable cause = new Throwable();
        FactoryNotFoundException exception = new FactoryNotFoundException("my message", cause);
        assertEquals("my message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}
