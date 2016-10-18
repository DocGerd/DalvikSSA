/*
 * @(#)Node.java
 */
package edu.kit.pp.ssa.dom;

import org.jf.dexlib.Code.Analysis.graphs.AbstractNode;

/**
 * A primitive node for testing.
 * @author Patrick Kuhn
 */
public class Node extends AbstractNode {

    /** ID of the node. */
    private final String id;

    /**
     * Create a new node object.
     * @param id id of the node
     */
    public Node(final String id) {
        super();
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
