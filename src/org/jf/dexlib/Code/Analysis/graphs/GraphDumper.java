/*
 * @(#)GraphDumper.java
 */
package org.jf.dexlib.Code.Analysis.graphs;

import edu.kit.pp.ssa.ssa.SSABlockNode;
import edu.kit.pp.ssa.ssa.SSA;
import edu.kit.pp.ssa.dom.Dominators;
import java.io.FileNotFoundException;
import java.util.List;

import org.jf.dexlib.Code.Analysis.AnalyzedInstruction;

/**
 * Dumps graphics of the trees.
 * @author Patrick Kuhn
 */
public class GraphDumper {

    private final String prefix;
    private final boolean dumpCFG;
    private final boolean dumpDOM;
    private final boolean dumpSSA;
    private final boolean includeExc;
    public static final boolean STATISTICS_CSV = false;

    public GraphDumper(final String prefix, final boolean dumpCFG, final boolean dumpDOM, final boolean dumpSSA,
            final boolean includeExc) {
        this.prefix = prefix;
        this.dumpCFG = dumpCFG;
        this.dumpDOM = dumpDOM;
        this.dumpSSA = dumpSSA;
        this.includeExc = includeExc;
    }

    public void dump(final List<AnalyzedInstruction> instructions, final String name) throws FileNotFoundException {
        if (!dumpCFG && !dumpDOM && !dumpSSA) {
            return;
        }

        final String fileName = prefix + WriteGraphToDot.sanitizeFileName(name);

        CFG cfg = null;
        Dominators<Node, Edge> dom = null;
        SSA<Node, Edge> ssa = null;
        // TODO
        if (STATISTICS_CSV) {
            final int MAX = 1000;
            long avgCFG = 0;
            long avgDOM = 0;
            long avgSSA = 0;

            for (int i = 0; i < MAX; ++i) {
                long start;
                long end;
                start = System.nanoTime();
                cfg = CFG.build(instructions, name, includeExc);
                end = System.nanoTime();
                avgCFG += end - start;

                start = System.nanoTime();
                dom = Dominators.compute(cfg, cfg.getEntry());
                end = System.nanoTime();
                avgDOM += end - start;

                start = System.nanoTime();
                ssa = SSA.compute(cfg, dom);
                end = System.nanoTime();
                avgSSA += end - start;

                SSABlockNode.clear();
            }
            avgCFG /= MAX;
            avgDOM /= MAX;
            avgSSA /= MAX;


            if (cfg != null && dom != null && ssa != null) {
                // filename, vertices, edges, time_cfg, time_dom, time_cdg, phis
                System.out.println();
                System.out.print(fileName);
                System.out.print(", " + cfg.vertexSet().size() + ", " + cfg.edgeSet().size());
                System.out.print(", " + avgCFG);

                System.out.print(", " + avgDOM);

                System.out.print(", " + avgSSA);
                int phis = 0;
                for (Node n : ssa.getSSAGraph().vertexSet()) {
                    if (n.isPHI()) {
                        ++phis;
                    }
                }
                System.out.print(", " + phis);
            } else {
                throw new AssertionError();
            }
        } else {
            cfg = CFG.build(instructions, name, includeExc);

            if (dumpCFG) {
                WriteGraphToDot.write(cfg, fileName + ".cfg.dot");
            }
            dom = Dominators.compute(cfg, cfg.getEntry());
            if (dumpDOM) {
                WriteGraphToDot.write(dom.getDominationTree(), fileName + ".dom.dot");
                WriteMapToTxt.write(dom.getDF(), fileName + ".txt");
            }
            ssa = SSA.compute(cfg, dom);
            if (dumpSSA) {
                WriteGraphToDot.write(ssa.getSSAGraph(), fileName + ".ssa.dot");
                WriteGraphToDot.write(ssa.getSSAGraphBlocks(), fileName + ".ssaB.dot");
            }
        }

        SSABlockNode.clear();
    }
}
