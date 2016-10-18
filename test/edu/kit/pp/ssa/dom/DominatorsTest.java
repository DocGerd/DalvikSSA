/*
 * @(#)DominatorsTest.java
 */
package edu.kit.pp.ssa.dom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

/**
 *
 * @author Patrick Kuhn
 */
public class DominatorsTest {

    private Tree<Node, MyEdge<Node>> at;
    private Node start1;
    private Node n1;
    private Node n2;
    private Node n3;
    private Node n4;
    private Node n5;
    private Node n6;
    private Node n7;
    private Dominators<Node, MyEdge<Node>> dom;
    private Tree<Node, MyEdge<Node>> bt;
    private Node start2;
    private Node nb1;
    private Node nb2;
    private Node nb3;
    private Node nb4;
    private Node nb5;
    private Node nb6;
    private Node nb7;
    private Dominators<Node, MyEdge<Node>> domb;

    public DominatorsTest() {
        // first tree from book
        at = new Tree<>();
        n1 = new Node("n1");
        start1 = n1;
        n2 = new Node("n2");
        n3 = new Node("n3");
        n4 = new Node("n4");
        n5 = new Node("n5");
        n6 = new Node("n6");
        n7 = new Node("n7");

        at.addVertex(n1);
        at.addVertex(n2);
        at.addVertex(n3);
        at.addVertex(n4);
        at.addVertex(n5);
        at.addVertex(n6);
        at.addVertex(n7);

        at.addEdge(n1, n2);
        at.addEdge(n2, n3);
        at.addEdge(n2, n4);
        at.addEdge(n3, n5);
        at.addEdge(n3, n6);
        at.addEdge(n5, n7);
        at.addEdge(n6, n7);
        at.addEdge(n7, n2);

        dom = Dominators.compute(at, start1);

        // second tree from wikipedia
        bt = new Tree<>();
        nb1 = new Node("nb1");
        start2 = nb1;
        nb2 = new Node("nb2");
        nb3 = new Node("nb3");
        nb4 = new Node("nb4");
        nb5 = new Node("nb5");
        nb6 = new Node("nb6");
        nb7 = new Node("nb7");

        bt.addVertex(nb1);
        bt.addVertex(nb2);
        bt.addVertex(nb3);
        bt.addVertex(nb4);
        bt.addVertex(nb5);
        bt.addVertex(nb6);
        bt.addVertex(nb7);

        bt.addEdge(nb1, nb2);
        bt.addEdge(nb2, nb3);
        bt.addEdge(nb2, nb4);
        bt.addEdge(nb2, nb6);
        bt.addEdge(nb3, nb5);
        bt.addEdge(nb4, nb5);
        bt.addEdge(nb5, nb2);

        domb = Dominators.compute(bt, start2);
    }

    @Test
    public void testDomTreeBook() {
        System.out.println("Test DOM Tree from book");
        DomTree<Node> domtree = dom.getDominationTree();
        assert domtree.containsEdge(n1, n2) : "N1 -> N2 missing";
        assert domtree.containsEdge(n2, n3) : "N2 -> N3 missing";
        assert domtree.containsEdge(n2, n4) : "N2 -> N4 missing";
        assert domtree.containsEdge(n3, n5) : "N3 -> N5 missing";
        assert domtree.containsEdge(n3, n7) : "N3 -> N7 missing";
        assert domtree.containsEdge(n3, n6) : "N3 -> N6 missing";
        assert domtree.edgeSet().size() == 6 : "too many edges";
    }

    @Test
    public void testDomTreeWikipedia() {
        System.out.println("Test DOM Tree from wikipedia");
        DomTree<Node> domtree = domb.getDominationTree();
        assert domtree.containsEdge(nb1, nb2) : "NB1 -> NB2 missing";
        assert domtree.containsEdge(nb2, nb3) : "NB2 -> NB3 missing";
        assert domtree.containsEdge(nb2, nb4) : "NB2 -> NB4 missing";
        assert domtree.containsEdge(nb2, nb5) : "NB2 -> NB5 missing";
        assert domtree.containsEdge(nb2, nb6) : "NB2 -> NB6 missing";
        assert domtree.edgeSet().size() == 5 : "too many edges";
    }

    @Test
    public void testDF() {
        System.out.println("Test DF from Book");
        Map<Node, Set<Node>> df = dom.getDF();

        Map<Node, Set<Node>> expected = new HashMap<>();
        expected.put(n1, new HashSet<Node>());
        expected.put(n4, new HashSet<Node>());

        Set<Node> s2 = new HashSet<>();
        s2.add(n2);
        Set<Node> s7 = new HashSet<>();
        s7.add(n7);

        expected.put(n2, s2);
        expected.put(n3, s2);
        expected.put(n7, s2);

        expected.put(n5, s7);
        expected.put(n6, s7);

        assert df.equals(expected);
    }
}
