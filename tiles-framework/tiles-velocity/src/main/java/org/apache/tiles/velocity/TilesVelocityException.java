/*
 * $Id: TilesVelocityException.java 1035820 2010-11-16 21:26:24Z apetrelli $
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

package org.apache.tiles.velocity;

import org.apache.tiles.TilesException;

/**
 * Exception connected to the usage of Velocity and Tiles.
 *
 * @version $Rev: 1035820 $ $Date: 2010-11-16 22:26:24 +0100 (Tue, 16 Nov 2010) $
 * @since 2.2.0
 */
public class TilesVelocityException extends TilesException {

    /**
     * Constructor.
     *
     * @since 2.2.0
     */
    public TilesVelocityException() {
    }

    /**
     * Constructor.
     *
     * @param message The message of the exception.
     * @since 2.2.0
     */
    public TilesVelocityException(String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param e The cause of the exception.
     * @since 2.2.0
     */
    public TilesVelocityException(Throwable e) {
        super(e);
    }

    /**
     * Constructor.
     *
     * @param message The message of the exception.
     * @param e The cause of the exception.
     * @since 2.2.0
     */
    public TilesVelocityException(String message, Throwable e) {
        super(message, e);
    }
}
