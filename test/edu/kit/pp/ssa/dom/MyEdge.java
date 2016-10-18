/*
 * @(#)MyEdge.java
 */
package edu.kit.pp.ssa.dom;

import org.jf.dexlib.Code.Analysis.graphs.Edge;

/**
 *
 * @author Patrick Kuhn
 */
public class MyEdge<V> implements Edge {

    private V source;
    private V target;
    private Kind kind;

    public MyEdge(final V source, final V target) {
        this(source, target, Kind.CF);
    }

    public MyEdge(final V source, final V target, final Kind kind) {
        this.source = source;
        this.target = target;
        this.kind = kind;
    }

    @Override
    public org.jf.dexlib.Code.Analysis.graphs.Node getSource() {
        return (org.jf.dexlib.Code.Analysis.graphs.Node) source;
    }

    @Override
    public org.jf.dexlib.Code.Analysis.graphs.Node getTarget() {
        return (org.jf.dexlib.Code.Analysis.graphs.Node) target;
    }

    @Override
    public Kind getKind() {
        return kind;
    }
}
