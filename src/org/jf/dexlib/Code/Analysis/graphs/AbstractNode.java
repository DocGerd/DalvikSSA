/*
 * @(#)AbstractNode.java
 */
package org.jf.dexlib.Code.Analysis.graphs;

import edu.kit.pp.ssa.ssa.PHI;
import org.jf.dexlib.Code.Analysis.AnalyzedInstruction;

/**
 * An abstract node.
 * @author Patrick Kuhn
 */
public abstract class AbstractNode implements Node {

    @Override
    public boolean isInstruction() {
        return false;
    }

    @Override
    public boolean isEntry() {
        return false;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public boolean isPHI() {
        return false;
    }

    @Override
    public AnalyzedInstruction getInstruction() {
        throw new IllegalStateException("Not an instruction node. Use isInstruction()");
    }

    @Override
    public PHI getPHI() {
        throw new IllegalStateException("Not a phi node. Use isPHI()");
    }

    @Override
    public void changeVariableName(final int varOriginal, final String varNewName) {
        throw new UnsupportedOperationException("Not an instruction node. Use isInstruction()");
    }

    @Override
    public void changeDefinitionName(final String newName) {
        throw new UnsupportedOperationException("Not an instruction node. Use isInstruction()");
    }

    @Override
    public abstract String toString();
}
