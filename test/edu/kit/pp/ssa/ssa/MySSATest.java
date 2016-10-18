/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kit.pp.ssa.ssa;

import edu.kit.pp.ssa.ssa.PHINode;
import edu.kit.pp.ssa.ssa.SSA;
import edu.kit.pp.ssa.dom.Dominators;
import edu.kit.pp.ssa.dom.Tree;
import java.util.HashSet;
import java.util.Set;

import org.jf.dexlib.Code.Analysis.graphs.Edge;
import org.jf.dexlib.Code.Analysis.graphs.EntryNode;
import org.jf.dexlib.Code.Analysis.graphs.ExitNode;
import org.jf.dexlib.Code.Analysis.graphs.InstructionNode;
import org.jf.dexlib.Code.Analysis.graphs.Node;
import org.jf.dexlib.Code.Opcode;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DirectedPseudograph;
import org.junit.Test;

/**
 *
 * @author Patrick Kuhn
 */
public class MySSATest {

    private DirectedPseudograph<Node, Edge> cfg = new Tree<>();
    private Node entry = new EntryNode();
    private Node n0 = new InstructionNode(Opcode.CONST_4, 0); // v0 = const/4()
    private Node n1 = new InstructionNode(Opcode.CONST_4, 1); // v1 = const/4()
    private Node n2 = new InstructionNode(Opcode.CONST_4, 2); // v2 = const/4()
    private Node n3 = new InstructionNode(Opcode.CONST_16, 3); // v3 = const/16()
    private Node n4 = new InstructionNode(Opcode.IF_GE, -1, 2, 3); // if-ge(v2, v3)
    private Node n5 = new InstructionNode(Opcode.CONST_16, 3); //v3 = const/16()
    private Node n6 = new InstructionNode(Opcode.IF_GE, -1, 1, 3); // if-ge(v1, v3)
    private Node n7 = new InstructionNode(Opcode.MOVE, 1, 0); // v1 = move(v0)
    private Node n8 = new InstructionNode(Opcode.ADD_INT_LIT8, 2, 2); // v2 = add-int/lit8(v2)
    private Node n9 = new InstructionNode(Opcode.GOTO, -1);
    private Node n10 = new InstructionNode(Opcode.MOVE, 1, 2);
    private Node n11 = new InstructionNode(Opcode.ADD_INT_LIT8, 2, 2);
    private Node n12 = new InstructionNode(Opcode.GOTO, -1);
    private Node n13 = new InstructionNode(Opcode.RETURN, -1, 1);
    private Node exit = new ExitNode();

    public MySSATest() {        
        addEdge(cfg, entry, n0);
        addEdge(cfg, n0, n1);
        addEdge(cfg, n1, n2);
        addEdge(cfg, n2, n3);
        addEdge(cfg, n3, n4);
        addEdge(cfg, n4, n5);
        addEdge(cfg, n5, n6);
        addEdge(cfg, n6, n7);
        addEdge(cfg, n7, n8);
        addEdge(cfg, n8, n9);
        addEdge(cfg, n9, n3);
        addEdge(cfg, n6, n10);
        addEdge(cfg, n10, n11);
        addEdge(cfg, n11, n12);
        addEdge(cfg, n12, n3);
        addEdge(cfg, n4, n13);
        addEdge(cfg, n13, exit);
        addEdge(cfg, entry, exit);
    }

    protected static <Y, Z> void addEdge(DirectedGraph<Y, Z> t, Y source, Y target) {
        if (!t.containsVertex(source)) {
            t.addVertex(source);
        }
        if (!t.containsVertex(target)) {
            t.addVertex(target);
        }
        t.addEdge(source, target);
    }

    /**
     * Test of compute method, of class SSA.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        // TODO
        DirectedPseudograph<Node, Edge> graph = cfg;
        Dominators<Node, Edge> dom = Dominators.compute(graph, entry);
        SSA<Node, Edge> result = SSA.compute(graph, dom);

        // check each definition has unique name
        Set<String> count = new HashSet<>();
        for (Node v : result.getSSAGraph().vertexSet()) {
            String def = null;
            if (v.isInstruction()) {
                def = ((InstructionNode) v).getDestinationRegister();
            } else if (v.isPHI()) {
                def = ((PHINode) v).getPHI().getDestination();
            }

            if (def != null) {
                if (count.contains(def)) {
                    assert false : "definition name not unique!";
                } else {
                    count.add(def);
                }
            }
        }

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
