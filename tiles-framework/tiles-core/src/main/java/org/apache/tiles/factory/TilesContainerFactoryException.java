/*
 * $Id: TilesContainerFactoryException.java 943645 2010-05-12 19:33:19Z apetrelli $
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
package org.apache.tiles.factory;

import org.apache.tiles.TilesException;

/**
 * Indicates that something went wrong in {@link TilesContainerFactory} use.
 *
 * @version $Rev: 943645 $ $Date: 2010-05-12 21:33:19 +0200 (Wed, 12 May 2010) $
 * @since 2.1.0
 */
public class TilesContainerFactoryException extends TilesException {

    /**
     * Constructor.
     *
     * @since 2.1.0
     */
    public TilesContainerFactoryException() {
    }

    /**
     * Constructor.
     *
     * @param message The detail message.
     * @since 2.1.0
     */
    public TilesContainerFactoryException(String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param e The exception to be wrapped.
     * @since 2.1.0
     */
    public TilesContainerFactoryException(Throwable e) {
        super(e);
    }

    /**
     * Constructor.
     *
     * @param message The detail message.
     * @param e The exception to be wrapped.
     * @since 2.1.0
     */
    public TilesContainerFactoryException(String message, Throwable e) {
        super(message, e);
    }

}
