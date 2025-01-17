/*
 * $Id: TilesRequestContextHolder.java 833737 2009-11-07 19:17:09Z apetrelli $
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

package org.apache.tiles.context;

import org.apache.tiles.request.Request;

/**
 * Holds in a {@link ThreadLocal} object a {@link Request}.
 *
 * @version $Rev: 833737 $ $Date: 2009-11-07 20:17:09 +0100 (Sat, 07 Nov 2009) $
 * @since 2.2.0
 */
public class TilesRequestContextHolder {

    /**
     * The Tiles request context holder.
     */
    private ThreadLocal<Request> requestHolder = new ThreadLocal<Request>();

    /**
     * Sets the Tiles request context to use.
     *
     * @param request The Tiles request.
     * @since 2.2.0
     */
    public void setTilesRequestContext(Request request) {
        requestHolder.set(request);
    }

    /**
     * Returns the Tiles request context to use.
     *
     * @return The Tiles request.
     * @since 2.2.0
     */
    public Request getTilesRequestContext() {
        return requestHolder.get();
    }
}
