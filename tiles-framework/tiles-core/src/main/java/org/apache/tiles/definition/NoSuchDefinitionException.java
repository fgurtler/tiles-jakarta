/*
 * $Id: NoSuchDefinitionException.java 1045365 2010-12-13 20:46:46Z apetrelli $
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

/**
 * Exception thrown when a definition is not found.
 *
 * @version $Rev: 1045365 $ $Date: 2010-12-13 21:46:46 +0100 (Mon, 13 Dec 2010) $
 */
public class NoSuchDefinitionException extends DefinitionsFactoryException {
    /**
     * Constructor.
     */
    public NoSuchDefinitionException() {
        super();
    }

    /**
     * Constructor.
     *
     * @param msg Message.
     */
    public NoSuchDefinitionException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     *
     * @param message Message.
     * @param e Cause.
     */
    public NoSuchDefinitionException(String message, Throwable e) {
        super(message, e);
    }

    /**
     * Constructor.
     *
     * @param e Cause.
     */
    public NoSuchDefinitionException(Throwable e) {
        super(e);
    }
}
