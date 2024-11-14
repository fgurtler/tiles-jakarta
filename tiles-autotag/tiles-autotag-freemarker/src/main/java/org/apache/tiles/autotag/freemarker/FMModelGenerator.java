/*
 * $Id: FMModelGenerator.java 1643653 2014-12-07 06:47:59Z nlebas $
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
package org.apache.tiles.autotag.freemarker;

import java.util.Map;

import org.apache.tiles.autotag.generate.AbstractTemplateClassGenerator;
import org.apache.tiles.autotag.model.TemplateClass;
import org.apache.tiles.autotag.model.TemplateSuite;
import org.apache.velocity.app.VelocityEngine;

/**
 * Generates a single Freemarker directive model, given a template class.
 *
 * @version $Rev: 1643653 $ $Date: 2014-12-07 07:47:59 +0100 (Sun, 07 Dec 2014) $
 */
public class FMModelGenerator extends AbstractTemplateClassGenerator {

    /**
     * Constructor.
     *
     * @param velocityEngine The Velocity engine.
     */
    public FMModelGenerator(VelocityEngine velocityEngine) {
        super(velocityEngine);
    }

    @Override
    protected String getDirectoryName(String packageName,
            TemplateSuite suite, TemplateClass clazz, Map<String, String> parameters,
            String runtimeClass, String requestClass) {
        return packageName.replaceAll("\\.", "/");
    }

    @Override
    protected String getFilename(String packageName,
            TemplateSuite suite, TemplateClass clazz, Map<String, String> parameters,
            String runtimeClass, String requestClass) {
        return clazz.getTagClassPrefix() + "FMModel.java";
    }

    @Override
    protected String getTemplatePath(String packageName,
            TemplateSuite suite, TemplateClass clazz, Map<String, String> parameters,
            String runtimeClass, String requestClass) {
        return "/org/apache/tiles/autotag/freemarker/fmModel.vm";
    }
}
