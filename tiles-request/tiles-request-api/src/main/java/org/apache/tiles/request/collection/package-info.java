/*
 * $Id: package-info.java 1810245 2017-10-01 01:38:49Z mck $
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
/**
 * Special collections and maps for attributes (like HTTP request
 * or session attributes).
 * These can be used to access another object's attributes through
 * a Map interface.
 * <ul>
 * <li> {@link org.apache.tiles.request.collection.ScopeMap} provides
 * full get/put/remove access to the attributes.
 * <li> {@link org.apache.tiles.request.collection.ReadOnlyEnumerationMap}
 * provides get-only access.
 * <li> {@link org.apache.tiles.request.collection.HeaderValuesMap}
 * provides get-only access to a multi-valued map (typically, headers).
 * </ul>
 */
package org.apache.tiles.request.collection;

