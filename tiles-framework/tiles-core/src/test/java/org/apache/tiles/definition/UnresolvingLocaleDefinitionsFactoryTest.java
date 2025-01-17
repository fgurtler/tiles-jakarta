/*
 * $Id: UnresolvingLocaleDefinitionsFactoryTest.java 891884 2009-12-17 20:43:12Z apetrelli $
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

import static org.easymock.EasyMock.*;
import static org.easymock.classextension.EasyMock.*;
import static org.junit.Assert.*;

import java.util.Locale;

import org.apache.tiles.Definition;
import org.apache.tiles.definition.dao.DefinitionDAO;
import org.apache.tiles.locale.LocaleResolver;
import org.apache.tiles.request.Request;
import org.junit.Test;

/**
 * Tests {@link UnresolvingLocaleDefinitionsFactory}.
 *
 * @version $Rev: 891884 $ $Date: 2009-12-17 21:43:12 +0100 (Thu, 17 Dec 2009) $
 */
public class UnresolvingLocaleDefinitionsFactoryTest {

    /**
     * Test method for {@link UnresolvingLocaleDefinitionsFactory#getDefinition(String, Request)}.
     */
    @SuppressWarnings("unchecked")
    @Test
    public void testGetDefinition() {
        DefinitionDAO<Locale> dao = createMock(DefinitionDAO.class);
        LocaleResolver localeResolver = createMock(LocaleResolver.class);
        UnresolvingLocaleDefinitionsFactory factory = new UnresolvingLocaleDefinitionsFactory();
        Request request = createMock(Request.class);
        Definition definition = createMock(Definition.class);
        Locale locale = Locale.ITALY;

        expect(localeResolver.resolveLocale(request)).andReturn(locale);
        expect(dao.getDefinition("myDefinition", locale)).andReturn(definition);

        replay(dao, localeResolver, request, definition);
        factory.setDefinitionDAO(dao);
        factory.setLocaleResolver(localeResolver);
        assertEquals(definition, factory.getDefinition("myDefinition", request));
        verify(dao, localeResolver, request, definition);
    }

}
