/*
 * $Id: TemplateGeneratorFactory.java 1044707 2010-12-11 20:35:57Z apetrelli $
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
package org.apache.tiles.autotag.generate;

/**
 * Creates a new template generator.
 *
 * @version $Rev: 1044707 $ $Date: 2010-12-11 21:35:57 +0100 (Sat, 11 Dec 2010) $
 */
public interface TemplateGeneratorFactory {

    /**
     * Creates a template generator.
     *
     * @return The newly created template generator.
     */
    TemplateGenerator createTemplateGenerator();
}
