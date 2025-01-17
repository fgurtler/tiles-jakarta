/*
 * $Id: TestDbTilesContainerFactory.java 891411 2009-12-16 20:06:48Z apetrelli $
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

package org.apache.tiles.test.db;

import java.util.Locale;

import javax.sql.DataSource;

import org.apache.tiles.definition.LocaleDefinitionsFactory;
import org.apache.tiles.definition.dao.DefinitionDAO;
import org.apache.tiles.factory.BasicTilesContainerFactory;
import org.apache.tiles.locale.LocaleResolver;
import org.apache.tiles.request.ApplicationContext;


/**
 * Test alternate Tiles container factory that uses a DB to store definitions.
 *
 * @version $Rev: 891411 $ $Date: 2009-12-16 21:06:48 +0100 (Wed, 16 Dec 2009) $
 */
public class TestDbTilesContainerFactory extends BasicTilesContainerFactory {

    /** {@inheritDoc} */
    @Override
    protected DefinitionDAO<Locale> createLocaleDefinitionDao(ApplicationContext applicationContext,
            LocaleResolver resolver) {
        LocaleDbDefinitionDAO definitionDao = new LocaleDbDefinitionDAO();
        definitionDao.setDataSource((DataSource) applicationContext
                .getApplicationScope().get("dataSource"));
        return definitionDao;
    }

    /** {@inheritDoc} */
    @Override
    protected LocaleDefinitionsFactory instantiateDefinitionsFactory(
            ApplicationContext applicationContext, LocaleResolver resolver) {
        return new LocaleDefinitionsFactory();
    }
}
