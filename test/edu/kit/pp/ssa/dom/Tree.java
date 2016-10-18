/*
 * @(#)Tree.java
 */
package edu.kit.pp.ssa.dom;

import org.jgrapht.graph.DirectedPseudograph;

/**
 * A primitive tree for testing.
 * @author Patrick Kuhn
 */
public class Tree<V, E> extends DirectedPseudograph<V, E> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a tree object.
     */
    public Tree() {
        super(new MyEdgeFactory());
    }
}
