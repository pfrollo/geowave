/**
 * Copyright (c) 2013-2019 Contributors to the Eclipse Foundation
 *
 * <p> See the NOTICE file distributed with this work for additional information regarding copyright
 * ownership. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
 * available at http://www.apache.org/licenses/LICENSE-2.0.txt
 */
package org.locationtech.geowave.core.store.cli.config;

import org.locationtech.geowave.core.cli.annotations.GeowaveOperation;
import org.locationtech.geowave.core.cli.api.OperationParams;
import org.locationtech.geowave.core.cli.operations.config.ConfigSection;
import org.locationtech.geowave.core.store.cli.remote.options.DataStorePluginOptions;
import com.beust.jcommander.Parameters;

@GeowaveOperation(name = "rmstore", parentOperation = ConfigSection.class)
@Parameters(commandDescription = "Remove store from Geowave configuration")
public class RemoveStoreCommand extends AbstractRemoveCommand {

  @Override
  public String computeResults(final OperationParams params) throws Exception {

    // Search for properties relevant to the given name
    pattern = DataStorePluginOptions.getStoreNamespace(getEntryName());
    return super.computeResults(params, pattern);
  }

  @Override
  public void execute(final OperationParams params) throws Exception {
    computeResults(params);
  }
}
