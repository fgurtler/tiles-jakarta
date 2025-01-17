/*
 * $Id: TilesExceptionTest.java 832867 2009-11-04 20:16:23Z apetrelli $
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

package org.apache.tiles;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests {@link TilesException}.
 *
 * @version $Rev: 832867 $ $Date: 2009-11-04 21:16:23 +0100 (Wed, 04 Nov 2009) $
 */
public class TilesExceptionTest {

    /**
     * Test method for {@link org.apache.tiles.TilesException#TilesException()}.
     */
    @Test
    public void testTilesException() {
        TilesException exception = new TilesException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link org.apache.tiles.TilesException#TilesException(java.lang.String)}.
     */
    @Test
    public void testTilesExceptionString() {
        TilesException exception = new TilesException("my message");
        assertEquals("my message", exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link org.apache.tiles.TilesException#TilesException(java.lang.Throwable)}.
     */
    @Test
    public void testTilesExceptionThrowable() {
        Throwable cause = new Throwable();
        TilesException exception = new TilesException(cause);
        assertEquals(cause.toString(), exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    /**
     * Test method for {@link org.apache.tiles.TilesException#TilesException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testTilesExceptionStringThrowable() {
        Throwable cause = new Throwable();
        TilesException exception = new TilesException("my message", cause);
        assertEquals("my message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}
