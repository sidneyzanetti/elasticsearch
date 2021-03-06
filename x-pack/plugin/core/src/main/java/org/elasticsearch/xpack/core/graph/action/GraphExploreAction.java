/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.graph.action;

import org.elasticsearch.action.Action;

public class GraphExploreAction extends Action<GraphExploreRequest, GraphExploreResponse> {

    public static final GraphExploreAction INSTANCE = new GraphExploreAction();
    public static final String NAME = "indices:data/read/xpack/graph/explore";

    private GraphExploreAction() {
        super(NAME);
    }

    @Override
    public GraphExploreResponse newResponse() {
        return new GraphExploreResponse();
    }
}