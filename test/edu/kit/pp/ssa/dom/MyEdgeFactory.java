/*
 * @(#)MyEdgeFactory.java
 */
package edu.kit.pp.ssa.dom;

import org.jgrapht.EdgeFactory;

/**
 * An edge factory for testing.
 * @author Patrick Kuhn
 */
public class MyEdgeFactory<V> implements EdgeFactory<V, MyEdge> {

    @Override
    public MyEdge createEdge(final V from, final V to) {
        return new MyEdge(from, to);
    }
}
