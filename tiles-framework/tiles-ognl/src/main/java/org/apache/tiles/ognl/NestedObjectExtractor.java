/*
 * $Id: NestedObjectExtractor.java 817009 2009-09-20 11:26:26Z apetrelli $
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

package org.apache.tiles.ognl;

/**
 * Extracts an object using another object as a basis.
 *
 * @param <T> The type of the root object.
 * @version $Rev: 817009 $ $Date: 2009-09-20 13:26:26 +0200 (Sun, 20 Sep 2009) $
 * @since 2.2.0
 */
public interface NestedObjectExtractor<T> {

    /**
     * Extracts the nested object.
     *
     * @param obj The root object.
     * @return The extracted nested object.
     * @since 2.2.0
     */
    Object getNestedObject(T obj);
}
