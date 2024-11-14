/*
 * $Id: NoSuchContainerExceptionTest.java 927573 2010-03-25 20:01:07Z apetrelli $
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
 * Tests {@link NoSuchContainerException}.
 *
 * @version $Rev: 927573 $ $Date: 2010-03-25 21:01:07 +0100 (Thu, 25 Mar 2010) $
 */
public class NoSuchContainerExceptionTest {

    /**
     * Test method for {@link org.apache.tiles.NoSuchContainerException#NoSuchContainerException()}.
     */
    @Test
    public void testNoSuchContainerException() {
        NoSuchContainerException exception = new NoSuchContainerException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link org.apache.tiles.NoSuchContainerException#NoSuchContainerException(java.lang.String)}.
     */
    @Test
    public void testNoSuchContainerExceptionString() {
        NoSuchContainerException exception = new NoSuchContainerException("my message");
        assertEquals("my message", exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link org.apache.tiles.NoSuchContainerException#NoSuchContainerException(java.lang.Throwable)}.
     */
    @Test
    public void testNoSuchContainerExceptionThrowable() {
        Throwable cause = new Throwable();
        NoSuchContainerException exception = new NoSuchContainerException(cause);
        assertEquals(cause.toString(), exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    /**
     * Test method for {@link org.apache.tiles.NoSuchContainerException#NoSuchContainerException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testNoSuchContainerExceptionStringThrowable() {
        Throwable cause = new Throwable();
        NoSuchContainerException exception = new NoSuchContainerException("my message", cause);
        assertEquals("my message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}
